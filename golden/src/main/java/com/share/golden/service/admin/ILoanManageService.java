package com.share.golden.service.admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.share.golden.entity.UserRealName;
import com.share.golden.entity.UserRealNameExample;

public interface ILoanManageService {
public List<UserRealName> userRealNameQuery(UserRealNameExample userRealNameExample);
public void userRealNameConfirm();
public void delete(String key);
public UserRealName load(String key);
public void save(UserRealName code);
}
