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
import com.share.golden.entity.UserIntegral;
import com.share.golden.entity.UserIntegralExample;
import com.share.golden.framework.entity.PageVO;
import com.share.golden.framework.entity.PageWrap4EasyUI;
import com.share.golden.framework.entity.ResponseContent;
import com.share.golden.service.admin.IUserIntegralService;

@Controller
@RequestMapping("/admin/UserIntegral/")
public class UserIntegralAction {
	@Autowired
	private IUserIntegralService userIntegralService;

	@RequestMapping("list")
	public String list(HttpServletRequest request, HttpServletResponse response) {
		// 传一个主键id查询单个对象。
		request.setAttribute("userIntegral", userIntegralService.select(request.getParameter("cuserId")));
		return "admin/user/user_integral_list";
	}

	@RequestMapping("page")
	public String page(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest()
				.getSession();
		/**
		 * ----------补充----------------
		 */
		return "admin/user/user_integral_page";
	}

	@RequestMapping("save")
	public String save(UserIntegral userIntegral, HttpServletRequest request, HttpServletResponse response) {
		/**
		 * ----------补充----------------
		 */
		userIntegralService.update(userIntegral);
		return "redirect:page.action";
	}

	@RequestMapping("edit")
	public String edit(HttpServletRequest request, HttpServletResponse response) {
		String cuserId = request.getParameter("cuserId");
		if (StringUtils.isEmpty(cuserId)) {
		} else {
			UserIntegral userIntegral = userIntegralService.select(cuserId);
			request.setAttribute("userIntegral", userIntegral);
		}

		return "admin/user/user_integral_edit";
	}

	@RequestMapping("page_json")
	@ResponseBody
	public PageWrap4EasyUI pagejson(HttpServletRequest request, HttpServletResponse response) {
		String userId = request.getParameter("userId");
		String creditPoint = request.getParameter("creditPoint");
		String memberPoint = request.getParameter("memberPoint");

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

		UserIntegralExample userIntegralExample = new UserIntegralExample();
		com.share.golden.entity.UserIntegralExample.Criteria criteria = userIntegralExample.createCriteria();
		if (!StringUtils.isEmpty(userId)) {
			criteria.andUserIdLike(userId + "%");
		}
		if (!StringUtils.isEmpty(creditPoint)) {
			criteria.andCreditPointBetween(null, null);
		}
		if (!StringUtils.isEmpty(memberPoint)) {
			criteria.andMemberPointBetween(null, null);
		}

		Page<Object> page = PageHelper.startPage(pageVO.getPageIndex() + 1, pageVO.getPageSize());
		List<UserIntegral> listUserIntegral = (List<UserIntegral>) userIntegralService.list(userIntegralExample);
		pageVO.setRecordCount((int) page.getTotal());
		pageVO.setList(listUserIntegral);
		return new PageWrap4EasyUI(pageVO);
	}

	@RequestMapping("deleteAj")
	@ResponseBody
	public ResponseContent delete(HttpServletRequest request, HttpServletResponse response) {
		ResponseContent responseContent = new ResponseContent();
		responseContent.setSuccess(true);
		try {
			userIntegralService.delete(request.getParameter("cuserId"));
		} catch (Exception ex) {
			responseContent.setSuccess(false);
			responseContent.setMessage("删除失败");
		}
		return responseContent;
	}
}
