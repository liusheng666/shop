package com.cssl.dao;

import com.cssl.pojo.ProductPhotoDown;

import java.util.List;

/**
 * 下方图片
 */
public interface ProductPhotoDownDao {
    public List<ProductPhotoDown> ppdList(int pid);
}
