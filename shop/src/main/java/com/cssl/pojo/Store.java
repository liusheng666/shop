package com.cssl.pojo;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Setter
@Getter
public class Store {
    private int stcode;// 店铺编号
    private String   stname  ;//店铺名称
    private String    stlogo ;//店铺logo
    private int   strange ;//经营范围 引用storetype表
    private String    stphoto;//店铺商标
    private String     stboss;//店铺负责人
    private String     stphone;//负责人联系方式
    private String    staddress;//公司地址
    private String     stemail;//公司邮编
    private String     sttel;//公司电话
    private String      stcz;//公司传真
    private String         qq;//客服qq
    private String        email;//电子邮箱
    private String        admincode;//管理员账号
    private String         adminpwd;//管理员密码
    private String        ststate;//店铺状态
    private Date       sttime;//店铺注册时间
    private Date        lasttime;//最后使用时间
    private String      stsjjs;//店铺商家介绍
    private String     stbuy;//店铺付款说明
    private String     stps;//配送说明
    private int    sjrz;//商家认证
    private String   integralexchange;//积分兑换说明
    private String yinyetime;//营业时间

    //引用商铺类型
    private StoreType storeType;

}
