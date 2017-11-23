package com.share.golden.dao.auto;

import com.share.golden.entity.UserRealName;
import com.share.golden.entity.UserRealNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRealNameMapper {
    long countByExample(UserRealNameExample example);

    int deleteByExample(UserRealNameExample example);

    int deleteByPrimaryKey(String realId);

    int insert(UserRealName record);

    int insertSelective(UserRealName record);

    List<UserRealName> selectByExample(UserRealNameExample example);

    UserRealName selectByPrimaryKey(String realId);

    int updateByExampleSelective(@Param("record") UserRealName record, @Param("example") UserRealNameExample example);

    int updateByExample(@Param("record") UserRealName record, @Param("example") UserRealNameExample example);

    int updateByPrimaryKeySelective(UserRealName record);

    int updateByPrimaryKey(UserRealName record);
}