package com.share.golden.dao.auto;

import com.share.golden.entity.UserAccountAssets;
import com.share.golden.entity.UserAccountAssetsExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAccountAssetsMapper {
    long countByExample(UserAccountAssetsExample example);

    int deleteByExample(UserAccountAssetsExample example);

    int deleteByPrimaryKey(BigDecimal accountId);

    int insert(UserAccountAssets record);

    int insertSelective(UserAccountAssets record);

    List<UserAccountAssets> selectByExample(UserAccountAssetsExample example);

    UserAccountAssets selectByPrimaryKey(BigDecimal accountId);

    int updateByExampleSelective(@Param("record") UserAccountAssets record, @Param("example") UserAccountAssetsExample example);

    int updateByExample(@Param("record") UserAccountAssets record, @Param("example") UserAccountAssetsExample example);

    int updateByPrimaryKeySelective(UserAccountAssets record);

    int updateByPrimaryKey(UserAccountAssets record);
}