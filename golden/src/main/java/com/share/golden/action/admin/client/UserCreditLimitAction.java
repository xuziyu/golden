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
import com.share.golden.entity.UserCreditLimit;
import com.share.golden.entity.UserCreditLimitExample;
import com.share.golden.framework.entity.PageVO;
import com.share.golden.framework.entity.PageWrap4EasyUI;
import com.share.golden.framework.entity.ResponseContent;
import com.share.golden.service.admin.IUserCreditLimitService;

@Controller
@RequestMapping("/admin/UserCreditLimit/")
public class UserCreditLimitAction {
	@Autowired
	private IUserCreditLimitService userCreditLimitService;
	@RequestMapping("list")
	public String list(HttpServletRequest request , HttpServletResponse response){
		//传一个主键id查询单个对象。
		request.setAttribute("userCreditLimit",userCreditLimitService.select(request.getParameter("limitCode")));
		return "admin/user/user_credit_limit_list";
	}
	@RequestMapping("page")
	public String page(HttpServletRequest request , HttpServletResponse response){
		HttpSession session = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest().getSession();
		/**
		 * ----------补充----------------
		 */
		return "admin/user/user_credit_limit_page";
	}
	@RequestMapping("save")
	public String save(UserCreditLimit userCreditLimit , HttpServletRequest request , HttpServletResponse response){
		/**
		 * ----------补充----------------
		 */
		userCreditLimitService.update(userCreditLimit);
		return "redirect:page.action";
	}
	@RequestMapping("edit")
	public String edit(HttpServletRequest request , HttpServletResponse response){
		String limitCode = request.getParameter("limitCode");
		if (StringUtils.isEmpty(limitCode)) {
		} else {
			UserCreditLimit userCreditLimit = userCreditLimitService.select(limitCode);
			request.setAttribute("userCreditLimit", userCreditLimit);
		}

		return "admin/user/user_credit_limit_edit";
	}
	@RequestMapping("page_json")
	@ResponseBody
	public PageWrap4EasyUI pagejson(HttpServletRequest request , HttpServletResponse response){
		String userId = request.getParameter("userId");
		String creditLimit = request.getParameter("creditLimit");
		String creditGrade = request.getParameter("creditGrade");

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

		

		UserCreditLimitExample userCreditLimitExample = new UserCreditLimitExample();
		com.share.golden.entity.UserCreditLimitExample.Criteria criteria = userCreditLimitExample.createCriteria();
		if(!StringUtils.isEmpty(userId)){
			criteria.andUserIdLike(userId + "%");
		}
		if(!StringUtils.isEmpty(creditLimit)){
			criteria.andCreditLimitLike(creditLimit + "%");
		}
		if(!StringUtils.isEmpty(creditGrade)){
			criteria.andCreditGradeLike(creditGrade + "%");
		}

		
		Page<Object> page = PageHelper.startPage(pageVO.getPageIndex() + 1, pageVO.getPageSize());
		List<UserCreditLimit> listUserCreditLimit = (List<UserCreditLimit>) userCreditLimitService.list(userCreditLimitExample);
		pageVO.setRecordCount((int) page.getTotal());
		pageVO.setList(listUserCreditLimit);
		return new PageWrap4EasyUI(pageVO);
	}
	@RequestMapping("deleteAj")
	@ResponseBody
	public ResponseContent delete(HttpServletRequest request , HttpServletResponse response){
		ResponseContent responseContent = new ResponseContent();
		responseContent.setSuccess(true);
		try{
			userCreditLimitService.delete(request.getParameter("limitCode"));
		}catch(Exception ex){
			responseContent.setSuccess(false);
			responseContent.setMessage("删除失败");
		}
		return responseContent ;
	}
}
