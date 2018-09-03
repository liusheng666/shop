package com.cssl.dao;

import com.cssl.pojo.Store;

import java.util.Map;

public interface StoreDao {
    //根据条件查询店铺
    public Store st(Map<String,Object> map);
}
