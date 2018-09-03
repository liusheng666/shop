package com.cssl.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * 商品图片,,上方
 */
@Setter
@Getter
public class ProductPhotoUp {
    //id
   private int ppupcode;
   //图片地址
   private String  ppupfile;
   //商品id
   private int  productcode;

}
