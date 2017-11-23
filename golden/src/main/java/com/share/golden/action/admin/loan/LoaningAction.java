package com.share.golden.action.admin.loan;

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
import com.share.golden.entity.UserApplyForLimit;
import com.share.golden.entity.UserApplyForLimitExample;
import com.share.golden.entity.UserApplyForLimitExample.Criteria;
import com.share.golden.entity.UserRealName;
import com.share.golden.framework.entity.PageVO;
import com.share.golden.framework.entity.PageWrap4EasyUI;
import com.share.golden.framework.entity.ResponseContent;
import com.share.golden.service.admin.ILoaningService;

@Controller
@RequestMapping("/admin/Loaning/")
public class LoaningAction {
@Autowired 
private ILoaningService loaningService;
@RequestMapping("ing_page_json")
@ResponseBody
public PageWrap4EasyUI beforeLoan(UserRealName userRealName ,HttpServletRequest request,HttpServletResponse resp){
	System.out.println("进入ajax");
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
	
	UserApplyForLimitExample userApplyForLimitExample = new UserApplyForLimitExample();
    Criteria  criteria= userApplyForLimitExample.createCriteria();

    
    String userId=request.getParameter("userId");
   
    if(!StringUtils.isEmpty(userId)){
		criteria.andUserIdLike(userId + "%");
	}
	
	Page<Object> page = PageHelper.startPage(pageVO.getPageIndex() + 1, pageVO.getPageSize());
	List<UserApplyForLimit> listBasUser = loaningService.UserApplyForLimitQuery(userApplyForLimitExample);
	pageVO.setRecordCount((int) page.getTotal());
	pageVO.setList(listBasUser);
	return new PageWrap4EasyUI(pageVO);
	
}
@RequestMapping("page")
public String page(HttpServletRequest request , HttpServletResponse response){
	HttpSession session = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest().getSession();
	
	return "admin/bas/loaning";
}
@RequestMapping("delete")
@ResponseBody
public ResponseContent delete(HttpServletRequest request , HttpServletResponse response){
	ResponseContent responseContent=new ResponseContent();
	responseContent.setSuccess(true);
	try {
		loaningService.delete(request.getParameter("realId"));
		
	} catch (Exception e) {
		responseContent.setSuccess(false);
		responseContent.setMessage("删除失败");
	}
	return responseContent;
	
}
@RequestMapping("edit")
public String edit(HttpServletRequest request , HttpServletResponse response){
	if(StringUtils.isEmpty(request.getParameter("userId"))){
		
	}else{
	request.setAttribute("UserApplyForLimit", loaningService.load(request.getParameter("userId")));
	}
	return "admin/bas/loaning_edit";
}
@RequestMapping("save")
public String save(UserApplyForLimit userApplyForLimit,HttpServletRequest request , HttpServletResponse response){
	if(StringUtils.isEmpty(request.getParameter("userId"))){
		
	}else{
	loaningService.save(userApplyForLimit);
	}
	return "redirect:page.action";
} 
}
