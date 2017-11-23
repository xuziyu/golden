package com.share.golden.dao.auto;

import com.share.golden.entity.BasBorrowMoney;
import com.share.golden.entity.BasBorrowMoneyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasBorrowMoneyMapper {
    long countByExample(BasBorrowMoneyExample example);

    int deleteByExample(BasBorrowMoneyExample example);

    int deleteByPrimaryKey(String borrowId);

    int insert(BasBorrowMoney record);

    int insertSelective(BasBorrowMoney record);

    List<BasBorrowMoney> selectByExample(BasBorrowMoneyExample example);

    BasBorrowMoney selectByPrimaryKey(String borrowId);

    int updateByExampleSelective(@Param("record") BasBorrowMoney record, @Param("example") BasBorrowMoneyExample example);

    int updateByExample(@Param("record") BasBorrowMoney record, @Param("example") BasBorrowMoneyExample example);

    int updateByPrimaryKeySelective(BasBorrowMoney record);

    int updateByPrimaryKey(BasBorrowMoney record);
}