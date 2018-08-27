package com.cssl.controller;

import com.cssl.pojo.*;
import com.cssl.service.ProductDetailsService;
import com.cssl.service.SpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductDetailsController {
    @Autowired
    private ProductDetailsService productDetailsService;

    @Autowired
    private SpService spService;

    @RequestMapping("/shangp_xiangq")
    public String shangp_xiangq(int productid, Model model){
        //导航栏
        List<Spone> list = spService.oneList();
      Product produc= productDetailsService.pDuct(productid);
      ProductDetails productDetails= productDetailsService.pD(productid);
      List<ProductPhotoDown> productPhotoDownList= productDetailsService.ppdList(productid);
      List<ProductPhotoUp> productPhotoUpList= productDetailsService.ppuList(productid);
      model.addAttribute("list",list);
      model.addAttribute("product",produc);
      model.addAttribute("productDetails",productDetails);
      model.addAttribute("productPhotoDownList",productPhotoDownList);
      model.addAttribute("productPhotoUpList",productPhotoUpList);
      return "shangp_xiangq";
    }

}
