package com.share.golden.action.admin.certification;

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
import com.share.golden.entity.UserEducation;
import com.share.golden.entity.UserEducationExample;

import com.share.golden.entity.UserEducationExample.Criteria;
import com.share.golden.framework.StringUtil.Util;
import com.share.golden.framework.entity.PageVO;
import com.share.golden.framework.entity.PageWrap4EasyUI;
import com.share.golden.framework.entity.ResponseContent;
import com.share.golden.service.admin.IUserEducationService;


@Controller
@RequestMapping("/admin/education/")
public class UserEducationAction {
	
	@Autowired
	private IUserEducationService iUserEducationService;
	
	@RequestMapping("list")
	public String list(HttpServletRequest request,HttpServletResponse response){
		
		request.setAttribute("userEducation",iUserEducationService.select(request.getParameter("educationId")));
		return "admin/user/user_education_list";
	}
	@RequestMapping("page")
	public String page(HttpServletRequest request , HttpServletResponse response){
		HttpSession session = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest().getSession();
		
		return "admin/user/user_education_page";
	}
	@RequestMapping("save")
	public String save(UserEducation userEducation ,HttpServletRequest request , HttpServletResponse response){

		
		iUserEducationService.update(userEducation);
		return "redirect:page.action";
	}
	@RequestMapping("edit")
	public String edit(HttpServletRequest request , HttpServletResponse response){
		String educationId = request.getParameter("educationId");
		if (StringUtils.isEmpty(educationId)) {
			
		} else {
			
			UserEducation userEducation =iUserEducationService.select(educationId);
			request.setAttribute("userEducation", userEducation);
		}

		return "admin/user/user_education_edit";
	}
	@RequestMapping("page_json")
	@ResponseBody
	public PageWrap4EasyUI pagejson(HttpServletRequest request , HttpServletResponse response){
		
		String auditorId=request.getParameter("auditorId");
		String auditor=request.getParameter("auditor");

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

		

		UserEducationExample userEducationExample = new UserEducationExample();
		Criteria criteria = userEducationExample.createCriteria();
	
		if(!StringUtils.isEmpty(auditor)){
			criteria.andAuditorLike(auditor + "%");
			
		}
		if(!StringUtils.isEmpty(auditorId)){
			criteria.andAuditorIdLike(auditorId + "%");
		}
		Page<Object> page = PageHelper.startPage(pageVO.getPageIndex() + 1, pageVO.getPageSize());
		List<UserEducation> listUserEducation = (List<UserEducation>) iUserEducationService.list(userEducationExample);
		pageVO.setRecordCount((int) page.getTotal());
		pageVO.setList(listUserEducation);
		return new PageWrap4EasyUI(pageVO);
	}
	
	@RequestMapping("deleteAj")
	@ResponseBody
	public ResponseContent delete(HttpServletRequest request , HttpServletResponse response){
		ResponseContent responseContent = new ResponseContent();
		responseContent.setSuccess(true);
		try{
			iUserEducationService.delete(request.getParameter("educationId"));
		}catch(Exception ex){
			responseContent.setSuccess(false);
			responseContent.setMessage("删除失败");
		}
		return responseContent ;
	}
	

}
