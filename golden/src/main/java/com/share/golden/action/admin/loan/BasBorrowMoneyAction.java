package com.share.golden.action.admin.loan;

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
import com.share.golden.entity.BasBorrowMoney;
import com.share.golden.entity.BasBorrowMoneyExample;
import com.share.golden.framework.entity.PageVO;
import com.share.golden.framework.entity.PageWrap4EasyUI;
import com.share.golden.framework.entity.ResponseContent;
import com.share.golden.service.admin.IBasBorrowMoneyService;

@Controller
@RequestMapping("/admin/BasBorrowMoney/")
public class BasBorrowMoneyAction {
	@Autowired
	private IBasBorrowMoneyService borrowMoneyService;

	@RequestMapping("list")
	public String list(HttpServletRequest request, HttpServletResponse response) {
		// 传一个主键id查询单个对象。
		request.setAttribute("basBorrowMoney", borrowMoneyService.select(request.getParameter("borrowId")));
		return "admin/bas/bas_borrow_money";
	}

	@RequestMapping("page")
	public String page(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest().getSession();
		/**
		 * ----------补充----------------
		 */
		return "admin/bas/bas_borrow_money";
	}

	@RequestMapping("save")
	public String save(BasBorrowMoney basBorrowMoney,HttpServletRequest request, HttpServletResponse response) {
		if(StringUtils.isEmpty(request.getParameter("borrowId"))){
			
		}else{
			borrowMoneyService.update(basBorrowMoney);
		}
		return "redirect:page.action";
	}

	@RequestMapping("edit")
	public String edit(HttpServletRequest request, HttpServletResponse response) {
		String borrowId = request.getParameter("userId");
		if (StringUtils.isEmpty(borrowId)) {
		} else {
			BasBorrowMoney basBorrowMoney = borrowMoneyService.select(borrowId);
			request.setAttribute("basBorrowMoney", basBorrowMoney);
		}

		return "admin/bas/bas_borrow_money_edit";
	}

	@RequestMapping("BasBorrowMoneypage_json")
	@ResponseBody
	public PageWrap4EasyUI pagejson(HttpServletRequest request, HttpServletResponse response) {

		String userId = request.getParameter("userId");
		String borrowCompany = request.getParameter("borrowCompany");
		String borrowId = request.getParameter("borrowId");

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

		BasBorrowMoneyExample basBorrowMoneyExample = new BasBorrowMoneyExample();
		com.share.golden.entity.BasBorrowMoneyExample.Criteria criteria = basBorrowMoneyExample.createCriteria();

		if (!StringUtils.isEmpty(userId)) {
			criteria.andUserIdLike(userId + "%");
		}
		if (!StringUtils.isEmpty(borrowCompany)) {
			criteria.andBorrowCompanyLike(borrowCompany + "%");
		}

		if (!StringUtils.isEmpty(borrowId)) {
			criteria.andBorrowIdLike(borrowId + "%");
		}

		Page<Object> page = PageHelper.startPage(pageVO.getPageIndex() + 1, pageVO.getPageSize());
		List<BasBorrowMoney> listBasBorrowMoney = (List<BasBorrowMoney>) borrowMoneyService.list(basBorrowMoneyExample);
		pageVO.setRecordCount((int) page.getTotal());
		pageVO.setList(listBasBorrowMoney);
		return new PageWrap4EasyUI(pageVO);
	}

	@RequestMapping("deleteAj")
	@ResponseBody
	public ResponseContent delete(HttpServletRequest request, HttpServletResponse response) {
		ResponseContent responseContent = new ResponseContent();
		responseContent.setSuccess(true);
		try {
			borrowMoneyService.delete(request.getParameter("borrowId"));
		} catch (Exception ex) {
			responseContent.setSuccess(false);
			responseContent.setMessage("删除失败");
		}
		return responseContent;
	}
}
