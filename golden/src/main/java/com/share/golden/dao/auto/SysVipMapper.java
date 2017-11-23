package com.share.golden.dao.auto;

import com.share.golden.entity.SysVip;
import com.share.golden.entity.SysVipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysVipMapper {
    long countByExample(SysVipExample example);

    int deleteByExample(SysVipExample example);

    int deleteByPrimaryKey(String vipId);

    int insert(SysVip record);

    int insertSelective(SysVip record);

    List<SysVip> selectByExample(SysVipExample example);

    SysVip selectByPrimaryKey(String vipId);

    int updateByExampleSelective(@Param("record") SysVip record, @Param("example") SysVipExample example);

    int updateByExample(@Param("record") SysVip record, @Param("example") SysVipExample example);

    int updateByPrimaryKeySelective(SysVip record);

    int updateByPrimaryKey(SysVip record);
}