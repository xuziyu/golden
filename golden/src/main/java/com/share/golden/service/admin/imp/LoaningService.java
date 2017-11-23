package com.share.golden.service.admin.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.share.golden.dao.auto.UserApplyForLimitMapper;
import com.share.golden.entity.UserApplyForLimit;
import com.share.golden.entity.UserApplyForLimitExample;
import com.share.golden.service.admin.ILoaningService;
@Service("LoaningService")
public class LoaningService implements ILoaningService {
	@Autowired
	private UserApplyForLimitMapper applyForLimitMapper;

	@Override
	public List<UserApplyForLimit> UserApplyForLimitQuery(UserApplyForLimitExample userApplyForLimitExample) {
		List<UserApplyForLimit> list=applyForLimitMapper.selectByExample(userApplyForLimitExample);
		return list;
	}

	@Override
	public void UserApplyForLimitConfirm() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserApplyForLimit load(String key) {
		UserApplyForLimit userApplyForLimit = applyForLimitMapper.selectByPrimaryKey(key);
	  return userApplyForLimit;
	}

	@Override
	public void save(UserApplyForLimit code) {
		applyForLimitMapper.updateByPrimaryKeySelective(code);
		
	}

	
	}

	


