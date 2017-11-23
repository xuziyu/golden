package com.share.golden.service.admin;

import java.util.List;

import com.share.golden.entity.UserApplyForLimit;
import com.share.golden.entity.UserApplyForLimitExample;

public interface ILoaningService {
public List<UserApplyForLimit> UserApplyForLimitQuery(UserApplyForLimitExample user);
public void UserApplyForLimitConfirm();
public void delete(String key);
public UserApplyForLimit load(String key);
public void save(UserApplyForLimit code);
}
