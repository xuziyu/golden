package com.share.golden.service.admin.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.share.golden.dao.auto.SysTradeMapper;
import com.share.golden.entity.SysTrade;
import com.share.golden.entity.SysTradeExample;
import com.share.golden.service.admin.ISysTradeService;

@Service("iSysTradeService")
public class SysTradeService implements ISysTradeService {
	@Autowired
	private SysTradeMapper sysTradeMapper;

	@Override
	public void insert(SysTrade sysTrade) {
		// TODO Auto-generated method stub
		sysTradeMapper.insert(sysTrade);

	}

	@Override
	public void update(SysTrade sysTrade) {
		// TODO Auto-generated method stub
		sysTradeMapper.updateByPrimaryKeySelective(sysTrade);
	}

	@Override
	public void delete(String tradeId) {
		// TODO Auto-generated method stub
		sysTradeMapper.deleteByPrimaryKey(tradeId);
	}

	@Override
	public List<SysTrade> list(SysTradeExample sysTradeExample) {
		// TODO Auto-generated method stub
		return sysTradeMapper.selectByExample(sysTradeExample);
	}

	@Override
	public SysTrade select(String tradeId) {
		// TODO Auto-generated method stub
		return sysTradeMapper.selectByPrimaryKey(tradeId);
	}

}
