package com.share.golden.service.admin.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.share.golden.dao.auto.SysMainAccoutMapper;
import com.share.golden.entity.SysMainAccout;
import com.share.golden.entity.SysMainAccoutExample;
import com.share.golden.service.admin.ISysMainAccoutService;
@Service("SysMainAccoutService")
public class SysMainAccoutService implements ISysMainAccoutService {
	@Autowired
	private SysMainAccoutMapper applyForLimitMapper;

	@Override
	public List<SysMainAccout> SysMainAccoutQuery(SysMainAccoutExample SysMainAccoutExample) {
		List<SysMainAccout> list=applyForLimitMapper.selectByExample(SysMainAccoutExample);
		return list;
	}

	@Override
	public void SysMainAccoutConfirm() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SysMainAccout load(String key) {
		SysMainAccout userApplyForLimit = applyForLimitMapper.selectByPrimaryKey(key);
	  return userApplyForLimit;
	}

	@Override
	public void save(SysMainAccout code) {
		applyForLimitMapper.updateByPrimaryKeySelective(code);
		
	}

	
	}

	


