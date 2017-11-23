package com.share.golden.service.admin;

import java.util.List;

import com.share.golden.entity.UserBankCard;
import com.share.golden.entity.UserBankCardExample;

public interface IUserBankCardService {
	public void insert(UserBankCard userBankCard);

	public void update(UserBankCard userBankCard);

	public void delete(String cardId);

	public List<UserBankCard> list(UserBankCardExample userBankCardExample);

	public UserBankCard select(String cardId);
}
