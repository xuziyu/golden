package com.share.golden.dao.auto;

import com.share.golden.entity.BasBorrowMoney;
import com.share.golden.entity.BasBorrowMoneyExample;
import com.share.golden.entity.UserTelephone;
import com.share.golden.entity.UserTelephoneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTelephoneMapper {
    long countByExample(UserTelephoneExample example);

    int deleteByExample(UserTelephoneExample example);

    int deleteByPrimaryKey(String tid);

    int insert(UserTelephone record);

    int insertSelective(UserTelephone record);

    List<UserTelephone> selectByExample(UserTelephoneExample example);

    UserTelephone selectByPrimaryKey(String tid);

    int updateByExampleSelective(@Param("record") UserTelephone record, @Param("example") UserTelephoneExample example);

    int updateByExample(@Param("record") UserTelephone record, @Param("example") UserTelephoneExample example);


    int updateByPrimaryKeySelective(UserTelephone record);

  

}