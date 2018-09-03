package com.cssl.controller;

import com.cssl.pojo.Product;
import com.cssl.service.ProductDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * 购物车
 */
@Controller
public class BuyShoppingController {
    @Autowired
    private ProductDetailsService productDetailsService;

    @RequestMapping("dsa")
    public String productjian(int productid, HttpSession session) {
        Product product = productDetailsService.pDuct(productid);
        int num = product.getPsum();
        return "dsa";
    }
}
