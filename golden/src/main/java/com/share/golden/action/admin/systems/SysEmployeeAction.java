package com.share.golden.action.admin.systems;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.share.golden.entity.SysEmployee;
import com.share.golden.entity.SysEmployeeExample;
import com.share.golden.entity.SysEmployeeExample.Criteria;
import com.share.golden.framework.entity.PageVO;
import com.share.golden.service.admin.ISysEmployeeService;

@Controller
@RequestMapping("/admin/sys_employee/")
public class SysEmployeeAction {

	@Autowired
	private ISysEmployeeService sysEmployeeService;
	
	@RequestMapping("list")
	public String list(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("employeeList", sysEmployeeService.selectByExample(new SysEmployeeExample()));
		return "admin/sys/employee/employee_list";
	}
	
	@RequestMapping("page")
	public String index(HttpServletRequest request, HttpServletResponse response) {
		String employeeId = request.getParameter("employeeId");
		request.setAttribute("employeeId", employeeId);
		PageVO pageVO = new PageVO();
		if (StringUtils.isEmpty(request.getParameter("pageIndex"))) {
			pageVO.setPageIndex(0);
		} else {
			pageVO.setPageIndex(Integer.parseInt(request.getParameter("pageIndex")));
		}

		if (!StringUtils.isEmpty(request.getParameter("pageSize"))) {
			pageVO.setPageSize(Integer.parseInt(request.getParameter("pageSize")));
		}
		SysEmployeeExample sysEmployeeExample = new SysEmployeeExample();
		Criteria criteria = sysEmployeeExample.createCriteria();
		if(!StringUtils.isEmpty(employeeId)){
			criteria.andEmployeeIdLike(employeeId);
		}
		Page<Object> page = PageHelper.startPage(pageVO.getPageIndex() + 1, pageVO.getPageSize());
		List<SysEmployee> sysEmployees = (List<SysEmployee>) sysEmployeeService.selectByExample(sysEmployeeExample);
		pageVO.setRecordCount((int) page.getTotal());
		pageVO.setList(sysEmployees);
		request.setAttribute("page", pageVO);
		
		return "admin/sys/employee/employee_page";
	}
	
	@RequestMapping("edit")
	public String edit(HttpServletRequest request, HttpServletResponse response) {
		SysEmployee sysEmployee = sysEmployeeService.selectByPrimaryKey(request.getParameter("employeeId"));
		System.out.println(sysEmployee.getEmployeeId());
		request.setAttribute("sysEmployee", sysEmployee);
		return "admin/sys/employee/employee_edit";
	}
	
	@RequestMapping("save")
	public String save(SysEmployee sysEmployee, HttpServletRequest request, HttpServletResponse response) {

		if (StringUtils.isEmpty(request.getParameter("employeeId"))) {
			sysEmployeeService.insert(sysEmployee);
		} else {
			sysEmployeeService.updateByPrimaryKey(sysEmployee);

		}
		System.out.println("保存:" + sysEmployee.getEmployeeId());
		return "redirect:page";
	}
	@RequestMapping("delete")
	public String delete(HttpServletRequest request, HttpServletResponse response){
		sysEmployeeService.delete(request.getParameter("employeeId"));
		return "redirect:page";
		
	}
}
