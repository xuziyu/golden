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
import com.share.golden.entity.BasUser;
import com.share.golden.entity.BasUserExample;
import com.share.golden.entity.BasUserExample.Criteria;
import com.share.golden.framework.entity.PageVO;
import com.share.golden.framework.entity.PageWrap4EasyUI;
import com.share.golden.framework.entity.ResponseContent;
import com.share.golden.service.admin.IUserService;

@Controller
@RequestMapping("/admin/bas_user/")
public class UserAction {
	@Autowired
	private IUserService userService;

	@RequestMapping("list")
	public String list(HttpServletRequest request, HttpServletResponse response) {
		// 传一个主键id查询单个对象。
		request.setAttribute("basUser", userService.select(request.getParameter("userId")));
		return "admin/bas/user_list";
	}

	@RequestMapping("page")
	public String page(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest()
				.getSession();

		return "admin/bas/user_page";
	}

	@RequestMapping("save")
	public String save(BasUser basUser, HttpServletRequest request, HttpServletResponse response) {
		userService.update(basUser);
		return "redirect:page.action";
	}

	@RequestMapping("edit")
	public String edit(HttpServletRequest request, HttpServletResponse response) {
		String userId = request.getParameter("userId");
		if (StringUtils.isEmpty(userId)) {
		} else {
			BasUser basUser = userService.select(userId);
			request.setAttribute("basUser", basUser);
		}

		return "admin/bas/user_edit";
	}

	@RequestMapping("page_json")
	@ResponseBody
	public PageWrap4EasyUI pagejson(HttpServletRequest request, HttpServletResponse response) {
		String userNick = request.getParameter("userNick");
		String realName = request.getParameter("realName");
		String email = request.getParameter("email");
		String phoneNumber = request.getParameter("phoneNumber");
		String registerTime = request.getParameter("registerTime");
		String black = request.getParameter("black");
		String bankCardId = request.getParameter("bankCardId");

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

		BasUserExample basUserExample = new BasUserExample();
		Criteria criteria = basUserExample.createCriteria();
		if (!StringUtils.isEmpty(userNick)) {
			criteria.andUserNickLike(userNick + "%");
		}
		if (!StringUtils.isEmpty(realName)) {
			criteria.andRealNameLike(realName + "%");
		}
		if (!StringUtils.isEmpty(email)) {
			criteria.andEmailLike(email + "%");
		}
		if (!StringUtils.isEmpty(phoneNumber)) {
			criteria.andPhoneNumberLike(phoneNumber + "%");
		}
		// if(!StringUtils.isEmpty(registerTime)){
		// criteria.andRegisterTimeEqualTo(registerTime);
		// }
		if (!StringUtils.isEmpty(black)) {
			criteria.andBlackLike(black + "%");
		}
		if (!StringUtils.isEmpty(bankCardId)) {
			criteria.andBankCardIdLike(bankCardId + "%");
		}

		Page<Object> page = PageHelper.startPage(pageVO.getPageIndex() + 1, pageVO.getPageSize());
		List<BasUser> listBasUser = (List<BasUser>) userService.list(basUserExample);
		pageVO.setRecordCount((int) page.getTotal());
		pageVO.setList(listBasUser);
		return new PageWrap4EasyUI(pageVO);
	}

	@RequestMapping("deleteAj")
	@ResponseBody
	public ResponseContent delete(HttpServletRequest request, HttpServletResponse response) {
		ResponseContent responseContent = new ResponseContent();
		responseContent.setSuccess(true);
		try {
			userService.delete(request.getParameter("userId"));
		} catch (Exception ex) {
			responseContent.setSuccess(false);
			responseContent.setMessage("删除失败");
		}
		return responseContent;
	}
}
