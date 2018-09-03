package com.cssl.service;

import com.cssl.pojo.*;

import java.util.List;

/**
 * 我的订单service
 * */
public interface UserdingdanService {

    /**
     * 查询我的订单
     * */
    public List<Porder> mydingdao(Porder porder);

    /**
     * 订单的订单详情
     * */
    public OrderProduct mydingdanorder(OrderProduct orderProduct);

    /**
     * 订单的图片
     * */
    public Product mydingdanimage(Product product);

    /**
     * 查询我的全部订单
     * */
    public List<Porder> mydingdaoAll(Porder porder);
}
