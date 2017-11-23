package com.share.golden.service.admin.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.share.golden.dao.auto.BasProductMapper;
import com.share.golden.entity.BasProduct;
import com.share.golden.entity.BasProductExample;
import com.share.golden.service.admin.IBasProductService;
@Service("basProductService")
public class BasProductService implements IBasProductService {
	@Autowired
	private BasProductMapper basProductDao;
	@Override
	public void insert(BasProduct basProduct) {
		basProductDao.insertSelective(basProduct);
	}

	@Override
	public void delete(String productId) {
		basProductDao.deleteByPrimaryKey(productId);
	}

	@Override
	public void updateByPrimaryKey(BasProduct basProduct) {
		basProductDao.updateByPrimaryKeySelective(basProduct);
	}

	@Override
	public BasProduct selectByPrimaryKey(String productId) {
		return basProductDao.selectByPrimaryKey(productId);
	}

	@Override
	public List<BasProduct> selectByExample(BasProductExample basProductExample) {
		return basProductDao.selectByExample(basProductExample);
	}

}
