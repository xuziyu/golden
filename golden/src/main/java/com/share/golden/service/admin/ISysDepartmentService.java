package com.share.golden.service.admin;

import java.util.List;

import com.share.golden.entity.SysDepartment;
import com.share.golden.entity.SysDepartmentExample;



public interface ISysDepartmentService {
	
	public void insert( SysDepartment  sysDepartment );
	public void update( SysDepartment  sysDepartment );
	public void delete( String departmentId);
	public List< SysDepartment> list( SysDepartmentExample  sysDepartmentExample);
	public  SysDepartment select(String departmentId);

}
