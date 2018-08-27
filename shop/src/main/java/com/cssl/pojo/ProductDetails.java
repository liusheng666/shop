package com.cssl.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 商品详情
 */
@Setter
@Getter
public class ProductDetails {
   private int  pdcode;
   private int  productcode;
   private String pdmassage;
   private List<String> pdList;
   private List<NavigationPhoto> navigationPhotoList;
}
