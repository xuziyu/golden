package com.share.golden.service.admin.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.share.golden.dao.auto.SysVipMapper;
import com.share.golden.entity.SysVip;
import com.share.golden.entity.SysVipExample;
import com.share.golden.service.admin.ISysVipService;

@Service("vipService")
public class SysVipService implements ISysVipService {
	@Autowired
	private SysVipMapper vipDao;

	@Override
	public void insert(SysVip sysVip) {
		vipDao.insertSelective(sysVip);
	}

	@Override
	public void update(SysVip sysVip) {
		vipDao.updateByPrimaryKeySelective(sysVip);
	}

	@Override
	public void delete(String vipId) {
		vipDao.deleteByPrimaryKey(vipId);
	}

	@Override
	public List<SysVip> list(SysVipExample sysVipExample) {
		return vipDao.selectByExample(sysVipExample);
	}

	@Override
	public SysVip select(String vipId) {
		return vipDao.selectByPrimaryKey(vipId);
	}

}
