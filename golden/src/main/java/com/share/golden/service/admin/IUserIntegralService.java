package com.share.golden.service.admin;

import java.util.List;

import com.share.golden.entity.UserIntegral;
import com.share.golden.entity.UserIntegralExample;

public interface IUserIntegralService {
	public void insert(UserIntegral userIntegral);

	public void update(UserIntegral userIntegral);

	public void delete(String cuserId);

	public List<UserIntegral> list(UserIntegralExample userIntegralExample);

	public UserIntegral select(String cuserId);
}
