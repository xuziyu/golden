package com.share.golden.action.admin.loan;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.share.golden.entity.BasProduct;
import com.share.golden.entity.BasProductExample;
import com.share.golden.framework.entity.PageVO;
import com.share.golden.framework.entity.PageWrap4EasyUI;
import com.share.golden.framework.entity.ResponseContent;
import com.share.golden.service.admin.IBasProductService;

@Controller
@RequestMapping("/admin/BasProduct/")
public class BasProductAction {
	@Autowired
	private IBasProductService basProductService;

	@RequestMapping("list")
	public String list(HttpServletRequest request, HttpServletResponse response) {
		// 传一个主键id查询单个对象。
		request.setAttribute("basProduct", basProductService.selectByPrimaryKey(request.getParameter("productId")));
		return "admin/bas/bas_product_list";
	}

	@RequestMapping("page")
	public String page(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest()
				.getSession();

		return "admin/bas/bas_product_page";
	}

	@RequestMapping("save")
	public String save(BasProduct basProduct, HttpServletRequest request, HttpServletResponse response) {
		basProductService.updateByPrimaryKey(basProduct);
		return "redirect:page.action";
	}

	@RequestMapping("edit")
	public String edit(HttpServletRequest request, HttpServletResponse response) {
		String productId = request.getParameter("productId");
		if (StringUtils.isEmpty(productId)) {
		} else {
			BasProduct basProduct = basProductService.selectByPrimaryKey(productId);
			request.setAttribute("basProduct", basProduct);
		}

		return "admin/bas/bas_product_edit";
	}

	@RequestMapping("page_json")
	@ResponseBody
	public PageWrap4EasyUI pagejson(BasProduct basProduct ,HttpServletRequest request, HttpServletResponse response) {
		BigDecimal productMoney =basProduct.getProductMoney();
		String productIncome =basProduct.getProductIncome();
		Date productTime =basProduct.getProductTime();
		String productType =basProduct.getProductType();
		String productWay =basProduct.getProductWay();
		Date pcount =basProduct.getPcount();
		String productProgress =basProduct.getProductProgress();
		String productSaveway =basProduct.getProductSaveway();
		String productRateben =basProduct.getProductRateben();
		Date productPublishTime =basProduct.getProductPublishTime();
		String productName =basProduct.getProductName();
		BigDecimal productTotalMoney =basProduct.getProductTotalMoney();
		String investmentScope =basProduct.getInvestmentScope();
		String useOfProceeds =basProduct.getUseOfProceeds();
		String productState =basProduct.getProductState();
		String productPicture =basProduct.getProductPicture();
		String produceId =basProduct.getProduceId();
		String productDesc =basProduct.getProductDesc();
		String productSafe =basProduct.getProductSafe();

		PageVO pageVO = new PageVO();
		if (StringUtils.isEmpty(request.getParameter("page"))) {
			pageVO.setPageIndex(0);
		} else {
			pageVO.setPageIndex(Integer.parseInt(request.getParameter("page")) - 1);
		}

		if (!StringUtils.isEmpty(request.getParameter("rows"))) {
			pageVO.setPageSize(Integer.parseInt(request.getParameter("rows")));
		} else {
			pageVO.setPageSize(10);
		}

		BasProductExample basProductExample = new BasProductExample();
		com.share.golden.entity.BasProductExample.Criteria criteria = basProductExample.createCriteria();
		if (!StringUtils.isEmpty(productMoney)) {
			criteria.andProductMoneyBetween(null, null);
		}
		if (!StringUtils.isEmpty(productIncome)) {
			criteria.andProductIncomeLike(productIncome + "%");
		}
		if (!StringUtils.isEmpty(productTime)) {
			criteria.andProductTimeBetween(null, null);
		}
		if (!StringUtils.isEmpty(productType)) {
			criteria.andProductTypeLike(productType + "%");
		}
		if (!StringUtils.isEmpty(productWay)) {
			criteria.andProductWayLike(productWay + "%");
		}
		if (!StringUtils.isEmpty(pcount)) {
			criteria.andPcountBetween(null, null);
		}
		if (!StringUtils.isEmpty(productProgress)) {
			criteria.andProductProgressLike(productProgress + "%");
		}
		if (!StringUtils.isEmpty(productSaveway)) {
			criteria.andProductSavewayLike(productSaveway + "%");
		}
		if (!StringUtils.isEmpty(productRateben)) {
			criteria.andProductRatebenLike(productRateben + "%");
		}
		if (!StringUtils.isEmpty(productPublishTime)) {
			criteria.andProductPublishTimeBetween(null, null);
		}
		if (!StringUtils.isEmpty(productName)) {
			criteria.andProductNameLike(productName + "%");
		}
		if (!StringUtils.isEmpty(productTotalMoney)) {
			criteria.andProductTotalMoneyBetween(null, null);
		}
		if (!StringUtils.isEmpty(investmentScope)) {
			criteria.andInvestmentScopeLike(investmentScope + "%");
		}
		if (!StringUtils.isEmpty(useOfProceeds)) {
			criteria.andUseOfProceedsLike(useOfProceeds + "%");
		}
		if (!StringUtils.isEmpty(productState)) {
			criteria.andProductStateLike(productState + "%");
		}
		if (!StringUtils.isEmpty(productPicture)) {
			criteria.andProductPictureLike(productPicture + "%");
		}
		if (!StringUtils.isEmpty(produceId)) {
			criteria.andProduceIdLike(produceId + "%");
		}
		if (!StringUtils.isEmpty(productDesc)) {
			criteria.andProductDescLike(productDesc + "%");
		}
		if (!StringUtils.isEmpty(productSafe)) {
			criteria.andProductSafeLike(productSafe + "%");
		}


		Page<Object> page = PageHelper.startPage(pageVO.getPageIndex() + 1, pageVO.getPageSize());
		List<BasProduct> listBasProduct = (List<BasProduct>) basProductService.selectByExample(basProductExample);
		pageVO.setRecordCount((int) page.getTotal());
		pageVO.setList(listBasProduct);
		return new PageWrap4EasyUI(pageVO);
	}

	@RequestMapping("deleteAj")
	@ResponseBody
	public ResponseContent delete(HttpServletRequest request, HttpServletResponse response) {
		ResponseContent responseContent = new ResponseContent();
		responseContent.setSuccess(true);
		try {
			basProductService.delete(request.getParameter("productId"));
		} catch (Exception ex) {
			responseContent.setSuccess(false);
			responseContent.setMessage("删除失败");
		}
		return responseContent;
	}
}
