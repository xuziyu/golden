package com.share.golden.service.admin.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.share.golden.dao.auto.UserApplyForLimitMapper;
import com.share.golden.entity.UserApplyForLimit;
import com.share.golden.entity.UserApplyForLimitExample;
import com.share.golden.service.admin.IUserApplyForLimitService;

@Service("userApplyForLimitService")
public class UserApplyForLimitService implements IUserApplyForLimitService {
	@Autowired
	private UserApplyForLimitMapper userApplyForLimitDao;

	@Override
	public void insert(UserApplyForLimit userApplyForLimit) {
		userApplyForLimitDao.insertSelective(userApplyForLimit);
	}

	@Override
	public void update(UserApplyForLimit userApplyForLimit) {
		userApplyForLimitDao.updateByPrimaryKeySelective(userApplyForLimit);
	}

	@Override
	public void delete(String applyCode) {
		userApplyForLimitDao.deleteByPrimaryKey(applyCode);
	}

	@Override
	public List<UserApplyForLimit> list(UserApplyForLimitExample userApplyForLimitExample) {
		return userApplyForLimitDao.selectByExample(userApplyForLimitExample);
	}

	@Override
	public UserApplyForLimit select(String applyCode) {
		return userApplyForLimitDao.selectByPrimaryKey(applyCode);
	}

}
