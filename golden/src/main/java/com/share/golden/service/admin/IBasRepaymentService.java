package com.share.golden.service.admin;

import java.util.List;

import com.share.golden.entity.BasRepayment;
import com.share.golden.entity.BasRepaymentExample;

public interface IBasRepaymentService {
	public void insert(BasRepayment basRepayment);

	public void update(BasRepayment basRepayment);

	public void delete(String repayId);

	public List<BasRepayment> list(BasRepaymentExample basRepaymentExample);

	public BasRepayment select(String repayId);
}
