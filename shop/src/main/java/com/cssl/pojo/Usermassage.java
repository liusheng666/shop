package com.cssl.pojo;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

/**
 * 用户信息
 */
@Setter
@Getter
public class Usermassage {
    private int mcode;          //用户信息编号
    private int uid;            //用户编号(对应user表的id)
    private String email;       //用户邮箱
    private String realname;    //真实姓名
    private int usex;           //用户性别(1为男,0为女,2为保密)
    private String uname;       //用户名
    private Date uage;          //用户生辰
}
