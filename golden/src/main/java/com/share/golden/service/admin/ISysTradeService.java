package com.share.golden.service.admin;

import java.util.List;

import com.share.golden.entity.SysTrade;
import com.share.golden.entity.SysTradeExample;



public interface ISysTradeService {
	public void insert(SysTrade sysTrade );
	public void update(SysTrade sysTrade );
	public void delete( String tradeId);
	public List<SysTrade> list(SysTradeExample sysTradeExample);
	public SysTrade select(String tradeId);

}
