package com.cssl.dao;

import com.cssl.pojo.Product;

import java.util.List;

public interface ProductDao {
    //根据二级分类查询商品
    public List<Product> productList(int twoid);

    //根据商品id查询商品
    public  Product pDuct(int pid);

    //根据商铺id查询商品时间倒序
    public  List<Product> productListTime(int guishu);

    //根据商铺id查询商品时间倒序
    public  List<Product> productListOne(int storeid);

    //根据商铺id查询商品时间倒序
    public  List<Product> productListTwo(int storeid);

}
