package com.share.golden.dao.auto;

import com.share.golden.entity.BasTenderInformation;
import com.share.golden.entity.BasTenderInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasTenderInformationMapper {
    long countByExample(BasTenderInformationExample example);

    int deleteByExample(BasTenderInformationExample example);

    int deleteByPrimaryKey(String tenderId);

    int insert(BasTenderInformation record);

    int insertSelective(BasTenderInformation record);

    List<BasTenderInformation> selectByExample(BasTenderInformationExample example);

    BasTenderInformation selectByPrimaryKey(String tenderId);

    int updateByExampleSelective(@Param("record") BasTenderInformation record, @Param("example") BasTenderInformationExample example);

    int updateByExample(@Param("record") BasTenderInformation record, @Param("example") BasTenderInformationExample example);

    int updateByPrimaryKeySelective(BasTenderInformation record);

    int updateByPrimaryKey(BasTenderInformation record);
}