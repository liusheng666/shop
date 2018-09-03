package com.cssl.service;

import com.cssl.pojo.Store;

import java.util.Map;

public interface StoreService {
    //根据条件查询店铺
    public Store st(Map<String,Object> map);
}
