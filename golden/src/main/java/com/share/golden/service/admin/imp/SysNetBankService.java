package com.share.golden.service.admin.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.share.golden.dao.auto.SysNetBankMapper;
import com.share.golden.entity.SysNetBank;
import com.share.golden.entity.SysNetBankExample;
import com.share.golden.service.admin.ISysNetBankService;
@Service("netBankService")
public class SysNetBankService implements ISysNetBankService {
	@Autowired
	private SysNetBankMapper netBankDao;
	@Override
	public void insert(SysNetBank sysNetBank) {
		netBankDao.insertSelective(sysNetBank);
	}

	@Override
	public void update(SysNetBank sysNetBank) {
		netBankDao.updateByPrimaryKeySelective(sysNetBank);
	}

	@Override
	public void delete(String tradeId) {
		netBankDao.deleteByPrimaryKey(tradeId);
	}

	@Override
	public List<SysNetBank> list(SysNetBankExample sysNetBankExample) {
		return netBankDao.selectByExample(sysNetBankExample);
	}

	@Override
	public SysNetBank select(String tradeId) {
		return netBankDao.selectByPrimaryKey(tradeId);
	}

}
