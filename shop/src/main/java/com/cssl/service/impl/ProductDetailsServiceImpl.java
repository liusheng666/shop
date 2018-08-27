package com.cssl.service.impl;

import com.cssl.dao.*;
import com.cssl.pojo.*;
import com.cssl.service.ProductDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductDetailsServiceImpl implements ProductDetailsService {
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ProductDetailsDao productDetailsDao;
    @Autowired
    private ProductPhotoDownDao productPhotoDownDao;
    @Autowired
    private ProductPhotoUpDao productPhotoUpDao;

    @Override
    public List<ProductPhotoUp> ppuList(int pid) {
        return productPhotoUpDao.ppuList(pid);
    }

    @Override
    public List<ProductPhotoDown> ppdList(int pid) {
        return productPhotoDownDao.ppdList(pid);
    }
    @Override
    public ProductDetails pD(int productId) {
        ProductDetails productDetails = productDetailsDao.pD(productId);
        String str = productDetails.getPdmassage();
        List<String> plist = new ArrayList<>();
        String[]  strs=str.split("-");
        for(int i=0;i<strs.length;i++){
            plist.add(strs[i].toString());
        }
        productDetails.setPdList(plist);
        return productDetails;

    }
    @Override
    public Product pDuct(int pid) {
        return productDao.pDuct(pid);
    }
}
