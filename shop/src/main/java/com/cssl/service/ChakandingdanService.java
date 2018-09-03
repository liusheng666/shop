package com.cssl.service;

import com.cssl.pojo.OrderProduct;
import com.cssl.pojo.Porder;

import java.util.List;

/**
 * 查看订单详情service
 * */
public interface ChakandingdanService {

    public List<Porder> chakanmydingdan(Porder porder);

    public List<OrderProduct> chakanmydingdanXq(OrderProduct orderProduct);
}
