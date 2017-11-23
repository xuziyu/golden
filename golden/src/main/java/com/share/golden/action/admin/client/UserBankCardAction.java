package com.share.golden.action.admin.client;

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
import com.share.golden.entity.UserBankCard;
import com.share.golden.entity.UserBankCardExample;
import com.share.golden.framework.entity.PageVO;
import com.share.golden.framework.entity.PageWrap4EasyUI;
import com.share.golden.framework.entity.ResponseContent;
import com.share.golden.service.admin.IUserBankCardService;

@Controller
@RequestMapping("/admin/UserBankCard/")
public class UserBankCardAction {
	@Autowired
	private IUserBankCardService userBankCardService;

	@RequestMapping("list")
	public String list(HttpServletRequest request, HttpServletResponse response) {
		// 传一个主键id查询单个对象。
		request.setAttribute("userBankCard", userBankCardService.select(request.getParameter("cardId")));
		return "admin/user/user_bank_card_list";
	}

	@RequestMapping("page")
	public String page(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest()
				.getSession();

		return "admin/user/user_bank_card_page";
	}

	@RequestMapping("save")
	public String save(UserBankCard userBankCard, HttpServletRequest request, HttpServletResponse response) {

		userBankCardService.update(userBankCard);
		return "redirect:page.action";
	}

	@RequestMapping("edit")
	public String edit(HttpServletRequest request, HttpServletResponse response) {
		String cardId = request.getParameter("cardId");
		if (StringUtils.isEmpty(cardId)) {
		} else {
			UserBankCard userBankCard = userBankCardService.select(cardId);
			request.setAttribute("userBankCard", userBankCard);
		}

		return "admin/user/user_bank_card_edit";
	}

	@RequestMapping("page_json")
	@ResponseBody
	public PageWrap4EasyUI pagejson(UserBankCard userBankCard, HttpServletRequest request,
			HttpServletResponse response) {

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

		UserBankCardExample userBankCardExample = new UserBankCardExample();
		com.share.golden.entity.UserBankCardExample.Criteria criteria = userBankCardExample.createCriteria();
		String userId = userBankCard.getUserId();
		String tradeCode = userBankCard.getTradeCode();
		String identityNumber = userBankCard.getIdentityNumber();
		String bankName = userBankCard.getBankName();
		Date submitTime = userBankCard.getSubmitTime();
		String state = userBankCard.getState();
		Integer blance = userBankCard.getBlance();
		if (!StringUtils.isEmpty(userId)) {
			criteria.andUserIdLike(userId + "%");
		}
		if (!StringUtils.isEmpty(tradeCode)) {
			criteria.andTradeCodeLike(tradeCode + "%");
		}
		if (!StringUtils.isEmpty(identityNumber)) {
			criteria.andIdentityNumberLike(identityNumber + "%");
		}
		if (!StringUtils.isEmpty(bankName)) {
			criteria.andBankNameLike(bankName + "%");
		}
		if (!StringUtils.isEmpty(submitTime)) {
			criteria.andSubmitTimeBetween(null, null);
		}
		if (!StringUtils.isEmpty(state)) {
			criteria.andStateLike(state + "%");
		}
		if (!StringUtils.isEmpty(blance)) {
			criteria.andBlanceBetween(null, null);
		}

		Page<Object> page = PageHelper.startPage(pageVO.getPageIndex() + 1, pageVO.getPageSize());
		List<UserBankCard> listUserBankCard = (List<UserBankCard>) userBankCardService.list(userBankCardExample);
		pageVO.setRecordCount((int) page.getTotal());
		pageVO.setList(listUserBankCard);
		return new PageWrap4EasyUI(pageVO);
	}

	@RequestMapping("deleteAj")
	@ResponseBody
	public ResponseContent delete(HttpServletRequest request, HttpServletResponse response) {
		ResponseContent responseContent = new ResponseContent();
		responseContent.setSuccess(true);
		try {
			userBankCardService.delete(request.getParameter("cardId"));
		} catch (Exception ex) {
			responseContent.setSuccess(false);
			responseContent.setMessage("删除失败");
		}
		return responseContent;
	}
}
