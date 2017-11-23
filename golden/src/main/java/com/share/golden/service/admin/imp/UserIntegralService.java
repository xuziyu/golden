package com.share.golden.service.admin.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.share.golden.dao.auto.UserIntegralMapper;
import com.share.golden.entity.UserIntegral;
import com.share.golden.entity.UserIntegralExample;
import com.share.golden.service.admin.IUserIntegralService;
@Service("userIntegralService")
public class UserIntegralService implements IUserIntegralService {
	@Autowired
	private UserIntegralMapper userIntegralDao;
	@Override
	public void insert(UserIntegral userIntegral) {
		userIntegralDao.insertSelective(userIntegral);
	}

	@Override
	public void update(UserIntegral userIntegral) {
		userIntegralDao.updateByPrimaryKeySelective(userIntegral);
	}

	@Override
	public void delete(String cuserId) {
		userIntegralDao.deleteByPrimaryKey(cuserId);
	}

	@Override
	public List<UserIntegral> list(UserIntegralExample userIntegralExample) {
		return userIntegralDao.selectByExample(userIntegralExample);
	}

	@Override
	public UserIntegral select(String cuserId) {
		return userIntegralDao.selectByPrimaryKey(cuserId);
	}

}
