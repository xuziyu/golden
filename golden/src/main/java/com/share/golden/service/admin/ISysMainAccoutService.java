package com.share.golden.service.admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.share.golden.entity.SysMainAccout;
import com.share.golden.entity.SysMainAccoutExample;

public interface ISysMainAccoutService {
public List<SysMainAccout> SysMainAccoutQuery(SysMainAccoutExample sysMainAccoutExample);
public void SysMainAccoutConfirm();
public void delete(String key);
public SysMainAccout load(String key);
public void save(SysMainAccout code);
}
