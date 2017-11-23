package com.share.golden.service.admin;

import java.util.List;

import com.share.golden.entity.UserApplyForLimit;
import com.share.golden.entity.UserApplyForLimitExample;

public interface IUserApplyForLimitService {
	public void insert(UserApplyForLimit userApplyForLimit);

	public void update(UserApplyForLimit userApplyForLimit);

	public void delete(String applyCode);

	public List<UserApplyForLimit> list(UserApplyForLimitExample userApplyForLimitExample);

	public UserApplyForLimit select(String applyCode);
}
