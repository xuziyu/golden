package com.share.golden.dao.auto;

import com.share.golden.entity.SysFeedback;
import com.share.golden.entity.SysFeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFeedbackMapper {
    long countByExample(SysFeedbackExample example);

    int deleteByExample(SysFeedbackExample example);

    int deleteByPrimaryKey(String feedbackId);

    int insert(SysFeedback record);

    int insertSelective(SysFeedback record);

    List<SysFeedback> selectByExample(SysFeedbackExample example);

    SysFeedback selectByPrimaryKey(String feedbackId);

    int updateByExampleSelective(@Param("record") SysFeedback record, @Param("example") SysFeedbackExample example);

    int updateByExample(@Param("record") SysFeedback record, @Param("example") SysFeedbackExample example);

    int updateByPrimaryKeySelective(SysFeedback record);

    int updateByPrimaryKey(SysFeedback record);
}