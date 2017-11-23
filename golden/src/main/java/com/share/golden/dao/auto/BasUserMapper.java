package com.share.golden.dao.auto;

import com.share.golden.entity.BasUser;
import com.share.golden.entity.BasUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasUserMapper {
	long countByExample(BasUserExample example);

	int deleteByExample(BasUserExample example);

	int deleteByPrimaryKey(String userId);

	int insert(BasUser record);

	int insertSelective(BasUser record);

	List<BasUser> selectByExample(BasUserExample example);

	BasUser selectByPrimaryKey(String userId);

	int updateByExampleSelective(@Param("record") BasUser record, @Param("example") BasUserExample example);

	int updateByExample(@Param("record") BasUser record, @Param("example") BasUserExample example);

	int updateByPrimaryKeySelective(BasUser record);

	int updateByPrimaryKey(BasUser record);
}