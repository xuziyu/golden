package com.share.golden.service.admin.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.share.golden.dao.auto.SysFeedbackMapper;
import com.share.golden.entity.SysFeedback;
import com.share.golden.entity.SysFeedbackExample;
import com.share.golden.service.admin.ISysFeedbackService;
@Service("feedbackService")
public class SysFeedbackService implements ISysFeedbackService {
	@Autowired
	private SysFeedbackMapper feedbackDao;
	@Override
	public void insert(SysFeedback sysFeedback) {
		feedbackDao.insertSelective(sysFeedback);
	}

	@Override
	public void update(SysFeedback sysFeedback) {
		feedbackDao.updateByPrimaryKeySelective(sysFeedback);
	}

	@Override
	public void delete(String feedbackId) {
		feedbackDao.deleteByPrimaryKey(feedbackId);
	}

	@Override
	public List<SysFeedback> list(SysFeedbackExample sysFeedbackExample) {
		return feedbackDao.selectByExample(sysFeedbackExample);
	}

	@Override
	public SysFeedback select(String feedbackId) {
		return feedbackDao.selectByPrimaryKey(feedbackId);
	}

}
