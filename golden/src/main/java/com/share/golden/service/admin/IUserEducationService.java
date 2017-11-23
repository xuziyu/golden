package com.share.golden.service.admin;

import java.util.List;

import com.share.golden.entity.UserEducation;
import com.share.golden.entity.UserEducationExample;



public interface IUserEducationService {
	public void insert(UserEducation userEducation );
	public void update(UserEducation userEducation );
	public void delete( String educationId);
	public List<UserEducation> list(UserEducationExample userEducationExample);
	public UserEducation select(String educationId);

}
