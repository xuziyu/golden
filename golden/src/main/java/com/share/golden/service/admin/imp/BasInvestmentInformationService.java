package com.share.golden.service.admin.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.share.golden.dao.auto.BasInvestmentInformationMapper;
import com.share.golden.entity.BasInvestmentInformation;
import com.share.golden.entity.BasInvestmentInformationExample;
import com.share.golden.service.admin.IBasInvestmentInformationService;
@Service("investmentInformationService")
public class BasInvestmentInformationService implements IBasInvestmentInformationService {
	@Autowired
	private BasInvestmentInformationMapper investmentInformationDao;
	@Override
	public void insert(BasInvestmentInformation investmentInformation) {
		investmentInformationDao.insert(investmentInformation);
	}

	@Override
	public void update(BasInvestmentInformation investmentInformation) {
		investmentInformationDao.updateByPrimaryKeySelective(investmentInformation);
	}

	@Override
	public void delete(String investorId) {
		investmentInformationDao.deleteByPrimaryKey(investorId);
	}

	@Override
	public List<BasInvestmentInformation> list(BasInvestmentInformationExample investmentInformationExample) {
		return investmentInformationDao.selectByExample(investmentInformationExample);
	}

	@Override
	public BasInvestmentInformation select(String investorId) {
		return investmentInformationDao.selectByPrimaryKey(investorId);
	}

}
