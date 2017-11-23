package com.share.golden.service.admin;

import java.util.List;

import com.share.golden.entity.SysEmployee;
import com.share.golden.entity.SysEmployeeExample;

public interface ISysEmployeeService {

	public void insert(SysEmployee sysEmployee);

	public void delete(String employeeId);

	public void updateByPrimaryKey(SysEmployee record);

	public SysEmployee selectByPrimaryKey(String employeeId);

	public List<SysEmployee> selectByExample(SysEmployeeExample sysEmployeeExample);


}
