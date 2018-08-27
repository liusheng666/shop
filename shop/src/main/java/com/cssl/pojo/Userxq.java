package com.cssl.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Userxq {
    private int mcode;          //详情id
    private int hunyin;         //0为未婚,1为已婚,2为保密
    private String shouru;      //家庭收入
    private String chengyuan;   //家庭成员
    private String xueli;       //学历
    private String zhiye;       //职业
    private String guanzhusp;   //关注的商品(可以为空)
    private int userid;         //对应登录的用户id
}
