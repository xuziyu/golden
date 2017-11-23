package com.share.golden.service.admin.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.share.golden.dao.auto.SysEmployeeMapper;
import com.share.golden.entity.SysEmployee;
import com.share.golden.entity.SysEmployeeExample;
import com.share.golden.service.admin.ISysEmployeeService;


@Service("sysEmployeeService")
public class SysEmployeeServiceImp implements ISysEmployeeService{

	
	@Autowired
	private SysEmployeeMapper sysEmployeeMapper;
	@Override
	public void insert(SysEmployee sysEmployee) {
		sysEmployeeMapper.insert(sysEmployee);
	}

	@Override
	public void delete(String employeeId) {
		sysEmployeeMapper.deleteByPrimaryKey(employeeId);
	}

	@Override
	public void updateByPrimaryKey(SysEmployee sysEmployee) {
		sysEmployeeMapper.updateByPrimaryKeySelective(sysEmployee);
	}

	@Override
	public List<SysEmployee> selectByExample(SysEmployeeExample sysEmployeeExample) {
		return sysEmployeeMapper.selectByExample(sysEmployeeExample);
	}


	@Override
	public SysEmployee selectByPrimaryKey(String employeeId) {
		return sysEmployeeMapper.selectByPrimaryKey(employeeId);
	}

}
