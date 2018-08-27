package com.cssl.dao;

import com.cssl.pojo.Spone;

import java.util.List;

/**
 * 导航栏
 */
public interface SpOneDao {
    //查询所有一级分类
    public  List<Spone> oneList();

    //查询所有一级分类
    public  List<Spone> one2List();


}
