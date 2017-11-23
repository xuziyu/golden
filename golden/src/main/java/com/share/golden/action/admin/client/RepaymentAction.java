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
import com.share.golden.entity.BasRepayment;
import com.share.golden.entity.BasRepaymentExample;
import com.share.golden.framework.entity.PageVO;
import com.share.golden.framework.entity.PageWrap4EasyUI;
import com.share.golden.framework.entity.ResponseContent;
import com.share.golden.service.admin.IBasRepaymentService;

@Controller
@RequestMapping("/admin/Repayment/")
public class RepaymentAction {
	@Autowired
	private IBasRepaymentService repaymentService;
	@RequestMapping("list")
	public String list(HttpServletRequest request , HttpServletResponse response){
		//传一个主键id查询单个对象。
		request.setAttribute("basRepayment",repaymentService.select(request.getParameter("repayId")));
		return "admin/bas/user_list";
	}
	@RequestMapping("page")
	public String page(HttpServletRequest request , HttpServletResponse response){
		HttpSession session = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest().getSession();
		/**
		 * ----------补充----------------
		 */
		return "admin/bas/user_page";
	}
	@RequestMapping("save")
	public String save(BasRepayment basRepayment , HttpServletRequest request , HttpServletResponse response){
		/**
		 * ----------补充----------------
		 */
		repaymentService.update(basRepayment);
		return "redirect:page.action";
	}
	@RequestMapping("edit")
	public String edit(HttpServletRequest request , HttpServletResponse response){
		String repayId = request.getParameter("repayId");
		if (StringUtils.isEmpty(repayId)) {
		} else {
			BasRepayment basRepayment = repaymentService.select(repayId);
			request.setAttribute("basRepayment", basRepayment);
		}

		return "admin/bas/user_edit";
	}
	@RequestMapping("page_json")
	@ResponseBody
	public PageWrap4EasyUI pagejson(HttpServletRequest request , HttpServletResponse response){
		String repayCode = request.getParameter("repayCode");
		String repayDate = request.getParameter("repayDate");
		String repayState = request.getParameter("repayState");
		String repayTime = request.getParameter("repayTime");
		String repayRemark1 = request.getParameter("repayRemark1");
		String repayRemark2 = request.getParameter("repayRemark2");

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

		

		BasRepaymentExample basRepaymentExample = new BasRepaymentExample();
		com.share.golden.entity.BasRepaymentExample.Criteria criteria = basRepaymentExample.createCriteria();
		if(!StringUtils.isEmpty(repayCode)){
			criteria.andRepayCodeLike(repayCode + "%");
		}
		if(!StringUtils.isEmpty(repayDate)){
			criteria.andRepayCodeBetween(null, null);
		}
		if(!StringUtils.isEmpty(repayState)){
			criteria.andRepayStateLike(repayState + "%");
		}
		if(!StringUtils.isEmpty(repayTime)){
			criteria.andRepayTimeLike(repayTime + "%");
		}
		if(!StringUtils.isEmpty(repayRemark1)){
			criteria.andRepayRemark1Like(repayRemark1 + "%");
		}
		if(!StringUtils.isEmpty(repayRemark2)){
			criteria.andRepayRemark2Like(repayRemark2 + "%");
		}
		
		
		Page<Object> page = PageHelper.startPage(pageVO.getPageIndex() + 1, pageVO.getPageSize());
		List<BasRepayment> listBasRepayment = (List<BasRepayment>) repaymentService.list(basRepaymentExample);
		pageVO.setRecordCount((int) page.getTotal());
		pageVO.setList(listBasRepayment);
		return new PageWrap4EasyUI(pageVO);
	}
	@RequestMapping("deleteAj")
	@ResponseBody
	public ResponseContent delete(HttpServletRequest request , HttpServletResponse response){
		ResponseContent responseContent = new ResponseContent();
		responseContent.setSuccess(true);
		try{
			repaymentService.delete(request.getParameter("repayId"));
		}catch(Exception ex){
			responseContent.setSuccess(false);
			responseContent.setMessage("删除失败");
		}
		return responseContent ;
	}
}
