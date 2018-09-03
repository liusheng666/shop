package com.cssl.service.impl;

import com.cssl.dao.NavigationPhotoDao;
import com.cssl.pojo.NavigationPhoto;
import com.cssl.service.NavigationPhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class NavigationPhotoServiceImpl implements NavigationPhotoService {
    @Autowired
    private NavigationPhotoDao navigationPhotoDao;
    @Override
    public List<NavigationPhoto> navigationPhotoUp() {
        return navigationPhotoDao.navigationPhotoUp();
    }
}
