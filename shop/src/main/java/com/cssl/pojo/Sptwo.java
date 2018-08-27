package com.cssl.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 二级分类
 */
@Setter
@Getter
public class Sptwo {
    private int sptwocode;
    private String  sptwoname;
    private int sponecode;
    private List<Spthree> threelist;
    private List<Spthree> three2list;
    private List<Product> productList;
}
