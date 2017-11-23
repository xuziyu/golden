package com.share.golden.dao.auto;

import com.share.golden.entity.UserBankCard;
import com.share.golden.entity.UserBankCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBankCardMapper {
	long countByExample(UserBankCardExample example);

	int deleteByExample(UserBankCardExample example);

	int deleteByPrimaryKey(String cardId);

	int insert(UserBankCard record);

	int insertSelective(UserBankCard record);

	List<UserBankCard> selectByExample(UserBankCardExample example);

	UserBankCard selectByPrimaryKey(String cardId);

	int updateByExampleSelective(@Param("record") UserBankCard record, @Param("example") UserBankCardExample example);

	int updateByExample(@Param("record") UserBankCard record, @Param("example") UserBankCardExample example);

	int updateByPrimaryKeySelective(UserBankCard record);

	int updateByPrimaryKey(UserBankCard record);
}