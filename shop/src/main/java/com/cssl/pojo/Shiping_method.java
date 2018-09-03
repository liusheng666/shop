package com.cssl.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * 快递公司
 * */
@Setter
@Getter
public class Shiping_method {
    private int scode; //配送方式编号
    private String sname;//方式名称
    private int sstate;//0为未发货,1为运输中,2为已到达
    private String stel;//承运人电话

}
