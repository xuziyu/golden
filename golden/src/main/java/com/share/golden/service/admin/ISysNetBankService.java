package com.share.golden.service.admin;

import java.util.List;

import com.share.golden.entity.SysNetBank;
import com.share.golden.entity.SysNetBankExample;

public interface ISysNetBankService {
	public void insert(SysNetBank sysNetBank);

	public void update(SysNetBank sysNetBank);

	public void delete(String tradeId);

	public List<SysNetBank> list(SysNetBankExample sysNetBankExample);

	public SysNetBank select(String tradeId);
}
