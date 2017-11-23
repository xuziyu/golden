package com.share.golden.service.admin.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.share.golden.dao.auto.BasRepaymentMapper;
import com.share.golden.entity.BasRepayment;
import com.share.golden.entity.BasRepaymentExample;
import com.share.golden.service.admin.IBasRepaymentService;

@Service("repaymentService")
public class BasRepaymentService implements IBasRepaymentService {
	@Autowired
	private BasRepaymentMapper repaymentDao;
	@Override
	public void insert(BasRepayment basRepayment) {
		repaymentDao.insertSelective(basRepayment);
	}

	@Override
	public void update(BasRepayment basRepayment) {
		repaymentDao.updateByPrimaryKeySelective(basRepayment);
	}

	@Override
	public void delete(String repayId) {
		repaymentDao.deleteByPrimaryKey(repayId);
	}

	@Override
	public List<BasRepayment> list(BasRepaymentExample basRepaymentExample) {
		return repaymentDao.selectByExample(basRepaymentExample);
	}

	@Override
	public BasRepayment select(String repayId) {
		return repaymentDao.selectByPrimaryKey(repayId);
	}

}
