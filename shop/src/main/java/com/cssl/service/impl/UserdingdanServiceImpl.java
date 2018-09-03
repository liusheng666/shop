package com.cssl.service.impl;

import com.cssl.dao.UserdingdanDao;
import com.cssl.pojo.*;
import com.cssl.service.UserdingdanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 我的订单
 * */
@Service
public class UserdingdanServiceImpl implements UserdingdanService {
    @Autowired
    private UserdingdanDao userdingdanDao;

    /**
     * 查询我的订单
     * */
    @Override
    /**
     * 查询我的订单
     * */
    public List<Porder> mydingdao(Porder porder){return userdingdanDao.mydingdao(porder);}

    /**
     * 订单的订单详情
     * */
    public OrderProduct mydingdanorder(OrderProduct orderProduct){return userdingdanDao.mydingdanorder(orderProduct);}

    /**
     * 订单的图片
     * */
    public Product mydingdanimage(Product product){return  userdingdanDao.mydingdanimage(product);}

    /**
     * 查询我的全部订单
     * */
    public List<Porder> mydingdaoAll(Porder porder){return  userdingdanDao.mydingdaoAll(porder);}
}
