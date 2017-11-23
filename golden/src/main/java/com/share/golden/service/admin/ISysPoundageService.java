package com.share.golden.service.admin;

import java.util.List;

import com.share.golden.entity.SysPoundage;
import com.share.golden.entity.SysPoundageExample;



public interface ISysPoundageService {
	
	public void insert( SysPoundage  sysPoundage );
	public void update( SysPoundage  sysPoundage );
	public void delete( String poundageId);
	public List< SysPoundage> list( SysPoundageExample  sysPoundageExample);
	public  SysPoundage select(String poundageId);

}
