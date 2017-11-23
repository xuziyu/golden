package com.share.golden.dao.auto;

import com.share.golden.entity.UserContact;
import com.share.golden.entity.UserContactExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserContactMapper {
    long countByExample(UserContactExample example);

    int deleteByExample(UserContactExample example);

    int deleteByPrimaryKey(String contactId);

    int insert(UserContact record);

    int insertSelective(UserContact record);

    List<UserContact> selectByExample(UserContactExample example);

    UserContact selectByPrimaryKey(String contactId);

    int updateByExampleSelective(@Param("record") UserContact record, @Param("example") UserContactExample example);

    int updateByExample(@Param("record") UserContact record, @Param("example") UserContactExample example);

    int updateByPrimaryKeySelective(UserContact record);

    int updateByPrimaryKey(UserContact record);
}