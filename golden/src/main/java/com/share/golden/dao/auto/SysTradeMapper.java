package com.share.golden.dao.auto;

import com.share.golden.entity.SysTrade;
import com.share.golden.entity.SysTradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysTradeMapper {
    long countByExample(SysTradeExample example);

    int deleteByExample(SysTradeExample example);

    int deleteByPrimaryKey(String tradeId);

    int insert(SysTrade record);

    int insertSelective(SysTrade record);

    List<SysTrade> selectByExample(SysTradeExample example);

    SysTrade selectByPrimaryKey(String tradeId);

    int updateByExampleSelective(@Param("record") SysTrade record, @Param("example") SysTradeExample example);

    int updateByExample(@Param("record") SysTrade record, @Param("example") SysTradeExample example);

    int updateByPrimaryKeySelective(SysTrade record);

    int updateByPrimaryKey(SysTrade record);
}