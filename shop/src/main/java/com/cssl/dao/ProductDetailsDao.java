package com.cssl.dao;

import com.cssl.pojo.ProductDetails;

/**
 * 商品详情接口
 */
public interface ProductDetailsDao {
    //根据商品id查询
    public ProductDetails pD(int productId);
}
