package com.cssl.service;

import com.cssl.pojo.OrderProduct;
import com.cssl.pojo.Product;

import java.util.List;
import java.util.Map;

public interface OrderProductService {
    public List<OrderProduct> orderList(Map<String,Object> map);
    public List<OrderProduct> orderList2(int typeid);
    public List<OrderProduct> orderList3(int guishu);
    //根据商铺id查询商品时间倒序
    public  List<Product> productListOne(int storeid);

    //根据商铺id查询商品时间倒序
    public  List<Product> productListTwo(int storeid);
}
