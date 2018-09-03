package com.cssl.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * 商品广告图
 */
@Setter
@Getter
public class NavigationPhoto {
    private int  npid;
    private String   npfile;
    private int nptype;
    private int  productid;
    private int istrue;
    private int storeid;
}
