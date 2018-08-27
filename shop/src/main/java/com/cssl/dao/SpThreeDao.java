package com.cssl.dao;

import com.cssl.pojo.Spthree;
import com.cssl.pojo.Sptwo;

import java.util.List;

public interface SpThreeDao {
    //根据二级分类查三级
    public List<Spthree> threeList(int twocode);
    //根据1级分类查三级
    public List<Spthree> three2List(int onecode);
}
