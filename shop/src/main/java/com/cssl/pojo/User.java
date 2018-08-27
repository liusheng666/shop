package com.cssl.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 用户实体类
 */
@Setter
@Getter
public class User {
    //用户id
     private int uid;
     //用户名字
    private String uname;
    //用户密码
    private String upassword;
    //用户身份
    private int utype;
    //用户注册时间
    private Date regtime;
    //最后登录时间
    private Date lasttime;
    //用户头像
    private String image;


}
