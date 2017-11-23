package com.share.golden.dao.auto;

import com.share.golden.entity.BasProduct;
import com.share.golden.entity.BasProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasProductMapper {
    long countByExample(BasProductExample example);

    int deleteByExample(BasProductExample example);

    int deleteByPrimaryKey(String productId);

    int insert(BasProduct record);

    int insertSelective(BasProduct record);

    List<BasProduct> selectByExample(BasProductExample example);

    BasProduct selectByPrimaryKey(String productId);

    int updateByExampleSelective(@Param("record") BasProduct record, @Param("example") BasProductExample example);

    int updateByExample(@Param("record") BasProduct record, @Param("example") BasProductExample example);

    int updateByPrimaryKeySelective(BasProduct record);

    int updateByPrimaryKey(BasProduct record);
}