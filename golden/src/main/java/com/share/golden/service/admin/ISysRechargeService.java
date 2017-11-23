package com.share.golden.service.admin;

import java.util.List;

import com.share.golden.entity.SysRecharge;
import com.share.golden.entity.SysRechargeExample;

public interface ISysRechargeService {
	public void insert(SysRecharge sysRecharge);

	public void delete(String rechargeId);

	public void updateByPrimaryKey(SysRecharge sysRecharge);

	public SysRecharge selectByPrimaryKey(String rechargeId);

	public List<SysRecharge> selectByExample(SysRechargeExample sysRechargeExample);
}
