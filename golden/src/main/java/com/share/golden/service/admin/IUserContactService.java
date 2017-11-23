package com.share.golden.service.admin;

import java.util.List;

import com.share.golden.entity.UserContact;
import com.share.golden.entity.UserContactExample;

public interface IUserContactService {
	public void insert(UserContact userContact);

	public void update(UserContact user);

	public void delete(String contactId);

	public List<UserContact> list(UserContactExample userContactExample);

	public UserContact select(String contactId);
}
