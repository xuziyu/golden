package com.share.golden.service.admin.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.share.golden.dao.auto.SysEmployeeMapper;
import com.share.golden.entity.SysEmployee;
import com.share.golden.entity.SysEmployeeExample;
import com.share.golden.service.admin.ISysEmployeeService;

@Service("employeeService")
public class SysEmployeeService implements ISysEmployeeService {
	
	@Autowired
	private SysEmployeeMapper employeeDao;
	@Override
	public void insert(SysEmployee sysEmployee) {
		employeeDao.insertSelective(sysEmployee);
	}

	@Override
	public void delete(String employeeId) {
		employeeDao.deleteByPrimaryKey(employeeId);
	}

	@Override
	public void updateByPrimaryKey(SysEmployee record) {
		employeeDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public SysEmployee selectByPrimaryKey(String employeeId) {
		return employeeDao.selectByPrimaryKey(employeeId);
	}

	@Override
	public List<SysEmployee> selectByExample(SysEmployeeExample sysEmployeeExample) {
		return employeeDao.selectByExample(sysEmployeeExample);
	}

}
