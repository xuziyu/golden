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
import com.share.golden.entity.UserAccountAssets;
import com.share.golden.entity.UserAccountAssetsExample;
import com.share.golden.framework.StringUtil.Util;
import com.share.golden.framework.entity.PageVO;
import com.share.golden.framework.entity.PageWrap4EasyUI;
import com.share.golden.framework.entity.ResponseContent;
import com.share.golden.service.admin.IUserAccountAssetsService;

@Controller
@RequestMapping("/admin/UserAccountAssets/")
public class UserAccountAssetsAction {
	@Autowired
	private IUserAccountAssetsService accountAssetsService;
	@RequestMapping("list")
	public String list(HttpServletRequest request , HttpServletResponse response){
		//传一个主键id查询单个对象。
		request.setAttribute("userAccountAssets",accountAssetsService.select(Util.strToBigDecimal(request.getParameter("accountId"))));
		return "admin/user/user_account_assets_list";
	}
	@RequestMapping("page")
	public String page(HttpServletRequest request , HttpServletResponse response){
		HttpSession session = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest().getSession();
		/**
		 * ----------补充----------------
		 */
		return "admin/user/user_account_assets_page";
	}
	@RequestMapping("save")
	public String save(UserAccountAssets userAccountAssets , HttpServletRequest request , HttpServletResponse response){
		/**
		 * ----------补充----------------
		 */
		accountAssetsService.update(userAccountAssets);
		return "redirect:page.action";
	}
	@RequestMapping("edit")
	public String edit(HttpServletRequest request , HttpServletResponse response){
		String accountId = request.getParameter("accountId");
		if (StringUtils.isEmpty(accountId)) {
		} else {
			UserAccountAssets userAccountAssets = accountAssetsService.select(Util.strToBigDecimal(accountId));
			request.setAttribute("userAccountAssets", userAccountAssets);
		}

		return "admin/user/user_account_assets_edit";
	}
	@RequestMapping("page_json")
	@ResponseBody
	public PageWrap4EasyUI pagejson(HttpServletRequest request , HttpServletResponse response){
		String userId = request.getParameter("userId");
		String accountBalance = request.getParameter("accountBalance");
		String accountFreeze = request.getParameter("accountFreeze");
		String accountDue = request.getParameter("accountDue");
		String accountPaid = request.getParameter("accountPaid");
		String totalMoney = request.getParameter("totalMoney");


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

		

		UserAccountAssetsExample userAccountAssetsExample = new UserAccountAssetsExample();
		com.share.golden.entity.UserAccountAssetsExample.Criteria criteria = userAccountAssetsExample.createCriteria();
		if(!StringUtils.isEmpty(userId)){
			criteria.andUserIdLike(userId + "%");
		}
		if(!StringUtils.isEmpty(accountBalance)){
			criteria.andAccountBalanceLike(accountBalance + "%");
		}
		if(!StringUtils.isEmpty(accountFreeze)){
			criteria.andAccountFreezeLike(accountFreeze + "%");
		}
		if(!StringUtils.isEmpty(accountDue)){
			criteria.andAccountDueLike(accountDue + "%");
		}
		if(!StringUtils.isEmpty(accountPaid)){
			criteria.andAccountPaidLike(accountPaid + "%");
		}
		if(!StringUtils.isEmpty(totalMoney)){
			criteria.andTotalMoneyLike(totalMoney + "%");
		}

		
		Page<Object> page = PageHelper.startPage(pageVO.getPageIndex() + 1, pageVO.getPageSize());
		List<UserAccountAssets> listUserAccountAssets = (List<UserAccountAssets>) accountAssetsService.list(userAccountAssetsExample);
		pageVO.setRecordCount((int) page.getTotal());
		pageVO.setList(listUserAccountAssets);
		return new PageWrap4EasyUI(pageVO);
	}
	@RequestMapping("deleteAj")
	@ResponseBody
	public ResponseContent delete(HttpServletRequest request , HttpServletResponse response){
		ResponseContent responseContent = new ResponseContent();
		responseContent.setSuccess(true);
		try{
			accountAssetsService.delete(Util.strToBigDecimal(request.getParameter("accountId")));
		}catch(Exception ex){
			responseContent.setSuccess(false);
			responseContent.setMessage("删除失败");
		}
		return responseContent ;
	}
}
