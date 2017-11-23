package com.share.golden.framework.entity;

import java.util.List;

public class PageWrap4EasyUI {
	private PageVO pageVO;

	public PageWrap4EasyUI(PageVO pageVO) {
		this.pageVO = pageVO;
	}

	public int getTotal() {
		return pageVO.getRecordCount();
	}

	public List getRows() {
		return pageVO.getList();
	}

}
