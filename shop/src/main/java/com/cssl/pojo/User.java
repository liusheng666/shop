package com.cssl.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
public class User {
    //用户id
    private int uid;
    //用户名
     private String  uname;
     //用户密码
    private String  upassword;
    //用户身份
    private int  utype;
    //注册时间
    private Date regtime;
    //最后登录时间
    private Date   lasttime;
    //用户头像
    private String  image;
    //用户电话号码
    private String utel;
    //用户是否同意协议
    private int uxieyi;

  /*  //订单表
    private Porder porder;

    //支付表
    private Pay pay;

    //订单状态表
    private Dingdanzt dingdanzt;*/

    //listimage
    /*private List<String> listimage;*/


}
