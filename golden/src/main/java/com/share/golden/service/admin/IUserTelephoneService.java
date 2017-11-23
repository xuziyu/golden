package com.share.golden.service.admin;

import java.util.List;

import com.share.golden.entity.UserTelephone;
import com.share.golden.entity.UserTelephoneExample;



public interface IUserTelephoneService {
	public void insert(UserTelephone userTelephone);
	public void update(UserTelephone userTelephone);
	public void delete(String tid);
	public List<UserTelephone> list(UserTelephoneExample userTelephoneExample);
	public UserTelephone select(String tid);

}
