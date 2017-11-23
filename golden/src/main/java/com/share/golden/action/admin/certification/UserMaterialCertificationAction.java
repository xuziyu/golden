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
import com.share.golden.entity.UserMaterialCertification;
import com.share.golden.entity.UserMaterialCertificationExample;
import com.share.golden.entity.UserEducation;

import com.share.golden.entity.UserMaterialCertificationExample.Criteria;
import com.share.golden.framework.entity.PageVO;
import com.share.golden.framework.entity.PageWrap4EasyUI;
import com.share.golden.framework.entity.ResponseContent;
import com.share.golden.service.admin.IUserMaterialCertificationService;


@Controller
@RequestMapping("/admin/material/")
public class UserMaterialCertificationAction {
	
	@Autowired
	private IUserMaterialCertificationService iUserMaterialCertificationService;
	
	@RequestMapping("list")
	public String list(HttpServletRequest request,HttpServletResponse response){
		
		request.setAttribute("userMaterialCertification",iUserMaterialCertificationService.select(request.getParameter("materiaId")));
		return "admin/user/user_material_certification_list";
	}
	@RequestMapping("page")
	public String page(HttpServletRequest request , HttpServletResponse response){
		HttpSession session = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest().getSession();
		
		return "admin/user/user_material_certification_page";
	}
	@RequestMapping("save")
	public String save(UserMaterialCertification userMaterialCertification ,HttpServletRequest request , HttpServletResponse response){

		
		iUserMaterialCertificationService.update(userMaterialCertification);
		return "redirect:page.action";
	}
	@RequestMapping("edit")
	public String edit(HttpServletRequest request , HttpServletResponse response){
		String materiaId = request.getParameter("materiaId");
		if (StringUtils.isEmpty(materiaId)) {
			
		} else {
			
			UserMaterialCertification userMaterialCertification =iUserMaterialCertificationService.select(materiaId);
			request.setAttribute("userMaterialCertification", userMaterialCertification);
		}

		return "admin/user/user_material_certification_edit";
	}
	@RequestMapping("page_json")
	@ResponseBody
	public PageWrap4EasyUI pagejson(HttpServletRequest request , HttpServletResponse response){
	    String valid=request.getParameter("valid");
	    String materiaType=request.getParameter("materiaType");
	    String materia=request.getParameter("materia");
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

		

		UserMaterialCertificationExample userMaterialCertificationExample = new UserMaterialCertificationExample();
		Criteria criteria = userMaterialCertificationExample.createCriteria();
	      
		if(!StringUtils.isEmpty(valid)){
			criteria.andValidLike(valid + "%");
		}
		if(!StringUtils.isEmpty(materiaType)){
			criteria.andMateriaTypeLike(materiaType + "%");
		}
		if(!StringUtils.isEmpty(materia)){
			criteria.andMateriaLike(materia + "%");
		}
		Page<Object> page = PageHelper.startPage(pageVO.getPageIndex() + 1, pageVO.getPageSize());
		List<UserMaterialCertification> listUserMaterialCertification = (List<UserMaterialCertification>) iUserMaterialCertificationService.list(userMaterialCertificationExample);
		pageVO.setRecordCount((int) page.getTotal());
		pageVO.setList(listUserMaterialCertification);
		return new PageWrap4EasyUI(pageVO);
	}
	
	@RequestMapping("deleteAj")
	@ResponseBody
	public ResponseContent delete(HttpServletRequest request , HttpServletResponse response){
		ResponseContent responseContent = new ResponseContent();
		responseContent.setSuccess(true);
		try{
			iUserMaterialCertificationService.delete(request.getParameter("materiaId"));
		}catch(Exception ex){
			responseContent.setSuccess(false);
			responseContent.setMessage("删除失败");
		}
		return responseContent ;
	}
	

}
