package com.cssl.service.impl;

import com.cssl.dao.*;
import com.cssl.pojo.*;
import com.cssl.service.SpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SpServiceImpl implements  SpService{
    @Autowired
    private SpOneDao spDao;
    @Autowired
    private SpTwoDao spTwoDao;
    @Autowired
    private SpThreeDao spThreeDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private NavigationPhotoDao navigationPhotoDao;
    /**
     * 查询一级分类
     * @return
     */
    @Override
    public List<Spone> oneList() {
        List<Spone> spOneList = spDao.oneList();
        for (int i = 0;i<spOneList.size();i++){
            int num= spOneList.get(i).getSponecode();
            List<Sptwo> spTwoList= spTwoDao.twoList(num);
            spOneList.get(i).setTwolist(spTwoList);
            for (int j = 0;j<spTwoList.size();j++){
                int num2 = spTwoList.get(j).getSptwocode();
                List<Spthree> spThreeList = spThreeDao.threeList(num2);
                spOneList.get(i).getTwolist().get(j).setThreelist(spThreeList);
            }
        }
        return spOneList;
    }

    @Override
    public List<Spone> one2List() {
        List<Spone> spOneList = new ArrayList<>();
        List<Product>  pList = new ArrayList<>();
        spOneList = spDao.one2List();
        for (int i = 0; i<spOneList.size();i++){
            int oneid= spOneList.get(i).getSponecode();
            List<Sptwo> spTwoList = spTwoDao.two2List(oneid);
            spOneList.get(i).setTwo2list(spTwoList);
            for (int j = 0 ; j<spTwoList.size();j++){
                int twoid = spTwoList.get(j).getSptwocode();
                pList = productDao.productList(twoid);
                List<NavigationPhoto> navigationPhotoList = navigationPhotoDao.navigationPhotoDown(oneid);
                List<Spthree> spThreeList = spThreeDao.three2List(oneid);
                spOneList.get(i).getTwo2list().get(j).setProductList(pList);
                spOneList.get(i).setNavigationPhotoList(navigationPhotoList);
                spOneList.get(i).setThree2list(spThreeList);
            }
        }
        return spOneList;
    }

}
