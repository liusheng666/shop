package com.cssl.dao;

import com.cssl.pojo.NavigationPhoto;

import java.util.List;

public interface NavigationPhotoDao {
    public List<NavigationPhoto> navigationPhotoUp();

    public List<NavigationPhoto> navigationPhotoDown(int twoid);

}
