package com.cssl.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * 订单详情表
 * */
@Setter
@Getter
public class OrderProduct {
    private int opcode;//订单商品编号
    private String ocode;//订单编号(uuid)
    private int pcode;//商品编号
    private int pnum;//商品数量
    private Double pprice; //商品价格
    private int pintegral ;//商品积分

    //商品详情表
    private Product product;

}
