package com.share.golden.service.admin;

import java.util.List;

import com.share.golden.entity.SysFeedback;
import com.share.golden.entity.SysFeedbackExample;

public interface ISysFeedbackService {
	public void insert(SysFeedback sysFeedback);

	public void update(SysFeedback sysFeedback);

	public void delete(String feedbackId);

	public List<SysFeedback> list(SysFeedbackExample sysFeedbackExample);

	public SysFeedback select(String feedbackId);
}
