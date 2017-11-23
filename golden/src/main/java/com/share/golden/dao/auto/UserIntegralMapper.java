package com.share.golden.dao.auto;

import com.share.golden.entity.UserIntegral;
import com.share.golden.entity.UserIntegralExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserIntegralMapper {
    long countByExample(UserIntegralExample example);

    int deleteByExample(UserIntegralExample example);

    int deleteByPrimaryKey(String cuserId);

    int insert(UserIntegral record);

    int insertSelective(UserIntegral record);

    List<UserIntegral> selectByExample(UserIntegralExample example);

    UserIntegral selectByPrimaryKey(String cuserId);

    int updateByExampleSelective(@Param("record") UserIntegral record, @Param("example") UserIntegralExample example);

    int updateByExample(@Param("record") UserIntegral record, @Param("example") UserIntegralExample example);

    int updateByPrimaryKeySelective(UserIntegral record);

    int updateByPrimaryKey(UserIntegral record);
}