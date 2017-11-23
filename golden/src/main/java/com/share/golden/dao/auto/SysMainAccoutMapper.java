package com.share.golden.dao.auto;

import com.share.golden.entity.SysMainAccout;
import com.share.golden.entity.SysMainAccoutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMainAccoutMapper {
    long countByExample(SysMainAccoutExample example);

    int deleteByExample(SysMainAccoutExample example);

    int deleteByPrimaryKey(String dealId);

    int insert(SysMainAccout record);

    int insertSelective(SysMainAccout record);

    List<SysMainAccout> selectByExample(SysMainAccoutExample example);

    SysMainAccout selectByPrimaryKey(String dealId);

    int updateByExampleSelective(@Param("record") SysMainAccout record, @Param("example") SysMainAccoutExample example);

    int updateByExample(@Param("record") SysMainAccout record, @Param("example") SysMainAccoutExample example);

    int updateByPrimaryKeySelective(SysMainAccout record);

    int updateByPrimaryKey(SysMainAccout record);
}