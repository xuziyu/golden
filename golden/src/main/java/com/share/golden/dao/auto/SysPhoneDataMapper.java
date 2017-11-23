package com.share.golden.dao.auto;

import com.share.golden.entity.SysPhoneData;
import com.share.golden.entity.SysPhoneDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysPhoneDataMapper {
    long countByExample(SysPhoneDataExample example);

    int deleteByExample(SysPhoneDataExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysPhoneData record);

    int insertSelective(SysPhoneData record);

    List<SysPhoneData> selectByExample(SysPhoneDataExample example);

    SysPhoneData selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysPhoneData record, @Param("example") SysPhoneDataExample example);

    int updateByExample(@Param("record") SysPhoneData record, @Param("example") SysPhoneDataExample example);

    int updateByPrimaryKeySelective(SysPhoneData record);

    int updateByPrimaryKey(SysPhoneData record);
}