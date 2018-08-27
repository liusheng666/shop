package com.cssl.service;

import com.cssl.pojo.*;

import java.util.List;

public interface ProductDetailsService {
    //上方图片
    public List<ProductPhotoUp> ppuList(int pid);
    //下
    public List<ProductPhotoDown> ppdList(int pid);
    //根据商品id查询
    public ProductDetails pD(int productId);
    //根据商品id查询商品
    public Product pDuct(int pid);
}
