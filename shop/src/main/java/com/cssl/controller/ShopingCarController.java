package com.cssl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShopingCarController {
    /**
     * 用户的购物车
     * @return
     */
    @RequestMapping("/gouw_che")
    public String gouw_che(){
        return  "gouw_che";
    }
}


