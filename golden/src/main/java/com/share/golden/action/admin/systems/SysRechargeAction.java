package com.share.golden.action.admin.systems;

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
import com.share.golden.entity.SysRecharge;
import com.share.golden.entity.SysRechargeExample;
import com.share.golden.framework.entity.PageVO;
import com.share.golden.framework.entity.PageWrap4EasyUI;
import com.share.golden.framework.entity.ResponseContent;
import com.share.golden.service.admin.ISysRechargeService;

@Controller
@RequestMapping("/admin/SysRecharge/")
public class SysRechargeAction {
	@Autowired
	private ISysRechargeService sysRechargeService;

	@RequestMapping("list")
	public String list(HttpServletRequest request, HttpServletResponse response) {
		// 传一个主键id查询单个对象。
		request.setAttribute("sysRecharge", sysRechargeService.selectByPrimaryKey(request.getParameter("rechargeId")));
		return "admin/sys/sys_recharge_list";
	}

	@RequestMapping("page")
	public String page(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest()
				.getSession();

		return "admin/sys/sys_recharge_page";
	}

	@RequestMapping("save")
	public String save(SysRecharge sysRecharge, HttpServletRequest request, HttpServletResponse response) {
		sysRechargeService.updateByPrimaryKey(sysRecharge);
		return "redirect:page.action";
	}

	@RequestMapping("edit")
	public String edit(HttpServletRequest request, HttpServletResponse response) {
		String rechargeId = request.getParameter("rechargeId");
		if (StringUtils.isEmpty(rechargeId)) {
		} else {
			SysRecharge sysRecharge = sysRechargeService.selectByPrimaryKey(rechargeId);
			request.setAttribute("sysRecharge", sysRecharge);
		}

		return "admin/sys/sys_recharge_edit";
	}

	@RequestMapping("page_json")
	@ResponseBody
	public PageWrap4EasyUI pagejson(SysRecharge sysRecharge ,HttpServletRequest request, HttpServletResponse response) {
		String rechargeCode = sysRecharge.getRechargeCode();
		String userId = sysRecharge.getUserId();
		String rechargeType = sysRecharge.getRechargeType();
		String rechargeMoney = sysRecharge.getRechargeMoney();
		Date rechargeTime = sysRecharge.getRechargeTime();
		String rechargeStatu = sysRecharge.getRechargeStatu();

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

		SysRechargeExample sysRechargeExample = new SysRechargeExample();
		com.share.golden.entity.SysRechargeExample.Criteria criteria = sysRechargeExample.createCriteria();
		if (!StringUtils.isEmpty(rechargeCode)) {
			criteria.andRechargeCodeLike(rechargeCode + "%");
		}
		if (!StringUtils.isEmpty(userId)) {
			criteria.andUserIdLike(userId + "%");
		}
		if (!StringUtils.isEmpty(rechargeType)) {
			criteria.andRechargeTypeLike(rechargeType + "%");
		}
		if (!StringUtils.isEmpty(rechargeMoney)) {
			criteria.andRechargeMoneyLike(rechargeMoney + "%");
		}
		if (!StringUtils.isEmpty(rechargeTime)) {
			criteria.andRechargeTimeBetween(null, null);
		}
		if (!StringUtils.isEmpty(rechargeStatu)) {
			criteria.andRechargeStatuLike(rechargeStatu + "%");
		}


		Page<Object> page = PageHelper.startPage(pageVO.getPageIndex() + 1, pageVO.getPageSize());
		List<SysRecharge> listSysRecharge = (List<SysRecharge>) sysRechargeService.selectByExample(sysRechargeExample);
		pageVO.setRecordCount((int) page.getTotal());
		pageVO.setList(listSysRecharge);
		return new PageWrap4EasyUI(pageVO);
	}

	@RequestMapping("deleteAj")
	@ResponseBody
	public ResponseContent delete(HttpServletRequest request, HttpServletResponse response) {
		ResponseContent responseContent = new ResponseContent();
		responseContent.setSuccess(true);
		try {
			sysRechargeService.delete(request.getParameter("rechargeId"));
		} catch (Exception ex) {
			responseContent.setSuccess(false);
			responseContent.setMessage("删除失败");
		}
		return responseContent;
	}
}
