package com.share.golden.dao.auto;

import com.share.golden.entity.UserCreditLimit;
import com.share.golden.entity.UserCreditLimitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserCreditLimitMapper {
    long countByExample(UserCreditLimitExample example);

    int deleteByExample(UserCreditLimitExample example);

    int deleteByPrimaryKey(String limitCode);

    int insert(UserCreditLimit record);

    int insertSelective(UserCreditLimit record);

    List<UserCreditLimit> selectByExample(UserCreditLimitExample example);

    UserCreditLimit selectByPrimaryKey(String limitCode);

    int updateByExampleSelective(@Param("record") UserCreditLimit record, @Param("example") UserCreditLimitExample example);

    int updateByExample(@Param("record") UserCreditLimit record, @Param("example") UserCreditLimitExample example);

    int updateByPrimaryKeySelective(UserCreditLimit record);

    int updateByPrimaryKey(UserCreditLimit record);
}