package com.share.golden.dao.auto;

import com.share.golden.entity.SysNetBank;
import com.share.golden.entity.SysNetBankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysNetBankMapper {
	long countByExample(SysNetBankExample example);

	int deleteByExample(SysNetBankExample example);

	int deleteByPrimaryKey(String tradeId);

	int insert(SysNetBank record);

	int insertSelective(SysNetBank record);

	List<SysNetBank> selectByExample(SysNetBankExample example);

	SysNetBank selectByPrimaryKey(String tradeId);

	int updateByExampleSelective(@Param("record") SysNetBank record, @Param("example") SysNetBankExample example);

	int updateByExample(@Param("record") SysNetBank record, @Param("example") SysNetBankExample example);

	int updateByPrimaryKeySelective(SysNetBank record);

	int updateByPrimaryKey(SysNetBank record);
}