package com.share.golden.dao.auto;

import com.share.golden.entity.SysEmployee;
import com.share.golden.entity.SysEmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysEmployeeMapper {
	long countByExample(SysEmployeeExample example);

	int deleteByExample(SysEmployeeExample example);

	int deleteByPrimaryKey(String employeeId);

	int insert(SysEmployee record);

	int insertSelective(SysEmployee record);

	List<SysEmployee> selectByExample(SysEmployeeExample example);

	SysEmployee selectByPrimaryKey(String employeeId);

	int updateByExampleSelective(@Param("record") SysEmployee record, @Param("example") SysEmployeeExample example);

	int updateByExample(@Param("record") SysEmployee record, @Param("example") SysEmployeeExample example);

	int updateByPrimaryKeySelective(SysEmployee record);

	int updateByPrimaryKey(SysEmployee record);
}