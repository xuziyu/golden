package com.share.golden.service.admin.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.share.golden.dao.auto.UserCreditLimitMapper;
import com.share.golden.entity.UserCreditLimit;
import com.share.golden.entity.UserCreditLimitExample;
import com.share.golden.service.admin.IUserCreditLimitService;
@Service("userCreditLimitService")
public class UserCreditLimitService implements IUserCreditLimitService {
	@Autowired
	private UserCreditLimitMapper userCreditLimitDao;
	@Override
	public void insert(UserCreditLimit userCreditLimit) {
		userCreditLimitDao.insertSelective(userCreditLimit);
	}

	@Override
	public void update(UserCreditLimit userCreditLimit) {
		userCreditLimitDao.updateByPrimaryKeySelective(userCreditLimit);
	}

	@Override
	public void delete(String limitCode) {
		userCreditLimitDao.deleteByPrimaryKey(limitCode);
	}

	@Override
	public List<UserCreditLimit> list(UserCreditLimitExample userCreditLimitExample) {
		return userCreditLimitDao.selectByExample(userCreditLimitExample);
	}

	@Override
	public UserCreditLimit select(String limitCode) {
		return userCreditLimitDao.selectByPrimaryKey(limitCode);
	}

}
