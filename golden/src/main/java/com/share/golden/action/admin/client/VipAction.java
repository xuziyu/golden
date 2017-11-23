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
import com.share.golden.entity.SysVip;
import com.share.golden.entity.SysVipExample;
import com.share.golden.framework.entity.PageVO;
import com.share.golden.framework.entity.PageWrap4EasyUI;
import com.share.golden.framework.entity.ResponseContent;
import com.share.golden.service.admin.ISysVipService;

@Controller
@RequestMapping("/admin/Vip/")
public class VipAction {
	@Autowired
	private ISysVipService vipService;
	@RequestMapping("list")
	public String list(HttpServletRequest request , HttpServletResponse response){
		//传一个主键id查询单个对象。
		request.setAttribute("sysVip",vipService.select(request.getParameter("vipId")));
		return "admin/sys/sys_vip_list";
	}
	@RequestMapping("page")
	public String page(HttpServletRequest request , HttpServletResponse response){
		HttpSession session = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest().getSession();
		/**
		 * ----------补充----------------
		 */
		return "admin/sys/sys_vip_page";
	}
	@RequestMapping("save")
	public String save(SysVip sysVip , HttpServletRequest request , HttpServletResponse response){
		/**
		 * ----------补充----------------
		 */
		vipService.update(sysVip);
		return "redirect:page.action";
	}
	@RequestMapping("edit")
	public String edit(HttpServletRequest request , HttpServletResponse response){
		String vipId = request.getParameter("vipId");
		if (StringUtils.isEmpty(vipId)) {
		} else {
			SysVip sysVip = vipService.select(vipId);
			request.setAttribute("sysVip", sysVip);
		}

		return "admin/sys/sys_vip_edit";
	}
	@RequestMapping("page_json")
	@ResponseBody
	public PageWrap4EasyUI pagejson(HttpServletRequest request , HttpServletResponse response){
		String userId = request.getParameter("userId");
		String vipState = request.getParameter("vipState");
		String userCredit = request.getParameter("userCredit");


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

		

		SysVipExample sysVipExample = new SysVipExample();
		com.share.golden.entity.SysVipExample.Criteria criteria = sysVipExample.createCriteria();
		if(!StringUtils.isEmpty(userId)){
			criteria.andUserIdLike(userId + "%");
		}
		if(!StringUtils.isEmpty(vipState)){
			criteria.andVipStateLike(vipState + "%");
		}
		if(!StringUtils.isEmpty(userCredit)){
			criteria.andUserCreditLike(userCredit + "%");
		}

		
		Page<Object> page = PageHelper.startPage(pageVO.getPageIndex() + 1, pageVO.getPageSize());
		List<SysVip> listSysVip = (List<SysVip>) vipService.list(sysVipExample);
		pageVO.setRecordCount((int) page.getTotal());
		pageVO.setList(listSysVip);
		return new PageWrap4EasyUI(pageVO);
	}
	@RequestMapping("deleteAj")
	@ResponseBody
	public ResponseContent delete(HttpServletRequest request , HttpServletResponse response){
		ResponseContent responseContent = new ResponseContent();
		responseContent.setSuccess(true);
		try{
			vipService.delete(request.getParameter("vipId"));
		}catch(Exception ex){
			responseContent.setSuccess(false);
			responseContent.setMessage("删除失败");
		}
		return responseContent ;
	}
}
