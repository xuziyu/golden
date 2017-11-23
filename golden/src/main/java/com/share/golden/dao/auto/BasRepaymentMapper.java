package com.share.golden.dao.auto;

import com.share.golden.entity.BasRepayment;
import com.share.golden.entity.BasRepaymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasRepaymentMapper {
    long countByExample(BasRepaymentExample example);

    int deleteByExample(BasRepaymentExample example);

    int deleteByPrimaryKey(String repayId);

    int insert(BasRepayment record);

    int insertSelective(BasRepayment record);

    List<BasRepayment> selectByExample(BasRepaymentExample example);

    BasRepayment selectByPrimaryKey(String repayId);

    int updateByExampleSelective(@Param("record") BasRepayment record, @Param("example") BasRepaymentExample example);

    int updateByExample(@Param("record") BasRepayment record, @Param("example") BasRepaymentExample example);

    int updateByPrimaryKeySelective(BasRepayment record);

    int updateByPrimaryKey(BasRepayment record);
}