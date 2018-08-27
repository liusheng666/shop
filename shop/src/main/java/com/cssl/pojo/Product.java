package com.cssl.pojo;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

/**
 * 商品实体类
 */
@Setter
@Getter
public class Product {
    private int  pcode;//产品编号
    private String pname ;//产品名称
    private int  pguishu ;//产品归属店铺
    private int  pstate ;//产品状态
    private int  sponecode ;//所属一级分类
    private int   sptwocode;//所属二级分类
    private  int   spthreecode;//所属三级分类
    private   Date  pissue;//发布时间
    private   String     pphoto ;//产品照片
    private   String     pbigphoto ;//产品大图
    private    Double  pprice ;//市场价格
    private    int   psum ;//产品数量
    private    String     putil; //产品单位
    private   String     pintroduce;//产品介绍
    private    Date     startime ;//起售时间
    private Date   endtime ;//结束时间
    private   int    integral; //购买可获积分
    private Spone spone;
    private Sptwo sptwo;
    private Spthree spthree;

}
