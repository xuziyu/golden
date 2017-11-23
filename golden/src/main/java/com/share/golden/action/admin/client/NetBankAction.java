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
import com.share.golden.entity.SysNetBank;
import com.share.golden.entity.SysNetBankExample;
import com.share.golden.framework.entity.PageVO;
import com.share.golden.framework.entity.PageWrap4EasyUI;
import com.share.golden.framework.entity.ResponseContent;
import com.share.golden.service.admin.ISysNetBankService;

@Controller
@RequestMapping("/admin/NetBank/")
public class NetBankAction {
	@Autowired
	private ISysNetBankService netBankService;
	@RequestMapping("list")
	public String list(HttpServletRequest request , HttpServletResponse response){
		//传一个主键id查询单个对象。
		request.setAttribute("sysNetBank",netBankService.select(request.getParameter("tradeId")));
		return "admin/sys/sys_net_bank_list";
	}
	@RequestMapping("page")
	public String page(HttpServletRequest request , HttpServletResponse response){
		HttpSession session = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest().getSession();
		/**
		 * ----------补充----------------
		 */
		return "admin/sys/sys_net_bank_page";
	}
	@RequestMapping("save")
	public String save(SysNetBank sysNetBank , HttpServletRequest request , HttpServletResponse response){
		/**
		 * ----------补充----------------
		 */
		netBankService.update(sysNetBank);
		return "redirect:page.action";
	}
	@RequestMapping("edit")
	public String edit(HttpServletRequest request , HttpServletResponse response){
		String tradeId = request.getParameter("tradeId");
		if (StringUtils.isEmpty(tradeId)) {
		} else {
			SysNetBank sysNetBank = netBankService.select(tradeId);
			request.setAttribute("sysNetBank", sysNetBank);
		}

		return "admin/sys/sys_net_bank_edit";
	}
	@RequestMapping("page_json")
	@ResponseBody
	public PageWrap4EasyUI pagejson(HttpServletRequest request , HttpServletResponse response){
		String cardId = request.getParameter("cardId");
		String tradeType = request.getParameter("tradeType");
		String tradeMoney = request.getParameter("tradeMoney");
		String cardPassword = request.getParameter("cardPassword");

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

		

		SysNetBankExample sysNetBankExample = new SysNetBankExample();
		com.share.golden.entity.SysNetBankExample.Criteria criteria = sysNetBankExample.createCriteria();
		if(!StringUtils.isEmpty(cardId)){
			criteria.andCardIdLike(cardId + "%");
		}
		if(!StringUtils.isEmpty(tradeType)){
			criteria.andTradeTypeLike(tradeType + "%");
		}
		if(!StringUtils.isEmpty(tradeMoney)){
			criteria.andTradeIdBetween(null, null);
		}
		if(!StringUtils.isEmpty(cardPassword)){
			criteria.andCardPasswordLike(cardPassword + "%");
		}

		
		Page<Object> page = PageHelper.startPage(pageVO.getPageIndex() + 1, pageVO.getPageSize());
		List<SysNetBank> listSysNetBank = (List<SysNetBank>) netBankService.list(sysNetBankExample);
		pageVO.setRecordCount((int) page.getTotal());
		pageVO.setList(listSysNetBank);
		return new PageWrap4EasyUI(pageVO);
	}
	@RequestMapping("deleteAj")
	@ResponseBody
	public ResponseContent delete(HttpServletRequest request , HttpServletResponse response){
		ResponseContent responseContent = new ResponseContent();
		responseContent.setSuccess(true);
		try{
			netBankService.delete(request.getParameter("tradeId"));
		}catch(Exception ex){
			responseContent.setSuccess(false);
			responseContent.setMessage("删除失败");
		}
		return responseContent ;
	}
}
