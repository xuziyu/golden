package com.share.golden.action.admin.client;

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
import com.share.golden.entity.BasInvestmentInformation;
import com.share.golden.entity.BasInvestmentInformationExample;
import com.share.golden.entity.BasUser;
import com.share.golden.entity.BasUserExample;
import com.share.golden.entity.BasUserExample.Criteria;
import com.share.golden.framework.entity.PageVO;
import com.share.golden.framework.entity.PageWrap4EasyUI;
import com.share.golden.framework.entity.ResponseContent;
import com.share.golden.service.admin.IBasInvestmentInformationService;

@Controller
@RequestMapping("/admin/InvestmentInformation/")
public class InvestmentInformationAction {
	@Autowired
	private IBasInvestmentInformationService investmentInformationService;
	@RequestMapping("list")
	public String list(HttpServletRequest request , HttpServletResponse response){
		//传一个主键id查询单个对象。
		request.setAttribute("basInvestmentInformation",investmentInformationService.select(request.getParameter("investorId")));
		return "admin/bas/bas_investment_information_list";
	}
	@RequestMapping("page")
	public String page(HttpServletRequest request , HttpServletResponse response){
		HttpSession session = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest().getSession();
		/**
		 * ----------补充----------------
		 */
		return "admin/bas/bas_investment_information_page";
	}
	@RequestMapping("save")
	public String save(BasInvestmentInformation basInvestmentInformation , HttpServletRequest request , HttpServletResponse response){
		/**
		 * ----------补充----------------
		 */
		investmentInformationService.update(basInvestmentInformation);
		return "redirect:page.action";
	}
	@RequestMapping("edit")
	public String edit(HttpServletRequest request , HttpServletResponse response){
		String investorId = request.getParameter("investorId");
		if (StringUtils.isEmpty(investorId)) {
		} else {
			BasInvestmentInformation basInvestmentInformation = investmentInformationService.select(investorId);
			request.setAttribute("basInvestmentInformation", basInvestmentInformation);
		}

		return "admin/bas/bas_investment_information_edit";
	}
	@RequestMapping("page_json")
	@ResponseBody
	public PageWrap4EasyUI pagejson(HttpServletRequest request , HttpServletResponse response){
		String userId = request.getParameter("userId");
		String tenderId = request.getParameter("tenderId");
		String investorMoney = request.getParameter("investorMoney");
		String investorStatus = request.getParameter("investorStatus");
		String investorStyle = request.getParameter("investorStyle");
		String brrowStatus = request.getParameter("brrowStatus");
		String investorRest = request.getParameter("investorRest");
		String profitModel = request.getParameter("profitModel");
		String profitMoney = request.getParameter("profitMoney");
		String investorDate = request.getParameter("investorDate");
		String replayDate = request.getParameter("replayDate");
		String investorType = request.getParameter("investorType");

		PageVO pageVO = new PageVO();
		if (StringUtils.isEmpty(request.getParameter("page"))) {
			pageVO.setPageIndex(0);
		} else {
			pageVO.setPageIndex(Integer.parseInt(request.getParameter("page")) - 1);
		}

		if (!StringUtils.isEmpty(request.getParameter("rows"))) {
			pageVO.setPageSize(Integer.parseInt(request.getParameter("rows")));
		}else{
			pageVO.setPageSize(10);
		}

		

		BasInvestmentInformationExample basInvestmentInformationExample = new BasInvestmentInformationExample();
		com.share.golden.entity.BasInvestmentInformationExample.Criteria criteria = basInvestmentInformationExample.createCriteria();
		if(!StringUtils.isEmpty(userId)){
			criteria.andUserIdLike(userId + "%");
		}
		if(!StringUtils.isEmpty(tenderId)){
			criteria.andTenderIdLike(tenderId + "%");
		}
//		if(!StringUtils.isEmpty(investorMoney)){
//			criteria.andInvestorMoneyBetween(null, investorMoney);
//		}
		if(!StringUtils.isEmpty(investorStatus)){
			criteria.andInvestorStatusLike(investorStatus + "%");
		}
		if(!StringUtils.isEmpty(investorStyle)){
			criteria.andInvestorStyleLike(investorStyle + "%");
		}
		if(!StringUtils.isEmpty(brrowStatus)){
			criteria.andBrrowStatusLike(brrowStatus + "%");
		}
		if(!StringUtils.isEmpty(investorRest)){
			criteria.andInvestorRestLike(investorRest + "%");
		}
		if(!StringUtils.isEmpty(profitModel)){
			criteria.andProfitModelLike(profitModel + "%");
		}
//		if(!StringUtils.isEmpty(profitMoney)){
//			criteria.andProfitMoneyBetween(null, null);
//		}
//		if(!StringUtils.isEmpty(investorDate)){
//			criteria.andInvestorDateEqualTo(null);
//		}
		if(!StringUtils.isEmpty(replayDate)){
			criteria.andReplayDateLike(replayDate + "%");
		}
		if(!StringUtils.isEmpty(investorType)){
			criteria.andInvestorTypeLike(investorType + "%");
		}
		
		Page<Object> page = PageHelper.startPage(pageVO.getPageIndex() + 1, pageVO.getPageSize());
		List<BasInvestmentInformation> listBasInvestmentInformation = (List<BasInvestmentInformation>) investmentInformationService.list(basInvestmentInformationExample);
		pageVO.setRecordCount((int) page.getTotal());
		pageVO.setList(listBasInvestmentInformation);
		return new PageWrap4EasyUI(pageVO);
	}
	@RequestMapping("deleteAj")
	@ResponseBody
	public ResponseContent delete(HttpServletRequest request , HttpServletResponse response){
		ResponseContent responseContent = new ResponseContent();
		responseContent.setSuccess(true);
		try{
			investmentInformationService.delete(request.getParameter("investorId"));
		}catch(Exception ex){
			responseContent.setSuccess(false);
			responseContent.setMessage("删除失败");
		}
		return responseContent ;
	}
}
