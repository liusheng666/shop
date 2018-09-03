package com.cssl.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * 支付表
 * */
@Setter
@Getter
public class Pay {
    private int pcode;//支付方式编号
    private String pname;//方式名称

}
