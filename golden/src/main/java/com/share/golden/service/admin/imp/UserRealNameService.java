package com.share.golden.service.admin.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.share.golden.dao.auto.UserRealNameMapper;
import com.share.golden.entity.UserRealName;
import com.share.golden.entity.UserRealNameExample;
import com.share.golden.service.admin.IUserRealNameService;
@Service("iUserRealNameService")
public class UserRealNameService implements IUserRealNameService{
	@Autowired
	private UserRealNameMapper userRealNameMapper;
	

	@Override
	public void insert(UserRealName userRealName) {
		// TODO Auto-generated method stub
		userRealNameMapper.insert(userRealName);
		
	}

	@Override
	public void update(UserRealName userRealName) {
		// TODO Auto-generated method stub
		userRealNameMapper.updateByPrimaryKeySelective(userRealName);
		
	}

	@Override
	public void delete(String realId) {
		// TODO Auto-generated method stub
		userRealNameMapper.deleteByPrimaryKey(realId);
		
	}

	@Override
	public List<UserRealName> list(UserRealNameExample userRealNameExample) {
		// TODO Auto-generated method stub
		return userRealNameMapper.selectByExample(userRealNameExample);
	}

	@Override
	public UserRealName select(String realId) {
		// TODO Auto-generated method stub
		return userRealNameMapper.selectByPrimaryKey(realId);
	}
	

}
