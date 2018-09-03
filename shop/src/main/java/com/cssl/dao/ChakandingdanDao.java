package com.cssl.dao;

import com.cssl.pojo.OrderProduct;
import com.cssl.pojo.Porder;

import java.util.List;

/**
 * 查看订单详情接口
 * */
public interface ChakandingdanDao {
    public List<Porder> chakanmydingdan(Porder porder);

    public List<OrderProduct> chakanmydingdanXq(OrderProduct orderProduct);
}
