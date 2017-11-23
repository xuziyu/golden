
package com.share.golden.action.admin.certification;

import java.util.Date;
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
import com.github.pagehelper.util.StringUtil;

import com.share.golden.entity.UserRealName;
import com.share.golden.entity.UserRealNameExample;
import com.share.golden.entity.UserRealNameExample.Criteria;
import com.share.golden.framework.StringUtil.DateUtility;
import com.share.golden.framework.StringUtil.Util;
import com.share.golden.framework.entity.PageVO;
import com.share.golden.framework.entity.PageWrap4EasyUI;
import com.share.golden.framework.entity.ResponseContent;
import com.share.golden.service.admin.IUserRealNameService;

@Controller
@RequestMapping("/admin/user/")
public class UserRealNameAction {
	
	@Autowired
	private IUserRealNameService iUserRealNameService;
	
	
	@RequestMapping("list")
	public String list(HttpServletRequest request,HttpServletResponse response){
		
		request.setAttribute("userRealName",iUserRealNameService.select(request.getParameter("realId")));
		return "admin/user/user_real_name_list";
	}
	@RequestMapping("page")
	public String page(HttpServletRequest request , HttpServletResponse response){
		HttpSession session = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest().getSession();
		
		return "admin/user/user_real_name_page";
	}
	@RequestMapping("save")
	public String save(UserRealName userRealName ,HttpServletRequest request , HttpServletResponse response){

		iUserRealNameService.update(userRealName);
		return "redirect:page.action";
	}
	@RequestMapping("edit")
	public String edit(HttpServletRequest request , HttpServletResponse response){
		String realId = request.getParameter("realId");
		if (StringUtils.isEmpty(realId)) {
			
		} else {
			/*BasUser basUser = userService.select(userId);
			request.setAttribute("basUser", basUser);*/
			UserRealName userRealName =iUserRealNameService.select(realId);
			request.setAttribute("userRealName", userRealName);
		}

		return "admin/user/user_real_name_edit";
	}
	
	
	@RequestMapping("page_json")
	@ResponseBody
	public PageWrap4EasyUI pagejson(HttpServletRequest request , HttpServletResponse response) throws Exception{
		
		String realId=request.getParameter("realId");
		String userId=request.getParameter("userId");
		String realName=request.getParameter("realName");
		String gender=request.getParameter("gender");
		String identityNum=request.getParameter("identityNum");
		String auditor=request.getParameter("auditor");
		String auditorId=request.getParameter("auditorId");
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

		

	
		UserRealNameExample userRealNameExample = new UserRealNameExample();
		
		Criteria criteria =  userRealNameExample.createCriteria();
		if(!StringUtils.isEmpty(realId)){
			criteria.andRealIdLike(realId + "%");
		}
		if(!StringUtils.isEmpty(realName)){
			criteria.andRealNameLike(realName + "%");
		}
		if(!StringUtils.isEmpty(userId)){
			criteria.andUserIdLike(userId + "%");
		}
		
//		if(!StringUtils.isEmpty(registerTime)){
//			criteria.andRegisterTimeEqualTo(registerTime);
//		}
		if(!StringUtils.isEmpty(auditor)){
			criteria.andGenderLike(auditor + "%");
		}
		if(!StringUtils.isEmpty(auditorId)){
			criteria.andGenderLike(auditorId + "%");
		}
		if(!StringUtils.isEmpty(identityNum)){
			criteria.andIdentityNumLike(identityNum + "%");
		}
		
		Page<Object> page = PageHelper.startPage(pageVO.getPageIndex() + 1, pageVO.getPageSize());
		List<UserRealName> listUserRealName = (List<UserRealName>)iUserRealNameService.list(userRealNameExample);
		for (UserRealName userRealName : listUserRealName) {
			System.out.println("==============name=============="+userRealName.getRealName());
		}
		
		pageVO.setRecordCount((int) page.getTotal());
		pageVO.setList(listUserRealName);
		return new PageWrap4EasyUI(pageVO);
	}
	@RequestMapping("deleteAj")
	@ResponseBody
	public ResponseContent delete(HttpServletRequest request , HttpServletResponse response){
		ResponseContent responseContent = new ResponseContent();
		responseContent.setSuccess(true);
		try{
			iUserRealNameService.delete(request.getParameter("realId"));
		}catch(Exception ex){
			responseContent.setSuccess(false);
			responseContent.setMessage("删除失败");
		}
		return responseContent ;
	}

}