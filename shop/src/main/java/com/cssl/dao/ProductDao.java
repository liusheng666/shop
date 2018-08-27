package com.cssl.dao;

import com.cssl.pojo.Product;

import java.util.List;

public interface ProductDao {
    //根据二级分类查询商品
    public List<Product> productList(int twoid);

    //根据商品id查询商品
    public  Product pDuct(int pid);
}
