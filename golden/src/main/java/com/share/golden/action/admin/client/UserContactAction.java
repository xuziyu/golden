package com.share.golden.action.admin.client;

import java.io.UnsupportedEncodingException;
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
import com.share.golden.entity.UserContact;
import com.share.golden.entity.UserContactExample;
import com.share.golden.framework.entity.PageVO;
import com.share.golden.framework.entity.PageWrap4EasyUI;
import com.share.golden.framework.entity.ResponseContent;
import com.share.golden.service.admin.IUserContactService;

@Controller
@RequestMapping("/admin/UserContact/")
public class UserContactAction {
	@Autowired
	private IUserContactService userContactService;
	@RequestMapping("list")
	public String list(HttpServletRequest request , HttpServletResponse response){
		//传一个主键id查询单个对象。
		request.setAttribute("userContact",userContactService.select(request.getParameter("contactId")));
		return "admin/user/user_contact_list";
	}
	@RequestMapping("page")
	public String page(HttpServletRequest request , HttpServletResponse response){
		HttpSession session = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest().getSession();
		/**
		 * ----------补充----------------
		 */
		return "admin/user/user_contact_page";
	}
	@RequestMapping("save")
	public String save(UserContact userContact , HttpServletRequest request , HttpServletResponse response) throws UnsupportedEncodingException{
		/**
		 * ----------补充----------------
		 */
		userContactService.update(userContact);
		return "redirect:page.action";
	}
	@RequestMapping("edit")
	public String edit(HttpServletRequest request , HttpServletResponse response){
		String contactId = request.getParameter("contactId");
		if (StringUtils.isEmpty(contactId)) {
		} else {
			UserContact userContact = userContactService.select(contactId);
			request.setAttribute("userContact", userContact);
		}

		return "admin/user/user_contact_edit";
	}
	@RequestMapping("page_json")
	@ResponseBody
	public PageWrap4EasyUI pagejson(HttpServletRequest request , HttpServletResponse response){
		String userId = request.getParameter("userId");
		String contactType = request.getParameter("contactType");
		String contactPeople = request.getParameter("contactPeople");
		String telphoneNumber = request.getParameter("telphoneNumber");

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

		

		UserContactExample userContactExample = new UserContactExample();
		com.share.golden.entity.UserContactExample.Criteria criteria = userContactExample.createCriteria();
		if(!StringUtils.isEmpty(userId)){
			criteria.andUserIdLike(userId + "%");
		}
		if(!StringUtils.isEmpty(contactType)){
			criteria.andContactTypeLike(contactType + "%");
		}
		if(!StringUtils.isEmpty(contactPeople)){
			criteria.andContactPeopleLike(contactPeople + "%");
		}
		if(!StringUtils.isEmpty(telphoneNumber)){
			criteria.andTelphoneNumberLike(telphoneNumber + "%");
		}
		
		Page<Object> page = PageHelper.startPage(pageVO.getPageIndex() + 1, pageVO.getPageSize());
		List<UserContact> listUserContact = (List<UserContact>) userContactService.list(userContactExample);
		pageVO.setRecordCount((int) page.getTotal());
		pageVO.setList(listUserContact);
		return new PageWrap4EasyUI(pageVO);
	}
	@RequestMapping("deleteAj")
	@ResponseBody
	public ResponseContent delete(HttpServletRequest request , HttpServletResponse response){
		ResponseContent responseContent = new ResponseContent();
		responseContent.setSuccess(true);
		try{
			userContactService.delete(request.getParameter("contactId"));
		}catch(Exception ex){
			responseContent.setSuccess(false);
			responseContent.setMessage("删除失败");
		}
		return responseContent ;
	}
}
