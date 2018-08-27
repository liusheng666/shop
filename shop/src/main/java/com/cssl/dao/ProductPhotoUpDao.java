package com.cssl.dao;

import com.cssl.pojo.ProductPhotoUp;

import java.util.List;

/**
 * 上方图片
 */
public interface ProductPhotoUpDao {
    public List<ProductPhotoUp> ppuList(int pid);
}
