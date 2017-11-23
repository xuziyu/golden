package com.share.golden.service.admin;

import java.util.List;

import com.share.golden.entity.UserRealName;
import com.share.golden.entity.UserRealNameExample;

public interface IUserRealNameService {

	public void insert(UserRealName userRealName);

	public void update(UserRealName userRealName);

	public void delete(String realId);

	public List<UserRealName> list(UserRealNameExample userRealNameExample);

	public UserRealName select(String realId);

}
