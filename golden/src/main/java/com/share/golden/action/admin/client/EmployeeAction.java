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
import com.share.golden.entity.SysEmployee;
import com.share.golden.entity.SysEmployeeExample;
import com.share.golden.framework.entity.PageVO;
import com.share.golden.framework.entity.PageWrap4EasyUI;
import com.share.golden.framework.entity.ResponseContent;
import com.share.golden.service.admin.ISysEmployeeService;

@Controller
@RequestMapping("/admin/Employee/")
public class EmployeeAction {
	@Autowired
	private ISysEmployeeService employeeService;

	@RequestMapping("list")
	public String list(HttpServletRequest request, HttpServletResponse response) {
		// 传一个主键id查询单个对象。
		request.setAttribute("sysEmployee", employeeService.selectByPrimaryKey((request.getParameter("employeeId"))));
		return "admin/sys/sys_employee_list";
	}

	@RequestMapping("page")
	public String page(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("dfdsf");
		HttpSession session = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest()
				.getSession();
		/**
		 * ----------补充----------------
		 */
		System.out.println("--------------------------------------------");
		return "admin/sys/sys_employee_page";
	}

	@RequestMapping("save")
	public String save(SysEmployee sysEmployee, HttpServletRequest request, HttpServletResponse response) {
		System.out.println(request.getParameter("employeeStatus")+"ddddddddddddddddd");
		System.out.println(request.getParameter("entryTime"));
		employeeService.updateByPrimaryKey(sysEmployee);
		return "redirect:page.action";
	}

	@RequestMapping("edit")
	public String edit(HttpServletRequest request, HttpServletResponse response) {
		String employeeId = request.getParameter("employeeId");
		if (StringUtils.isEmpty(employeeId)) {
		} else {
			SysEmployee sysEmployee = employeeService.selectByPrimaryKey(employeeId);
			request.setAttribute("sysEmployee", sysEmployee);
		}

		return "admin/sys/sys_employee_edit";
	}

	@RequestMapping("page_json")
	@ResponseBody
	public PageWrap4EasyUI pagejson(HttpServletRequest request, HttpServletResponse response) {
		String departmentId = request.getParameter("departmentId");
		String employeeName = request.getParameter("employeeName");
		String employeeGender = request.getParameter("employeeGender");
		String employeeBirth = request.getParameter("employeeBirth");
		String employeeIdcard = request.getParameter("employeeIdcard");
		String employeePhone = request.getParameter("employeePhone");
		String employeeEmail = request.getParameter("employeeEmail");
		String jobNum = request.getParameter("jobNum");
		String jobName = request.getParameter("jobName");
		String entryTime = request.getParameter("entryTime");
		String employeeStatus = request.getParameter("employeeStatus");
		String employeePassword = request.getParameter("employeePassword");

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

		SysEmployeeExample sysEmployeeExample = new SysEmployeeExample();
		com.share.golden.entity.SysEmployeeExample.Criteria criteria = sysEmployeeExample.createCriteria();
		if (!StringUtils.isEmpty(departmentId)) {
			criteria.andDepartmentIdLike(departmentId + "%");
		}
		if (!StringUtils.isEmpty(employeeName)) {
			criteria.andEmployeeNameLike(employeeName + "%");
		}
		if (!StringUtils.isEmpty(employeeGender)) {
			criteria.andEmployeeGenderLike(employeeGender + "%");
		}
		// if(!StringUtils.isEmpty(employeeBirth)){
		// criteria.andEmployeeBirthEqualTo(employeeBirth);
		// }
		if (!StringUtils.isEmpty(employeeIdcard)) {
			criteria.andEmployeeIdcardLike(employeeIdcard + "%");
		}
		if (!StringUtils.isEmpty(employeePhone)) {
			criteria.andEmployeePhoneLike(employeePhone + "%");
		}
		if (!StringUtils.isEmpty(employeeEmail)) {
			criteria.andEmployeeEmailLike(employeeEmail + "%");
		}
		if (!StringUtils.isEmpty(jobNum)) {
			criteria.andJobNumLike(jobNum + "%");
		}
		if (!StringUtils.isEmpty(jobName)) {
			criteria.andJobNameLike(jobName + "%");
		}
		// if(!StringUtils.isEmpty(entryTime)){
		// criteria.andEntryTimeEqualTo(entryTime);
		// }
		if (!StringUtils.isEmpty(employeeStatus)) {
			criteria.andEmployeeStatusLike(employeeStatus + "%");
		}
		if (!StringUtils.isEmpty(employeePassword)) {
			criteria.andEmployeePasswordLike(employeePassword + "%");
		}

		Page<Object> page = PageHelper.startPage(pageVO.getPageIndex() + 1, pageVO.getPageSize());
		List<SysEmployee> listSysEmployee = (List<SysEmployee>) employeeService.selectByExample(sysEmployeeExample);
		pageVO.setRecordCount((int) page.getTotal());
		pageVO.setList(listSysEmployee);
		return new PageWrap4EasyUI(pageVO);
	}

	@RequestMapping("deleteAj")
	@ResponseBody
	public ResponseContent delete(HttpServletRequest request, HttpServletResponse response) {
		ResponseContent responseContent = new ResponseContent();
		responseContent.setSuccess(true);
		try {
			employeeService.delete(request.getParameter("employeeId"));
		} catch (Exception ex) {
			responseContent.setSuccess(false);
			responseContent.setMessage("删除失败");
		}
		return responseContent;
	}
}
