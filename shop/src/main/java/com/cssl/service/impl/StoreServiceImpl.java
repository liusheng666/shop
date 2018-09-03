package com.cssl.service.impl;

import com.cssl.dao.StoreDao;
import com.cssl.pojo.Store;
import com.cssl.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Map;

@Controller
public class StoreServiceImpl implements StoreService {
    @Autowired
    private StoreDao storeDao;
    @Override
    public Store st(Map<String, Object> map) {
        return storeDao.st(map);
    }
}
