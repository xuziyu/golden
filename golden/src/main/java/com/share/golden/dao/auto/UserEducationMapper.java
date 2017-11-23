package com.share.golden.dao.auto;

import com.share.golden.entity.UserEducation;
import com.share.golden.entity.UserEducationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserEducationMapper {
	long countByExample(UserEducationExample example);

	int deleteByExample(UserEducationExample example);

	int deleteByPrimaryKey(String educationId);

	int insert(UserEducation record);

	int insertSelective(UserEducation record);

	List<UserEducation> selectByExample(UserEducationExample example);

	UserEducation selectByPrimaryKey(String educationId);

	int updateByExampleSelective(@Param("record") UserEducation record, @Param("example") UserEducationExample example);

	int updateByExample(@Param("record") UserEducation record, @Param("example") UserEducationExample example);

	int updateByPrimaryKeySelective(UserEducation record);

	int updateByPrimaryKey(UserEducation record);
}