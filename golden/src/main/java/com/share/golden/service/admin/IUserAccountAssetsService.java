package com.share.golden.service.admin;

import java.math.BigDecimal;
import java.util.List;

import com.share.golden.entity.UserAccountAssets;
import com.share.golden.entity.UserAccountAssetsExample;

public interface IUserAccountAssetsService {
	public void insert(UserAccountAssets userAccountAssets);

	public void update(UserAccountAssets userAccountAssets);

	public void delete(BigDecimal accountId);

	public List<UserAccountAssets> list(UserAccountAssetsExample userAccountAssetsExample);

	public UserAccountAssets select(BigDecimal accountId);
}
