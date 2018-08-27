package com.cssl.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 一级分类
 */
@Setter
@Getter
public class Spone {
    //一级分类编号
    private int  sponecode;
    //二级分类编号
    private String   sponename;

    private List<Sptwo> twolist;

    private List<Sptwo> two2list;

    private  List<Spthree> three2list;


}
