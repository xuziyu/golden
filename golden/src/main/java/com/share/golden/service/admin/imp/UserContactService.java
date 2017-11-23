package com.share.golden.service.admin.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.share.golden.dao.auto.UserContactMapper;
import com.share.golden.entity.UserContact;
import com.share.golden.entity.UserContactExample;
import com.share.golden.service.admin.IUserContactService;
@Service("userContactService")
public class UserContactService implements IUserContactService {
	@Autowired
	private UserContactMapper userContactDao;
	@Override
	public void insert(UserContact userContact) {
		userContactDao.insertSelective(userContact);
	}

	@Override
	public void update(UserContact user) {
		userContactDao.updateByPrimaryKeySelective(user);
	}

	@Override
	public void delete(String contactId) {
		userContactDao.deleteByPrimaryKey(contactId);
	}

	@Override
	public List<UserContact> list(UserContactExample userContactExample) {
		return userContactDao.selectByExample(userContactExample);
	}

	@Override
	public UserContact select(String contactId) {
		// TODO Auto-generated method stub
		return userContactDao.selectByPrimaryKey(contactId);
	}

}
