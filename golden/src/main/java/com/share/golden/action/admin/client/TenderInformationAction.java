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
import com.share.golden.entity.BasTenderInformation;
import com.share.golden.entity.BasTenderInformationExample;
import com.share.golden.framework.entity.PageVO;
import com.share.golden.framework.entity.PageWrap4EasyUI;
import com.share.golden.framework.entity.ResponseContent;
import com.share.golden.service.admin.IBasTenderInformationService;

@Controller
@RequestMapping("/admin/TenderInformation/")
public class TenderInformationAction {
	@Autowired
	private IBasTenderInformationService tenderInformationService;

	@RequestMapping("list")
	public String list(HttpServletRequest request, HttpServletResponse response) {
		// 传一个主键id查询单个对象。
		request.setAttribute("basTenderInformation", tenderInformationService.select(request.getParameter("tenderId")));
		return "admin/bas/bas_tender_information_list";
	}

	@RequestMapping("page")
	public String page(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest()
				.getSession();
		/**
		 * ----------补充----------------
		 */
		return "admin/bas/bas_tender_information_page";
	}

	@RequestMapping("save")
	public String save(BasTenderInformation basTenderInformation, HttpServletRequest request,
			HttpServletResponse response) {
		/**
		 * ----------补充----------------
		 */
		tenderInformationService.update(basTenderInformation);
		return "redirect:page.action";
	}

	@RequestMapping("edit")
	public String edit(HttpServletRequest request, HttpServletResponse response) {
		String tenderId = request.getParameter("tenderId");
		if (StringUtils.isEmpty(tenderId)) {

		} else {
			BasTenderInformation basTenderInformation = tenderInformationService.select(tenderId);
			request.setAttribute("basTenderInformation", basTenderInformation);
		}

		return "admin/bas/bas_tender_information_edit";
	}

	@RequestMapping("page_json")
	@ResponseBody
	public PageWrap4EasyUI pagejson(HttpServletRequest request, HttpServletResponse response) {
		String userId = request.getParameter("userId");
		String markcount = request.getParameter("markcount");
		String lmcount = request.getParameter("lmcount");
		String gmcount = request.getParameter("gmcount");
		String markmoney = request.getParameter("markmoney");
		String markgain = request.getParameter("markgain");
		String markbegindate = request.getParameter("markbegindate");
		String markenddate = request.getParameter("markenddate");
		String date = request.getParameter("date");

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

		BasTenderInformationExample basTenderInformationExample = new BasTenderInformationExample();
		com.share.golden.entity.BasTenderInformationExample.Criteria criteria = basTenderInformationExample
				.createCriteria();
		if (!StringUtils.isEmpty(userId)) {
			criteria.andUserIdLike(userId + "%");
		}
		if (!StringUtils.isEmpty(markcount)) {
			criteria.andMarkcountLike(markcount + "%");
		}
		if (!StringUtils.isEmpty(lmcount)) {
			criteria.andLmcountLike(lmcount + "%");
		}
		if (!StringUtils.isEmpty(gmcount)) {
			criteria.andGmcountLike(gmcount + "%");
		}
		if (!StringUtils.isEmpty(markmoney)) {
			criteria.andMarkbegindateBetween(null, null);
		}
		if (!StringUtils.isEmpty(markgain)) {
			criteria.andMarkgainBetween(null, null);
		}
		if (!StringUtils.isEmpty(markbegindate)) {
			criteria.andMarkbegindateBetween(null, null);
		}
		if (!StringUtils.isEmpty(markenddate)) {
			criteria.andMarkenddateBetween(null, null);
		}
		if (!StringUtils.isEmpty(date)) {
			criteria.andDateBetween(null, null);
		}

		Page<Object> page = PageHelper.startPage(pageVO.getPageIndex() + 1, pageVO.getPageSize());
		List<BasTenderInformation> listBasTenderInformation = (List<BasTenderInformation>) tenderInformationService
				.list(basTenderInformationExample);
		pageVO.setRecordCount((int) page.getTotal());
		pageVO.setList(listBasTenderInformation);
		return new PageWrap4EasyUI(pageVO);
	}

	@RequestMapping("deleteAj")
	@ResponseBody
	public ResponseContent delete(HttpServletRequest request, HttpServletResponse response) {
		ResponseContent responseContent = new ResponseContent();
		responseContent.setSuccess(true);
		try {
			tenderInformationService.delete(request.getParameter("tenderId"));
		} catch (Exception ex) {
			responseContent.setSuccess(false);
			responseContent.setMessage("删除失败");
		}
		return responseContent;
	}
}
