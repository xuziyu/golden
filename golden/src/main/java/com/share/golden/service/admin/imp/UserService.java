package com.share.golden.service.admin.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.share.golden.dao.auto.BasUserMapper;
import com.share.golden.entity.BasUser;
import com.share.golden.entity.BasUserExample;
import com.share.golden.service.admin.IUserService;
@Service("userService")
public class UserService implements IUserService {
	@Autowired
	private BasUserMapper basUserDao;
	@Override
	public void update(BasUser user) {
		basUserDao.updateByPrimaryKeySelective(user);
	}

	@Override
	public void delete(String userId) {
		basUserDao.deleteByPrimaryKey(userId);
	}

	@Override
	public List<BasUser> list(BasUserExample userExample) {
		return basUserDao.selectByExample(userExample);
	}

	@Override
	public void insert(BasUser user) {
		basUserDao.insert(user);
	}

	@Override
	public BasUser select(String userId) {
		return basUserDao.selectByPrimaryKey(userId);
	}
	
}
