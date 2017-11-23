package com.share.golden.service.admin.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.share.golden.dao.auto.SysDepartmentMapper;
import com.share.golden.entity.SysDepartment;
import com.share.golden.entity.SysDepartmentExample;
import com.share.golden.service.admin.ISysDepartmentService;

@Service("iSysDepartmentService")
public class SysDepartmentSrevice implements ISysDepartmentService {

	@Autowired
	private SysDepartmentMapper sysDepartmentMapper;

	@Override
	public void insert(SysDepartment sysDepartment) {
		// TODO Auto-generated method stub
		sysDepartmentMapper.insert(sysDepartment);

	}

	@Override
	public void update(SysDepartment sysDepartment) {
		// TODO Auto-generated method stub
		sysDepartmentMapper.updateByPrimaryKeySelective(sysDepartment);
	}

	@Override
	public void delete(String departmentId) {
		// TODO Auto-generated method stub
		sysDepartmentMapper.deleteByPrimaryKey(departmentId);

	}

	@Override
	public List<SysDepartment> list(SysDepartmentExample sysDepartmentExample) {
		// TODO Auto-generated method stub
		return sysDepartmentMapper.selectByExample(sysDepartmentExample);
	}

	@Override
	public SysDepartment select(String departmentId) {
		// TODO Auto-generated method stub
		return sysDepartmentMapper.selectByPrimaryKey(departmentId);
	}

}
