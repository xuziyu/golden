package com.share.golden.service.admin.imp;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.share.golden.dao.auto.UserTelephoneMapper;
import com.share.golden.entity.UserTelephone;
import com.share.golden.entity.UserTelephoneExample;
import com.share.golden.service.admin.IUserTelephoneService;



@Service("iUserTelephoneService")
public class UserTelephoneService implements IUserTelephoneService {
	@Autowired
	private UserTelephoneMapper userTelephoneMapper;

	@Override
	public void insert(UserTelephone userTelephone) {
		// TODO Auto-generated method stub
		userTelephoneMapper.insert(userTelephone);

	}

	@Override
	public void update(UserTelephone userTelephone) {
		// TODO Auto-generated method stub
		userTelephoneMapper.updateByPrimaryKeySelective(userTelephone);

	}

	@Override
	public void delete(String tid) {
		// TODO Auto-generated method stub
		userTelephoneMapper.deleteByPrimaryKey(tid);

	}

	@Override
	public List<UserTelephone> list(UserTelephoneExample userTelephoneExample) {
		// TODO Auto-generated method stub
		return userTelephoneMapper.selectByExample(userTelephoneExample);
	}

	@Override
	public UserTelephone select(String tid) {
		// TODO Auto-generated method stub
		return userTelephoneMapper.selectByPrimaryKey(tid);
	}

}
