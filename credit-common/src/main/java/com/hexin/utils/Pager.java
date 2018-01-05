package com.hexin.utils;

public class Pager {
	
	private int recordCount;//总记录数
	private int pageSize = 15;//每页多少条
	private int pageCount;//共几页
	private int pageNum;//当前页码
	private int start;//当前页的记录起始位置
	
	public Pager(int pageNum) {

		this.pageNum = pageNum;

		// 当前页码
		if (this.pageNum < 1)
			this.pageNum = 1;

		//计算起始位置 下标从1开始（oracle）
		//this.start = (this.pageNum - 1) * this.pageSize + 1;		
		//计算起始位置 下标从0开始（mysql）
		this.start = (this.pageNum - 1) * this.pageSize;
		
		if(this.start<0){
			this.start = 0;
		}
		
	}
	
	public Pager(int recordCount,int pageNum) {
		this.recordCount = recordCount;
		this.pageNum = pageNum;
		
		//计算共几页
		this.pageCount = this.recordCount / this.pageSize;
		if (this.recordCount % this.pageSize != 0) {
			this.pageCount ++;
		}
		
		//计算当前页码
		if (this.pageNum < 1)
			this.pageNum = 1;
		if (this.pageNum > this.pageCount)
			this.pageNum = this.pageCount;
		
		//计算起始位置 下标从1开始（oracle）
		//this.start = (this.pageNum - 1) * this.pageSize + 1;		
		//计算起始位置 下标从0开始（mysql）
		this.start = (this.pageNum - 1) * this.pageSize;	
		
		if(this.start<0){
			this.start = 0;
		}
	}
	
	public Pager(int recordCount,int pageNum,int pageSize) {
		this.recordCount = recordCount;
		this.pageNum = pageNum;
		
		if(pageSize<1){
			this.pageSize = 1;
		}else if(pageSize >= recordCount){
			this.pageSize = recordCount;
		}else{
			this.pageSize = pageSize;
		}
		
		
		//计算共几页
		this.pageCount = this.recordCount / this.pageSize;
		if (this.recordCount % this.pageSize != 0) {
			this.pageCount ++;
		}
		
		//计算当前页码
		if (this.pageNum < 1)
			this.pageNum = 1;
		if (this.pageNum > this.pageCount)
			this.pageNum = this.pageCount;
		
		//计算起始位置 下标从1开始（oracle）
		//this.start = (this.pageNum - 1) * this.pageSize + 1;		
		//计算起始位置 下标从0开始（mysql）
		this.start = (this.pageNum - 1) * this.pageSize;	
		
		if(this.start<0){
			this.start = 0;
		}
	}
		
	public int getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}
	
	

	@Override
	public String toString() {
		return "Pager [recordCount=" + recordCount + ", pageSize=" + pageSize + ", pageCount=" + pageCount
				+ ", pageNum=" + pageNum + ", start=" + start + "]";
	}

	public static void main(String[] args) {
		Pager pager = new Pager(20,2);
		System.out.println(pager.start);
	}

}