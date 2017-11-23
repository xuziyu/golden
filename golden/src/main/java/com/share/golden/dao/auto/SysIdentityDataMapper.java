package com.share.golden.dao.auto;

import com.share.golden.entity.SysIdentityData;
import com.share.golden.entity.SysIdentityDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysIdentityDataMapper {
    long countByExample(SysIdentityDataExample example);

    int deleteByExample(SysIdentityDataExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysIdentityData record);

    int insertSelective(SysIdentityData record);

    List<SysIdentityData> selectByExample(SysIdentityDataExample example);

    SysIdentityData selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysIdentityData record, @Param("example") SysIdentityDataExample example);

    int updateByExample(@Param("record") SysIdentityData record, @Param("example") SysIdentityDataExample example);

    int updateByPrimaryKeySelective(SysIdentityData record);

    int updateByPrimaryKey(SysIdentityData record);
}