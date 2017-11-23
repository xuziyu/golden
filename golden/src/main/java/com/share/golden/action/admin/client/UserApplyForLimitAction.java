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
import com.share.golden.entity.UserApplyForLimit;
import com.share.golden.entity.UserApplyForLimitExample;
import com.share.golden.framework.entity.PageVO;
import com.share.golden.framework.entity.PageWrap4EasyUI;
import com.share.golden.framework.entity.ResponseContent;
import com.share.golden.service.admin.IUserApplyForLimitService;

@Controller
@RequestMapping("/admin/UserApplyForLimit/")
public class UserApplyForLimitAction {
	@Autowired
	private IUserApplyForLimitService userApplyForLimitService;

	@RequestMapping("list")
	public String list(HttpServletRequest request, HttpServletResponse response) {
		// 传一个主键id查询单个对象。
		request.setAttribute("userApplyForLimit", userApplyForLimitService.select(request.getParameter("applyCode")));
		return "admin/user/user_apply_for_limit_list";
	}

	@RequestMapping("page")
	public String page(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest()
				.getSession();
		/**
		 * ----------补充----------------
		 */
		return "admin/user/user_apply_for_limit_page";
	}

	@RequestMapping("save")
	public String save(UserApplyForLimit userApplyForLimit, HttpServletRequest request, HttpServletResponse response) {
		/**
		 * ----------补充----------------
		 */
		userApplyForLimitService.update(userApplyForLimit);
		return "redirect:page.action";
	}

	@RequestMapping("edit")
	public String edit(HttpServletRequest request, HttpServletResponse response) {
		String applyCode = request.getParameter("applyCode");
		if (StringUtils.isEmpty(applyCode)) {
		} else {
			UserApplyForLimit userApplyForLimit = userApplyForLimitService.select(applyCode);
			request.setAttribute("userApplyForLimit", userApplyForLimit);
		}

		return "admin/user/user_apply_for_limit_edit";
	}

	@RequestMapping("page_json")
	@ResponseBody
	public PageWrap4EasyUI pagejson(HttpServletRequest request, HttpServletResponse response) {
		String userId = request.getParameter("userId");
		String originalCredit = request.getParameter("originalCredit");
		String houseOfProperty = request.getParameter("houseOfProperty");
		String applyLimit = request.getParameter("applyLimit");
		String applyDate = request.getParameter("applyDate");
		String applyState = request.getParameter("applyState");
		String checkId = request.getParameter("checkId");
		String vaild = request.getParameter("vaild");

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

		UserApplyForLimitExample userApplyForLimitExample = new UserApplyForLimitExample();
		com.share.golden.entity.UserApplyForLimitExample.Criteria criteria = userApplyForLimitExample.createCriteria();
		if (!StringUtils.isEmpty(userId)) {
			criteria.andUserIdLike(userId + "%");
		}
		if (!StringUtils.isEmpty(originalCredit)) {
			criteria.andOriginalCreditBetween(null, null);
		}
		if (!StringUtils.isEmpty(houseOfProperty)) {
			criteria.andHouseOfPropertyLike(houseOfProperty + "%");
		}
		if (!StringUtils.isEmpty(applyLimit)) {
			criteria.andApplyLimitBetween(null, null);
		}
		if (!StringUtils.isEmpty(applyDate)) {
			criteria.andApplyDateBetween(null, null);
		}
		if (!StringUtils.isEmpty(applyState)) {
			criteria.andApplyStateLike(applyState + "%");
		}
		if (!StringUtils.isEmpty(checkId)) {
			criteria.andCheckIdLike(checkId + "%");
		}
		if (!StringUtils.isEmpty(vaild)) {
			criteria.andVaildLike(vaild + "%");
		}

		Page<Object> page = PageHelper.startPage(pageVO.getPageIndex() + 1, pageVO.getPageSize());
		List<UserApplyForLimit> listUserApplyForLimit = (List<UserApplyForLimit>) userApplyForLimitService
				.list(userApplyForLimitExample);
		pageVO.setRecordCount((int) page.getTotal());
		pageVO.setList(listUserApplyForLimit);
		return new PageWrap4EasyUI(pageVO);
	}

	@RequestMapping("deleteAj")
	@ResponseBody
	public ResponseContent delete(HttpServletRequest request, HttpServletResponse response) {
		ResponseContent responseContent = new ResponseContent();
		responseContent.setSuccess(true);
		try {
			userApplyForLimitService.delete(request.getParameter("applyCode"));
		} catch (Exception ex) {
			responseContent.setSuccess(false);
			responseContent.setMessage("删除失败");
		}
		return responseContent;
	}
}
