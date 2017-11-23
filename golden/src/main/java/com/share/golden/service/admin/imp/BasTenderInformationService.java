package com.share.golden.service.admin.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.share.golden.dao.auto.BasTenderInformationMapper;
import com.share.golden.entity.BasTenderInformation;
import com.share.golden.entity.BasTenderInformationExample;
import com.share.golden.service.admin.IBasTenderInformationService;

@Service("tenderInformationService")
public class BasTenderInformationService implements IBasTenderInformationService {
	
	@Autowired
	private BasTenderInformationMapper tenderInformationDao;
	@Override
	public void insert(BasTenderInformation tenderInformation) {
		tenderInformationDao.insert(tenderInformation);
	}

	@Override
	public void update(BasTenderInformation tenderInformation) {
		tenderInformationDao.updateByPrimaryKeySelective(tenderInformation);
	}

	@Override
	public void delete(String tenderId) {
		tenderInformationDao.deleteByPrimaryKey(tenderId);
	}

	@Override
	public List<BasTenderInformation> list(BasTenderInformationExample tenderInformationExample) {
		return tenderInformationDao.selectByExample(tenderInformationExample);
	}

	@Override
	public BasTenderInformation select(String tenderId) {
		return tenderInformationDao.selectByPrimaryKey(tenderId);
	}

}
