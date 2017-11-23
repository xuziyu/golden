package com.share.golden.dao.auto;

import com.share.golden.entity.SysPoundage;
import com.share.golden.entity.SysPoundageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysPoundageMapper {
	long countByExample(SysPoundageExample example);

	int deleteByExample(SysPoundageExample example);

	int deleteByPrimaryKey(String poundageId);

	int insert(SysPoundage record);

	int insertSelective(SysPoundage record);

	List<SysPoundage> selectByExample(SysPoundageExample example);

	SysPoundage selectByPrimaryKey(String poundageId);

	int updateByExampleSelective(@Param("record") SysPoundage record, @Param("example") SysPoundageExample example);

	int updateByExample(@Param("record") SysPoundage record, @Param("example") SysPoundageExample example);

	int updateByPrimaryKeySelective(SysPoundage record);

	int updateByPrimaryKey(SysPoundage record);
}