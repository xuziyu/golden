package com.share.golden.service.admin;

import java.util.List;

import com.share.golden.entity.SysVip;
import com.share.golden.entity.SysVipExample;

public interface ISysVipService {
	public void insert(SysVip sysVip);

	public void update(SysVip sysVip);

	public void delete(String vipId);

	public List<SysVip> list(SysVipExample sysVipExample);

	public SysVip select(String vipId);
}
