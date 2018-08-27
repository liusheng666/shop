package com.cssl.dao;

import com.cssl.pojo.Sptwo;

import java.util.List;

public interface SpTwoDao {
    //根据一级分类查二级
    public List<Sptwo> twoList(int onecode);

    //根据一级分类查二级
    public List<Sptwo> two2List(int onecode);

}
