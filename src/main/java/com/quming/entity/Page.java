package com.quming.entity;

import java.io.Serializable;

/**
 * 需要分页的实体继承该类  暂时不用
 */
public class Page implements Serializable {

    private static final long serialVersionUID = 949871331355855891L;

    private Integer pageNo;

    private Integer pageSize;

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
