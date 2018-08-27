package com.cssl.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * 商品图片,,下方
 */
@Setter
@Getter
public class ProductPhotoDown {
    //id
    private int ppdowncode;
    //图片地址
    private String  ppdownfile;
    //商品id
    private int  productcode;
}
