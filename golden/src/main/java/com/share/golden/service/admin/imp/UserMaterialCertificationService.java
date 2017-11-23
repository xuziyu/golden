package com.share.golden.service.admin.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.share.golden.dao.auto.UserMaterialCertificationMapper;
import com.share.golden.entity.UserMaterialCertification;
import com.share.golden.entity.UserMaterialCertificationExample;
import com.share.golden.service.admin.IUserMaterialCertificationService;

@Service("iUserMaterialCertificationService")
public class UserMaterialCertificationService implements IUserMaterialCertificationService {

	@Autowired
	private UserMaterialCertificationMapper userMaterialCertificationMapper;

	@Override
	public void insert(UserMaterialCertification userMaterialCertification) {
		// TODO Auto-generated method stub
		userMaterialCertificationMapper.insert(userMaterialCertification);

	}

	@Override
	public void update(UserMaterialCertification userMaterialCertification) {
		// TODO Auto-generated method stub
		userMaterialCertificationMapper.updateByPrimaryKeySelective(userMaterialCertification);
	}

	@Override
	public void delete(String materiaId) {
		// TODO Auto-generated method stub
		userMaterialCertificationMapper.deleteByPrimaryKey(materiaId);
	}

	@Override
	public List<UserMaterialCertification> list(UserMaterialCertificationExample userMaterialCertificationExample) {
		// TODO Auto-generated method stub
		return userMaterialCertificationMapper.selectByExample(userMaterialCertificationExample);
	}

	@Override
	public UserMaterialCertification select(String materiaId) {
		// TODO Auto-generated method stub
		return userMaterialCertificationMapper.selectByPrimaryKey(materiaId);
	}

}
