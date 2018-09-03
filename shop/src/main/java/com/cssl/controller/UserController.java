package com.cssl.controller;

import com.cssl.pojo.User;
import com.cssl.pojo.Usermassage;
import com.cssl.pojo.Userxq;
import com.cssl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.sql.Date;
import java.text.SimpleDateFormat;


/**
 * 用户控制器
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 用户登录
     * */
    @RequestMapping("/userlogin")
    private String userLogin(User user, HttpSession session){
        User user1 = userService.userLogin(user);
        if(user1 != null){
            //用户登录成功user
            session.setAttribute("user",user1);
            return "forward:index";
        }
        return "forward:dengl";
    }

    /**
     * 用户退出
     * */
    @RequestMapping("/tuichu")
    public String tuichu(HttpSession session){
        session.invalidate();
        return "forward:index";
    }

    /**
     * 个人信息
     * */
    @RequestMapping("/gerexx")
    public String gerexx(HttpSession session,Usermassage usermassage){
        User user =(User) session.getAttribute("user");
        int uid=user.getUid();
        String uname1=user.getUname();
       /* Date date1=(Date) user.getRegtime();*/
        System.out.printf("uid:"+uid);
        int count1=userService.grxxcount(uid);
        if(count1>0){
            usermassage.setUid(uid);
            Usermassage usermassage1= userService.usergrxx(usermassage);
            session.setAttribute("usermassage1",usermassage1);
            return "forward:ger_xinx";
        }else {
            usermassage.setUid(uid);
            usermassage.setEmail("请输入邮箱");
            usermassage.setRealname("请输入真实姓名");
            usermassage.setUsex(2);
            usermassage.setUname(uname1);
            usermassage.setUage(Date.valueOf("2018-8-21"));
            int num1=userService.insertgrxx(usermassage);
            if(num1>0){
                return "forward:gerexx";
            }
        }
        return "forward:gerexx";

    }

    /**
     * 更多个人信息
     * */
    @RequestMapping("/gengdgrxx")
    public String gengdgrxx(HttpSession session,Userxq serxq){
        User user =(User) session.getAttribute("user");
        int uid=user.getUid();
        serxq.setUserid(uid);
        int count1=userService.gengdxxcount(serxq.getUserid());
        if(count1>0){
            serxq.setUserid(uid);
            Userxq userxq1= userService.usergengdgrxx(serxq);
            session.setAttribute("userxq1",userxq1);
            return "forward:gengd_ger_xinx";
        }else{
            serxq.setHunyin(2);
            serxq.setShouru("0");
            serxq.setChengyuan("0");
            serxq.setXueli("不详");
            serxq.setZhiye("不详");
            serxq.setGuanzhusp("0");
            serxq.setUserid(uid);
            int num1= userService.insertgengdxx(serxq);
            if(num1>0){
                return "forward:gengdgrxx";
            }

        }
        return "forward:gengdgrxx";
    }

    /**
     * 修改个人信息
     * */
    @RequestMapping("/xiugaigrxx")
    public String xiugaigrxx(Usermassage usermassage){
        int num1=userService.userxiugai(usermassage);
        if(num1>0){
            return "forward:gerexx";
        }
            return "forward:gerexx";
    }

    /**
     * 修改更多个人信息
     * */
    @RequestMapping("/xiugaigengdgrxx")
    public String xiugaigengdgrxx(Userxq userxq){
       int num1= userService.usergengdxx(userxq);
        System.out.printf("num1:"+num1);
       if(num1>0){
           return "forward:gengdgrxx";
       }
        return "forward:gengdgrxx";
    }

    /**
     * 个人信息ajax判断用户是否存在
     * */
    @RequestMapping("/ajaxgerxx")
    @ResponseBody
    public int ajaxgerxx(String uname){

        return userService.usercount(uname);
    }

    /**
     * 注册
     * */
    @RequestMapping("/zhuceuser")
    public String zhuceuser(User user){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        user.setRegtime(new Date(System.currentTimeMillis()));
        System.out.printf("当前时间"+new Date(System.currentTimeMillis()));
        user.setUtype(0);
        user.setImage("images/qie.jpg");
        int num=userService.zhuce(user);
        System.out.printf("注册num:"+num);
        if(num>0){
            return  "forward:dengl";
        }
        return  "forward:zhuc";
    }


}
