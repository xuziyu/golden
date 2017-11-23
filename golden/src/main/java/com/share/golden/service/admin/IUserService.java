package com.share.golden.service.admin;

import java.util.List;

import com.share.golden.entity.BasUser;
import com.share.golden.entity.BasUserExample;

public interface IUserService {
	public void insert(BasUser user);

	public void update(BasUser user);

	public void delete(String userId);

	public List<BasUser> list(BasUserExample userExample);

	public BasUser select(String userId);
}
