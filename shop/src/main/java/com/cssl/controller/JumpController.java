package com.cssl.controller;

import com.cssl.pojo.Spone;
import com.cssl.service.SpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 负责跳转的控制器
 */
@Controller
public class JumpController {

    @Autowired
    private SpService spService;
    /**
     * 首页跳转
     * @return
     */
    @RequestMapping("/index")
    public String index(Model model){
        //导航栏
        List<Spone> list = spService.oneList();
        List<Spone> list2 = spService.one2List();
        model.addAttribute("list",list);
        model.addAttribute("list2",list2);
        //商品层次介绍
        return "index";
    }

    /**
     * 登录页面
     * @return
     */
    @RequestMapping("/dengl")
    public String dengl(){
        return "dengl";
    }

    /**
     * 收藏页面
     * @return
     */
    @RequestMapping("/wod_shouc")
    public String wod_shouc(){
        return "wod_shouc";
    }

    /**
     * 申请入驻
     * @return
     */
    @RequestMapping("/shenq_ruz")
    public  String shneq(){
       return "shenq_ruz";
    }

    /**
     * 用户注册页面
     * @return
     */
    @RequestMapping("/zhuc")
    public  String zhuc(){
        return  "zhuc";
    }

    /**
     * 帮助中心
     * @return
     */
    @RequestMapping("/bangz_zhongx")
    public String bangz_zhongx(){
        return "bangz_zhongx";
    }

    /**
     * 跳转个人信息
     * */
    @RequestMapping("/ger_xinx")
    public String ger_xinx(){return  "ger_xinx";}

    /**
     * 更多个人信息
     * @return
     */
    @RequestMapping("/gengd_ger_xinx")
    public  String gengdgrxx(){
        return "gengd_ger_xinx";
    }
}
