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
import com.share.golden.entity.SysPoundage;
import com.share.golden.entity.SysPoundageExample;
import com.share.golden.entity.SysPoundageExample.Criteria;
import com.share.golden.framework.entity.PageVO;
import com.share.golden.framework.entity.PageWrap4EasyUI;
import com.share.golden.framework.entity.ResponseContent;
import com.share.golden.service.admin.ISysPoundageService;

@Controller
@RequestMapping("/admin/poundage/")
public class SysPoundageAction {
	@Autowired
	private ISysPoundageService iSysPoundageService;
	
	
	@RequestMapping("list")
	public String list(HttpServletRequest request,HttpServletResponse response){
		
		request.setAttribute("sysPoundage",iSysPoundageService.select(request.getParameter("poundageId")));
		return "admin/sys/sys_poundage_list";
	}
	@RequestMapping("page")
	public String page(HttpServletRequest request , HttpServletResponse response){
		HttpSession session = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest().getSession();
		
		return "admin/sys/sys_poundage_page";
	}
	@RequestMapping("save")
	public String save(SysPoundage sysPoundage ,HttpServletRequest request , HttpServletResponse response){

		
		iSysPoundageService.update(sysPoundage);
		return "redirect:page.action";
	}
	@RequestMapping("edit")
	public String edit(HttpServletRequest request , HttpServletResponse response){
		String poundageId = request.getParameter("poundageId");
		if (StringUtils.isEmpty(poundageId)) {
			
		} else {
			
			SysPoundage sysPoundage =iSysPoundageService.select(poundageId);
			request.setAttribute("sysPoundage", sysPoundage);
		}

		return "admin/sys/sys_poundage_edit";
	}
	@RequestMapping("page_json")
	@ResponseBody
	public PageWrap4EasyUI pagejson(HttpServletRequest request , HttpServletResponse response){
		
		String userId=request.getParameter("userId");
		String poundageType=request.getParameter("poundageType");
		String paytype=request.getParameter("paytype");
	
		

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

		

		SysPoundageExample sysPoundageExample = new SysPoundageExample();
		Criteria criteria = sysPoundageExample.createCriteria();
	
		if(!StringUtils.isEmpty(userId)){
			criteria.andUserIdLike(userId + "%");
			
		}
		if(!StringUtils.isEmpty(poundageType)){
			criteria.andPoundageTypeLike(poundageType + "%");
		}
		if(!StringUtils.isEmpty(paytype)){
			criteria.andPaytypeLike(paytype + "%");
		}
		
		Page<Object> page = PageHelper.startPage(pageVO.getPageIndex() + 1, pageVO.getPageSize());
		List<SysPoundage> listSysPoundage = (List<SysPoundage>) iSysPoundageService.list(sysPoundageExample);
		pageVO.setRecordCount((int) page.getTotal());
		pageVO.setList(listSysPoundage);
		return new PageWrap4EasyUI(pageVO);
	}
	@RequestMapping("deleteAj")
	@ResponseBody
	public ResponseContent delete(HttpServletRequest request , HttpServletResponse response){
		ResponseContent responseContent = new ResponseContent();
		responseContent.setSuccess(true);
		try{
			iSysPoundageService.delete(request.getParameter("poundageId"));
		}catch(Exception ex){
			responseContent.setSuccess(false);
			responseContent.setMessage("删除失败");
		}
		return responseContent ;
	}

}
