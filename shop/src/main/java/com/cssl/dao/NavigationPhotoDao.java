package com.cssl.dao;

import com.cssl.pojo.NavigationPhoto;

import java.util.List;

public interface NavigationPhotoDao {
    //上面广告图
    public List<NavigationPhoto> navigationPhotoUp();
    //下方导航图
    public List<NavigationPhoto> navigationPhotoDown(int oneid);
}
