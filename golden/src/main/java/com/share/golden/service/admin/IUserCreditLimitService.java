package com.share.golden.service.admin;

import java.util.List;

import com.share.golden.entity.UserCreditLimit;
import com.share.golden.entity.UserCreditLimitExample;

public interface IUserCreditLimitService {
	public void insert(UserCreditLimit userCreditLimit);

	public void update(UserCreditLimit userCreditLimit);

	public void delete(String limitCode);

	public List<UserCreditLimit> list(UserCreditLimitExample userCreditLimitExample);

	public UserCreditLimit select(String limitCode);
}
