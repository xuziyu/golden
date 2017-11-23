package com.share.golden.framework.entity;

import java.io.Serializable;
import java.util.List;

public class PageVO implements Serializable {
	private static final long serialVersionUID = 1L;

	private int pageSize = 20;// 每页记录数

	private int pageIndex = 0;// 第几页,从0开始

	private int recordCount;// 总记录数

	private List list;// 结果集

	public PageVO() {
	}

	/**
	 * 返回总页数
	 * 
	 * @return
	 */
	public int getPageCount() {
		int result = (this.recordCount - 1) / this.pageSize + 1;
		return result == 0 ? 1 : result;
	}

	/**
	 * 返回上一页的页数
	 * 
	 * @return
	 */
	public int getPagePrev() {
		int result = this.pageIndex - 1;
		if (result < 0)
			return 0;
		else
			return result;
	}

	/**
	 * 返回下一页的页数
	 * 
	 * @return
	 */
	public int getPageNext() {
		int result = this.pageIndex + 1;
		if (result >= this.getPageCount() - 1)
			return this.getPageCount() - 1;
		else
			return result;
	}

	/**
	 * 返回末页的页数
	 * 
	 * @return
	 */
	public int getPageLast() {
		return (this.recordCount - 1) / this.pageSize;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

}
