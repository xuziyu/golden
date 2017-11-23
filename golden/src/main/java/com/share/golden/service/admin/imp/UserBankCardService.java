package com.share.golden.service.admin.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.share.golden.dao.auto.UserBankCardMapper;
import com.share.golden.entity.UserBankCard;
import com.share.golden.entity.UserBankCardExample;
import com.share.golden.service.admin.IUserBankCardService;

@Service("userBankCardService")
public class UserBankCardService implements IUserBankCardService {
	@Autowired
	private UserBankCardMapper userBankCardDao;

	@Override
	public void insert(UserBankCard userBankCard) {
		userBankCardDao.insertSelective(userBankCard);
	}

	@Override
	public void update(UserBankCard userBankCard) {
		userBankCardDao.updateByPrimaryKeySelective(userBankCard);
	}

	@Override
	public void delete(String cardId) {
		userBankCardDao.deleteByPrimaryKey(cardId);
	}

	@Override
	public List<UserBankCard> list(UserBankCardExample userBankCardExample) {
		return userBankCardDao.selectByExample(userBankCardExample);
	}

	@Override
	public UserBankCard select(String cardId) {
		return userBankCardDao.selectByPrimaryKey(cardId);
	}

}
