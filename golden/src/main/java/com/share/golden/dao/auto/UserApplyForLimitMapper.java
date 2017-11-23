package com.share.golden.dao.auto;

import com.share.golden.entity.UserApplyForLimit;
import com.share.golden.entity.UserApplyForLimitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserApplyForLimitMapper {
	long countByExample(UserApplyForLimitExample example);

	int deleteByExample(UserApplyForLimitExample example);

	int deleteByPrimaryKey(String applyCode);

	int insert(UserApplyForLimit record);

	int insertSelective(UserApplyForLimit record);

	List<UserApplyForLimit> selectByExample(UserApplyForLimitExample example);

	UserApplyForLimit selectByPrimaryKey(String applyCode);

	int updateByExampleSelective(@Param("record") UserApplyForLimit record,
			@Param("example") UserApplyForLimitExample example);

	int updateByExample(@Param("record") UserApplyForLimit record, @Param("example") UserApplyForLimitExample example);

	int updateByPrimaryKeySelective(UserApplyForLimit record);

	int updateByPrimaryKey(UserApplyForLimit record);
}