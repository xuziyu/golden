package com.share.golden.service.admin.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.share.golden.dao.auto.SysRechargeMapper;
import com.share.golden.entity.SysRecharge;
import com.share.golden.entity.SysRechargeExample;
import com.share.golden.service.admin.ISysRechargeService;
@Service("sysRechargeService")
public class SysRechargeService implements ISysRechargeService {
	@Autowired
	private SysRechargeMapper sysRechargeDao;
	@Override
	public void insert(SysRecharge sysRecharge) {
		sysRechargeDao.insertSelective(sysRecharge);
	}

	@Override
	public void delete(String rechargeId) {
		sysRechargeDao.deleteByPrimaryKey(rechargeId);
	}

	@Override
	public void updateByPrimaryKey(SysRecharge sysRecharge) {
		sysRechargeDao.updateByPrimaryKeySelective(sysRecharge);
	}

	@Override
	public SysRecharge selectByPrimaryKey(String rechargeId) {
		return sysRechargeDao.selectByPrimaryKey(rechargeId);
	}

	@Override
	public List<SysRecharge> selectByExample(SysRechargeExample sysRechargeExample) {
		return sysRechargeDao.selectByExample(sysRechargeExample);
	}

}
