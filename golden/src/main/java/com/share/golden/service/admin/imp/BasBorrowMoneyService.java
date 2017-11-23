package com.share.golden.service.admin.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.share.golden.dao.auto.BasBorrowMoneyMapper;
import com.share.golden.entity.BasBorrowMoney;
import com.share.golden.entity.BasBorrowMoneyExample;
import com.share.golden.entity.BasUser;
import com.share.golden.service.admin.IBasBorrowMoneyService;

@Service("borrowMoneyService")
public class BasBorrowMoneyService implements IBasBorrowMoneyService {
	@Autowired
	public BasBorrowMoneyMapper borrowMoneyDao;

	@Override
	public void insert(BasBorrowMoney borrowMoney) {
		borrowMoneyDao.insert(borrowMoney);
	}

	@Override
	public void update(BasBorrowMoney borrowMoney) {
		borrowMoneyDao.updateByPrimaryKeySelective(borrowMoney);
	}

	@Override
	public void delete(String borrowId) {
		borrowMoneyDao.deleteByPrimaryKey(borrowId);
	}

	@Override
	public List<BasBorrowMoney> list(BasBorrowMoneyExample borrowMoneyExample) {
		return borrowMoneyDao.selectByExample(borrowMoneyExample);
	}

	@Override
	public BasBorrowMoney select(String borrowId) {
		return borrowMoneyDao.selectByPrimaryKey(borrowId);
	}

}
