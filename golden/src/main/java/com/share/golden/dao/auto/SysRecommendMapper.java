package com.share.golden.dao.auto;

import com.share.golden.entity.SysRecommend;
import com.share.golden.entity.SysRecommendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRecommendMapper {
    long countByExample(SysRecommendExample example);

    int deleteByExample(SysRecommendExample example);

    int deleteByPrimaryKey(String recommendId);

    int insert(SysRecommend record);

    int insertSelective(SysRecommend record);

    List<SysRecommend> selectByExample(SysRecommendExample example);

    SysRecommend selectByPrimaryKey(String recommendId);

    int updateByExampleSelective(@Param("record") SysRecommend record, @Param("example") SysRecommendExample example);

    int updateByExample(@Param("record") SysRecommend record, @Param("example") SysRecommendExample example);

    int updateByPrimaryKeySelective(SysRecommend record);

    int updateByPrimaryKey(SysRecommend record);
}