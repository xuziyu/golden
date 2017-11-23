package com.share.golden.service.admin;

import java.util.List;

import com.share.golden.entity.BasBorrowMoney;
import com.share.golden.entity.BasBorrowMoneyExample;

public interface IBasBorrowMoneyService {
	public void insert(BasBorrowMoney borrowMoney);

	public void update(BasBorrowMoney borrowMoney);

	public void delete(String borrowId);

	public List<BasBorrowMoney> list(BasBorrowMoneyExample borrowMoneyExample);

	public BasBorrowMoney select(String borrowId);
}
