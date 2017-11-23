package com.share.golden.service.admin.imp;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.share.golden.dao.auto.UserAccountAssetsMapper;
import com.share.golden.entity.UserAccountAssets;
import com.share.golden.entity.UserAccountAssetsExample;
import com.share.golden.service.admin.IUserAccountAssetsService;

@Service("accountAssetsService")
public class UserAccountAssetsService implements IUserAccountAssetsService {
	@Autowired
	private UserAccountAssetsMapper userAccountAssetsDao;

	@Override
	public void insert(UserAccountAssets userAccountAssets) {
		userAccountAssetsDao.insertSelective(userAccountAssets);
	}

	@Override
	public void update(UserAccountAssets userAccountAssets) {
		userAccountAssetsDao.updateByPrimaryKeySelective(userAccountAssets);
	}

	@Override
	public void delete(BigDecimal accountId) {
		userAccountAssetsDao.deleteByPrimaryKey(accountId);
	}

	@Override
	public List<UserAccountAssets> list(UserAccountAssetsExample userAccountAssetsExample) {
		return userAccountAssetsDao.selectByExample(userAccountAssetsExample);
	}

	@Override
	public UserAccountAssets select(BigDecimal accountId) {
		return userAccountAssetsDao.selectByPrimaryKey(accountId);
	}

}
