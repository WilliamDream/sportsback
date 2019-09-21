package com.letansuo.sportsback.common.vo;

public class BaseEntity
{
    private int pageNum = 1;

    private int pageSize = 10;

    public int getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}