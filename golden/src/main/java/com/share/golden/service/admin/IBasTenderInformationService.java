package com.share.golden.service.admin;

import java.util.List;

import com.share.golden.entity.BasTenderInformation;
import com.share.golden.entity.BasTenderInformationExample;

public interface IBasTenderInformationService {
	public void insert(BasTenderInformation tenderInformation);

	public void update(BasTenderInformation tenderInformation);

	public void delete(String tenderId);

	public List<BasTenderInformation> list(BasTenderInformationExample tenderInformationExample);

	public BasTenderInformation select(String tenderId);
}
