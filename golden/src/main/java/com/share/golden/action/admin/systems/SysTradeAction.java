package com.share.golden.action.admin.systems;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.share.golden.entity.SysTrade;
import com.share.golden.entity.SysTradeExample;
import com.share.golden.entity.SysTradeExample.Criteria;
import com.share.golden.framework.entity.PageVO;
import com.share.golden.framework.entity.PageWrap4EasyUI;
import com.share.golden.framework.entity.ResponseContent;
import com.share.golden.service.admin.ISysTradeService;

@Controller
@RequestMapping("/admin/trade/")
public class SysTradeAction {
	
	@Autowired
	private ISysTradeService iSysTradeService;
	
	@RequestMapping("list")
	public String list(HttpServletRequest request,HttpServletResponse response){
		
		request.setAttribute("sysTrade",iSysTradeService.select(request.getParameter("tradeId")));
		return "admin/sys/sys_trade_list";
	}
	@RequestMapping("page")
	public String page(HttpServletRequest request , HttpServletResponse response){
		HttpSession session = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest().getSession();
		
		return "admin/sys/sys_trade_page";
	}
	@RequestMapping("save")
	public String save(SysTrade sysTrade ,HttpServletRequest request , HttpServletResponse response){

		
		iSysTradeService.update(sysTrade);
		return "redirect:page.action";
	}
	@RequestMapping("edit")
	public String edit(HttpServletRequest request , HttpServletResponse response){
		String tradeId = request.getParameter("tradeId");
		if (StringUtils.isEmpty(tradeId)) {
			
		} else {
			
			SysTrade sysTrade =iSysTradeService.select(tradeId);
			request.setAttribute("sysTrade", sysTrade);
		}

		return "admin/sys/sys_trade_edit";
	}
	@RequestMapping("page_json")
	@ResponseBody
	public PageWrap4EasyUI pagejson(HttpServletRequest request , HttpServletResponse response){
		
		String userI=request.getParameter("userI");
		String tradeMoney=request.getParameter("tradeMoney");
	
		

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

		

		SysTradeExample sysTradeExample = new SysTradeExample();
		Criteria criteria = sysTradeExample.createCriteria();
	
		if(!StringUtils.isEmpty(userI)){
			criteria.andUserILike(userI + "%");
			
		}
		if(!StringUtils.isEmpty(tradeMoney)){
			criteria.andTradeMoneyLike(tradeMoney + "%");
		}
		
		Page<Object> page = PageHelper.startPage(pageVO.getPageIndex() + 1, pageVO.getPageSize());
		List<SysTrade> listSysTrade = (List<SysTrade>) iSysTradeService.list(sysTradeExample);
		pageVO.setRecordCount((int) page.getTotal());
		pageVO.setList(listSysTrade);
		return new PageWrap4EasyUI(pageVO);
	}
	@RequestMapping("deleteAj")
	@ResponseBody
	public ResponseContent delete(HttpServletRequest request , HttpServletResponse response){
		ResponseContent responseContent = new ResponseContent();
		responseContent.setSuccess(true);
		try{
			iSysTradeService.delete(request.getParameter("tradeId"));
		}catch(Exception ex){
			responseContent.setSuccess(false);
			responseContent.setMessage("删除失败");
		}
		return responseContent ;
	}

}
