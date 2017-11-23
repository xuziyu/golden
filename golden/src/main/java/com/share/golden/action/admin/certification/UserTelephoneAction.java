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
import com.share.golden.entity.UserTelephone;
import com.share.golden.entity.UserTelephoneExample;
import com.share.golden.entity.UserTelephoneExample.Criteria;
import com.share.golden.framework.entity.PageVO;
import com.share.golden.framework.entity.PageWrap4EasyUI;
import com.share.golden.framework.entity.ResponseContent;
import com.share.golden.service.admin.IUserTelephoneService;

@Controller
@RequestMapping("/admin/telephone/")
public class UserTelephoneAction {
	
	@Autowired
	private IUserTelephoneService iUserTelephoneService;
	
	@RequestMapping("list")
	public String list(HttpServletRequest request , HttpServletResponse response){

		request.setAttribute("userTelephone",iUserTelephoneService.select(request.getParameter("tid")));
		return "admin/user/user_telephone_list";
	}
	
	@RequestMapping("page")
	
	public String page(HttpServletRequest request , HttpServletResponse response){
		HttpSession session = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest().getSession();
		
		return "admin/user/user_telephone_page";
	}
	@RequestMapping("save")
	public String save(UserTelephone userTelephone,HttpServletRequest request , HttpServletResponse response){

		iUserTelephoneService.update(userTelephone);
		return "redirect:page.action";
	}
	@RequestMapping("edit")
	public String edit(HttpServletRequest request , HttpServletResponse response){
		String tid = request.getParameter("tid");
		if (StringUtils.isEmpty(tid)) {
		} else {
			UserTelephone userTelephone =iUserTelephoneService.select(tid);
			request.setAttribute("userTelephone", userTelephone);
		}

		return "admin/user/user_telephone_edit";
	}
	@RequestMapping("page_json")
	@ResponseBody
	public PageWrap4EasyUI pagejson(HttpServletRequest request , HttpServletResponse response){
		
		String auditorId=request.getParameter("auditorId");
		String auditor=request.getParameter("auditor");
		String telephoneNum=request.getParameter("telephoneNum");

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

		

		UserTelephoneExample userTelephoneExample = new UserTelephoneExample();
		Criteria criteria = userTelephoneExample.createCriteria();
		
		if(!StringUtils.isEmpty(auditor)){
			criteria.andAuditorLike(auditor + "%");
			
		}
		if(!StringUtils.isEmpty(auditorId)){
			criteria.andAuditorIdLike(auditorId + "%");
		}
		if(!StringUtils.isEmpty(telephoneNum)){
			criteria.andTelephoneNumLike(telephoneNum + "%");
		}
	
		
		Page<Object> page = PageHelper.startPage(pageVO.getPageIndex() + 1, pageVO.getPageSize());
		List<UserTelephone> listUserTelephone = (List<UserTelephone>) iUserTelephoneService.list(userTelephoneExample);
		pageVO.setRecordCount((int) page.getTotal());
		pageVO.setList(listUserTelephone);
		return new PageWrap4EasyUI(pageVO);
	}
	
	@RequestMapping("deleteAj")
	@ResponseBody
	public ResponseContent delete(HttpServletRequest request , HttpServletResponse response){
		ResponseContent responseContent = new ResponseContent();
		responseContent.setSuccess(true);
		try{
			iUserTelephoneService.delete(request.getParameter("tid"));
		}catch(Exception ex){
			responseContent.setSuccess(false);
			responseContent.setMessage("删除失败");
		}
		return responseContent ;
	}

}
