package com.share.golden.dao.auto;

import com.share.golden.entity.SysEmployeeRole;
import com.share.golden.entity.SysEmployeeRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysEmployeeRoleMapper {
    long countByExample(SysEmployeeRoleExample example);

    int deleteByExample(SysEmployeeRoleExample example);

    int deleteByPrimaryKey(String employeeRoleId);

    int insert(SysEmployeeRole record);

    int insertSelective(SysEmployeeRole record);

    List<SysEmployeeRole> selectByExample(SysEmployeeRoleExample example);

    SysEmployeeRole selectByPrimaryKey(String employeeRoleId);

    int updateByExampleSelective(@Param("record") SysEmployeeRole record, @Param("example") SysEmployeeRoleExample example);

    int updateByExample(@Param("record") SysEmployeeRole record, @Param("example") SysEmployeeRoleExample example);

    int updateByPrimaryKeySelective(SysEmployeeRole record);

    int updateByPrimaryKey(SysEmployeeRole record);
}