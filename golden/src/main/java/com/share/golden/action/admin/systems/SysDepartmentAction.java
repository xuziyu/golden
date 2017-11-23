package com.share.golden.action.admin.systems;

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
import com.share.golden.entity.SysDepartment;
import com.share.golden.entity.SysDepartmentExample;
import com.share.golden.entity.SysDepartmentExample.Criteria;
import com.share.golden.framework.entity.PageVO;
import com.share.golden.framework.entity.PageWrap4EasyUI;
import com.share.golden.framework.entity.ResponseContent;
import com.share.golden.service.admin.ISysDepartmentService;

@Controller
@RequestMapping("/admin/department/")
public class SysDepartmentAction {
	
	@Autowired
	private ISysDepartmentService iSysDepartmentService;
	
	
	
	@RequestMapping("list")
	public String list(HttpServletRequest request,HttpServletResponse response){
		
		request.setAttribute("sysDepartment",iSysDepartmentService.select(request.getParameter("departmentId")));
		return "admin/sys/sys_department_list";
	}
	@RequestMapping("page")
	public String page(HttpServletRequest request , HttpServletResponse response){
		HttpSession session = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest().getSession();
		
		return "admin/sys/sys_department_page";
	}
	@RequestMapping("save")
	public String save(SysDepartment sysDepartment ,HttpServletRequest request , HttpServletResponse response){

		
		iSysDepartmentService.update(sysDepartment);
		return "redirect:page.action";
	}
	@RequestMapping("edit")
	public String edit(HttpServletRequest request , HttpServletResponse response){
		String departmentId = request.getParameter("departmentId");
		if (StringUtils.isEmpty(departmentId)) {
			
		} else {
			
			SysDepartment SysDepartment =iSysDepartmentService.select(departmentId);
			request.setAttribute("SysDepartment", SysDepartment);
		}

		return "admin/sys/sys_department_edit";
	}
	@RequestMapping("page_json")
	@ResponseBody
	public PageWrap4EasyUI pagejson(HttpServletRequest request , HttpServletResponse response){
		
		String parentDepartmentId=request.getParameter("parentDepartmentId");
		String departmentName=request.getParameter("departmentName");
	
		

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

		

		SysDepartmentExample sysDepartmentExample = new SysDepartmentExample();
		Criteria criteria = sysDepartmentExample.createCriteria();
	
		if(!StringUtils.isEmpty(parentDepartmentId)){
			criteria.andParentDepartmentIdLike(parentDepartmentId + "%");
			
		}
		if(!StringUtils.isEmpty(departmentName)){
			criteria.andDepartmentNameLike(departmentName + "%");
		}
		
		Page<Object> page = PageHelper.startPage(pageVO.getPageIndex() + 1, pageVO.getPageSize());
		List<SysDepartment> listSysDepartment = (List<SysDepartment>) iSysDepartmentService.list(sysDepartmentExample);
		pageVO.setRecordCount((int) page.getTotal());
		pageVO.setList(listSysDepartment);
		return new PageWrap4EasyUI(pageVO);
	}
	@RequestMapping("deleteAj")
	@ResponseBody
	public ResponseContent delete(HttpServletRequest request , HttpServletResponse response){
		ResponseContent responseContent = new ResponseContent();
		responseContent.setSuccess(true);
		try{
			iSysDepartmentService.delete(request.getParameter("departmentId"));
		}catch(Exception ex){
			responseContent.setSuccess(false);
			responseContent.setMessage("删除失败");
		}
		return responseContent ;
	}

}
