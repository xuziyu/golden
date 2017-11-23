package com.share.golden.service.admin;

import java.util.List;

import com.share.golden.entity.BasProduct;
import com.share.golden.entity.BasProductExample;

public interface IBasProductService {
	public void insert(BasProduct basProduct);

	public void delete(String productId);

	public void updateByPrimaryKey(BasProduct basProduct);

	public BasProduct selectByPrimaryKey(String productId);

	public List<BasProduct> selectByExample(BasProductExample basProductExample);
}
