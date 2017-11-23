package com.share.golden.service.admin;

import java.util.List;

import com.share.golden.entity.BasInvestmentInformation;
import com.share.golden.entity.BasInvestmentInformationExample;

public interface IBasInvestmentInformationService {
	public void insert(BasInvestmentInformation investmentInformation);

	public void update(BasInvestmentInformation investmentInformation);

	public void delete(String investorId);

	public List<BasInvestmentInformation> list(BasInvestmentInformationExample investmentInformationExample);

	public BasInvestmentInformation select(String investorId);
}
