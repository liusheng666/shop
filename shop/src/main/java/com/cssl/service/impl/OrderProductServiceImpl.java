package com.cssl.service.impl;

import com.cssl.dao.OrderProductDao;
import com.cssl.dao.ProductDao;
import com.cssl.pojo.OrderProduct;
import com.cssl.pojo.Product;
import com.cssl.service.OrderProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;

@Controller
public class OrderProductServiceImpl implements OrderProductService {
    @Autowired
    private OrderProductDao orderProductDao;
    @Autowired
    private ProductDao productDao;
    @Override
    public List<OrderProduct> orderList(Map<String, Object> map) {
        return orderProductDao.orderList(map);
    }

    @Override
    public List<OrderProduct> orderList2(int typeid) {
        return orderProductDao.orderList2(typeid);
    }

    @Override
    public List<OrderProduct> orderList3(int guishu) {
        return orderProductDao.orderList3(guishu);
    }

    @Override
    public List<Product> productListOne(int storeid) {
        return productDao.productListOne(storeid);
    }

    @Override
    public List<Product> productListTwo(int storeid) {
        return productDao.productListTwo(storeid);
    }
}
