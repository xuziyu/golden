package com.share.golden.service.admin.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.share.golden.dao.auto.UserEducationMapper;
import com.share.golden.entity.UserEducation;
import com.share.golden.entity.UserEducationExample;
import com.share.golden.service.admin.IUserEducationService;

@Service("iUserEducationService")
public class UserEducationService implements IUserEducationService {
	
	@Autowired
	private UserEducationMapper userEducationMapper;
	

	@Override
	public void insert(UserEducation userEducation) {
		
		// TODO Auto-generated method stub
		userEducationMapper.insert(userEducation);
		
	}

	@Override
	public void update(UserEducation userEducation) {
		// TODO Auto-generated method stub
		userEducationMapper.updateByPrimaryKeySelective(userEducation);
		
	}

	@Override
	public void delete(String educationId) {
		// TODO Auto-generated method stub
		userEducationMapper.deleteByPrimaryKey(educationId);
		
	}

	@Override
	public List<UserEducation> list(UserEducationExample userEducationExample) {
		// TODO Auto-generated method stub
		return userEducationMapper.selectByExample(userEducationExample);
	}

	@Override
	public UserEducation select(String educationId) {
		// TODO Auto-generated method stub
		return userEducationMapper.selectByPrimaryKey(educationId);
	}
	

}
