package com.cssl.dao;

import com.cssl.pojo.OrderProduct;

import java.util.List;
import java.util.Map;

/**
 * 订单详情
 */
public interface OrderProductDao {
    public List<OrderProduct> orderList(Map<String,Object> map);
    public List<OrderProduct> orderList2(int typeid);
    public List<OrderProduct> orderList3(int guishu);


}
