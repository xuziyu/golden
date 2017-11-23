package com.share.golden.dao.auto;

import com.share.golden.entity.UserMaterialCertification;
import com.share.golden.entity.UserMaterialCertificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMaterialCertificationMapper {
    long countByExample(UserMaterialCertificationExample example);

    int deleteByExample(UserMaterialCertificationExample example);

    int deleteByPrimaryKey(String materiaId);

    int insert(UserMaterialCertification record);

    int insertSelective(UserMaterialCertification record);

    List<UserMaterialCertification> selectByExample(UserMaterialCertificationExample example);

    UserMaterialCertification selectByPrimaryKey(String materiaId);

    int updateByExampleSelective(@Param("record") UserMaterialCertification record, @Param("example") UserMaterialCertificationExample example);

    int updateByExample(@Param("record") UserMaterialCertification record, @Param("example") UserMaterialCertificationExample example);

    int updateByPrimaryKeySelective(UserMaterialCertification record);

    int updateByPrimaryKey(UserMaterialCertification record);
}