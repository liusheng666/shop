package com.cssl.service.impl;

import com.cssl.dao.ProductDao;
import com.cssl.dao.SpOneDao;
import com.cssl.dao.SpThreeDao;
import com.cssl.dao.SpTwoDao;
import com.cssl.pojo.Product;
import com.cssl.pojo.Spone;
import com.cssl.pojo.Spthree;
import com.cssl.pojo.Sptwo;
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
                List<Spthree> spThreeList = spThreeDao.three2List(oneid);
                spOneList.get(i).getTwo2list().get(j).setProductList(pList);
                spOneList.get(i).setThree2list(spThreeList);
            }
        }
        return spOneList;
    }

}
