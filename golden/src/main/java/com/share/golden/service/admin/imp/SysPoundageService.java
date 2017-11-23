package com.share.golden.service.admin.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.share.golden.dao.auto.SysPoundageMapper;
import com.share.golden.entity.SysPoundage;
import com.share.golden.entity.SysPoundageExample;
import com.share.golden.service.admin.ISysPoundageService;

@Service("iSysPoundageService")
public class SysPoundageService implements ISysPoundageService {

	@Autowired
	private SysPoundageMapper sysPoundageMapper;

	@Override
	public void insert(SysPoundage sysPoundage) {
		// TODO Auto-generated method stub
		sysPoundageMapper.insert(sysPoundage);

	}

	@Override
	public void update(SysPoundage sysPoundage) {
		// TODO Auto-generated method stub
		sysPoundageMapper.updateByPrimaryKeySelective(sysPoundage);

	}

	@Override
	public void delete(String poundageId) {
		// TODO Auto-generated method stub
		sysPoundageMapper.deleteByPrimaryKey(poundageId);

	}

	@Override
	public List<SysPoundage> list(SysPoundageExample sysPoundageExample) {
		// TODO Auto-generated method stub
		return sysPoundageMapper.selectByExample(sysPoundageExample);
	}

	@Override
	public SysPoundage select(String poundageId) {
		// TODO Auto-generated method stub
		return sysPoundageMapper.selectByPrimaryKey(poundageId);
	}

}
