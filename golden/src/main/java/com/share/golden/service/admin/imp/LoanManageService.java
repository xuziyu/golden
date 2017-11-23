package com.share.golden.service.admin.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.share.golden.dao.auto.BasUserMapper;
import com.share.golden.dao.auto.UserRealNameMapper;
import com.share.golden.entity.UserRealName;
import com.share.golden.entity.UserRealNameExample;
import com.share.golden.service.admin.ILoanManageService;

@Service("LoanManageService")
public class LoanManageService implements ILoanManageService {
	@Autowired
	private UserRealNameMapper userRealNameMapper;

	@Override
	public List<UserRealName> userRealNameQuery(UserRealNameExample userRealNameExample) {
		List<UserRealName> list = userRealNameMapper.selectByExample(userRealNameExample);
		return list;
	}

	@Override
	public void userRealNameConfirm() {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String key) {
		userRealNameMapper.deleteByPrimaryKey(key);

	}

	@Override
	public UserRealName load(String key) {
		UserRealName userRealName = userRealNameMapper.selectByPrimaryKey(key);
		return userRealName;
	}

	@Override
	public void save(UserRealName key) {
		userRealNameMapper.updateByPrimaryKeySelective(key);

	}

}
