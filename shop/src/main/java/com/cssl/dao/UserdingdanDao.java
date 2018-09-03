package com.cssl.dao;

import com.cssl.pojo.*;

import java.util.List;

/**
 * 我的订单接口
 * */
public interface UserdingdanDao {
    /**
     * 查询我的订单前三条
     * */
    public List<Porder> mydingdao(Porder porder);


    /**
     * 查询我的全部订单
     * */
    public List<Porder> mydingdaoAll(Porder porder);

    /**
     * 订单的订单详情
     * */
    public OrderProduct mydingdanorder(OrderProduct orderProduct);

    /**
     * 订单的图片
     * */
    public Product mydingdanimage(Product product);
}
