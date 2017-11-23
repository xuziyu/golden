package com.share.golden.dao.auto;

import com.share.golden.entity.UserWithdraw;
import com.share.golden.entity.UserWithdrawExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserWithdrawMapper {
    long countByExample(UserWithdrawExample example);

    int deleteByExample(UserWithdrawExample example);

    int deleteByPrimaryKey(String withdrawId);

    int insert(UserWithdraw record);

    int insertSelective(UserWithdraw record);

    List<UserWithdraw> selectByExample(UserWithdrawExample example);

    UserWithdraw selectByPrimaryKey(String withdrawId);

    int updateByExampleSelective(@Param("record") UserWithdraw record, @Param("example") UserWithdrawExample example);

    int updateByExample(@Param("record") UserWithdraw record, @Param("example") UserWithdrawExample example);

    int updateByPrimaryKeySelective(UserWithdraw record);

    int updateByPrimaryKey(UserWithdraw record);
}