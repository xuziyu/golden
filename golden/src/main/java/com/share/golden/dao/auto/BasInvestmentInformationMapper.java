package com.share.golden.dao.auto;

import com.share.golden.entity.BasInvestmentInformation;
import com.share.golden.entity.BasInvestmentInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasInvestmentInformationMapper {
	long countByExample(BasInvestmentInformationExample example);

	int deleteByExample(BasInvestmentInformationExample example);

	int deleteByPrimaryKey(String investorId);

	int insert(BasInvestmentInformation record);

	int insertSelective(BasInvestmentInformation record);

	List<BasInvestmentInformation> selectByExample(BasInvestmentInformationExample example);

	BasInvestmentInformation selectByPrimaryKey(String investorId);

	int updateByExampleSelective(@Param("record") BasInvestmentInformation record,
			@Param("example") BasInvestmentInformationExample example);

	int updateByExample(@Param("record") BasInvestmentInformation record,
			@Param("example") BasInvestmentInformationExample example);

	int updateByPrimaryKeySelective(BasInvestmentInformation record);

	int updateByPrimaryKey(BasInvestmentInformation record);
}