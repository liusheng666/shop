package com.cssl.pojo;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.List;

/**
 * 订单表
 * */
@Setter
@Getter
public class Porder {
    private int porderid; //订单id
    private String ocode; //订单编号
    private int stcode;//订单店铺
    private String kdid;//快递编号
    private int kdcompany;//快递公司id
    private Date fahuotime;//发货时间
    private int uid;//用户编号
    private Double oprice;//订单价格
    private Date otime;//订单生成时间
    private int shouhuo;//收货方式
    private int fukuan;//付款方式
    private int ostate;//物流状态 0 待发货 1 已收货,2退货中
    private int integral;//此订单积分
    private String userappraise;//用户订单评价
    private int pordertype;//订单状态0 正常 1删除  -1退款
    private String pdanhao;//货运单号
    private String paddress;//收货地址

    private List<OrderProduct> orderProductList;
    //支付表
    private Pay pay;
    //订单状态表
    private Dingdanzt dingdanzt;
    //订单详情表
    private OrderProduct orderProduct;

    //用户表
    private User user;

    //图片
    private Product product;

    //快递公司
    private Shiping_method shiping_method;

}
