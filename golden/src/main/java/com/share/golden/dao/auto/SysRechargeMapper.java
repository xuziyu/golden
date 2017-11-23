package com.share.golden.dao.auto;

import com.share.golden.entity.SysRecharge;
import com.share.golden.entity.SysRechargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRechargeMapper {
    long countByExample(SysRechargeExample example);

    int deleteByExample(SysRechargeExample example);

    int deleteByPrimaryKey(String rechargeId);

    int insert(SysRecharge record);

    int insertSelective(SysRecharge record);

    List<SysRecharge> selectByExample(SysRechargeExample example);

    SysRecharge selectByPrimaryKey(String rechargeId);

    int updateByExampleSelective(@Param("record") SysRecharge record, @Param("example") SysRechargeExample example);

    int updateByExample(@Param("record") SysRecharge record, @Param("example") SysRechargeExample example);

    int updateByPrimaryKeySelective(SysRecharge record);

    int updateByPrimaryKey(SysRecharge record);
}