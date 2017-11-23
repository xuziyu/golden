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
import com.share.golden.entity.SysFeedback;
import com.share.golden.entity.SysFeedbackExample;
import com.share.golden.framework.entity.PageVO;
import com.share.golden.framework.entity.PageWrap4EasyUI;
import com.share.golden.framework.entity.ResponseContent;
import com.share.golden.service.admin.ISysFeedbackService;

@Controller
@RequestMapping("/admin/Feedback/")
public class FeedbackAction {
	@Autowired
	private ISysFeedbackService feedbackService;

	@RequestMapping("list")
	public String list(HttpServletRequest request, HttpServletResponse response) {
		// 传一个主键id查询单个对象。
		request.setAttribute("sysFeedback", feedbackService.select(request.getParameter("feedbackId")));
		return "admin/sys/sys_feedback_list";
	}

	@RequestMapping("page")
	public String page(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest()
				.getSession();
		/**
		 * ----------补充----------------
		 */
		return "admin/sys/sys_feedback_page";
	}

	@RequestMapping("save")
	public String save(SysFeedback sysFeedback, HttpServletRequest request, HttpServletResponse response) {
		/**
		 * ----------补充----------------
		 */
		return "redirect:page.action";
	}

	@RequestMapping("edit")
	public String edit(HttpServletRequest request, HttpServletResponse response) {
		String feedbackId = request.getParameter("feedbackId");
		if (StringUtils.isEmpty(feedbackId)) {
		} else {
			SysFeedback sysFeedback = feedbackService.select(feedbackId);
			request.setAttribute("sysFeedback", sysFeedback);
		}

		return "admin/sys/sys_feedback_edit";
	}

	@RequestMapping("page_json")
	@ResponseBody
	public PageWrap4EasyUI pagejson(HttpServletRequest request, HttpServletResponse response) {
		String feedbackName = request.getParameter("feedbackName");
		String feedbackConent = request.getParameter("feedbackConent");
		String feedbackTime = request.getParameter("feedbackTime");

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

		SysFeedbackExample sysFeedbackExample = new SysFeedbackExample();
		com.share.golden.entity.SysFeedbackExample.Criteria criteria = sysFeedbackExample.createCriteria();
		if (!StringUtils.isEmpty(feedbackName)) {
			criteria.andFeedbackNameLike(feedbackName + "%");
		}
		if (!StringUtils.isEmpty(feedbackConent)) {
			criteria.andFeedbackConentLike(feedbackConent + "%");
		}
		// if(!StringUtils.isEmpty(feedbackTime)){
		// criteria.andFeedbackTimeEqualTo(feedbackTime);
		// }

		Page<Object> page = PageHelper.startPage(pageVO.getPageIndex() + 1, pageVO.getPageSize());
		List<SysFeedback> listSysFeedback = (List<SysFeedback>) feedbackService.list(sysFeedbackExample);
		pageVO.setRecordCount((int) page.getTotal());
		pageVO.setList(listSysFeedback);
		return new PageWrap4EasyUI(pageVO);
	}

	@RequestMapping("deleteAj")
	@ResponseBody
	public ResponseContent delete(HttpServletRequest request, HttpServletResponse response) {
		ResponseContent responseContent = new ResponseContent();
		responseContent.setSuccess(true);
		try {
			feedbackService.delete(request.getParameter("feedbackId"));
		} catch (Exception ex) {
			responseContent.setSuccess(false);
			responseContent.setMessage("删除失败");
		}
		return responseContent;
	}
}
