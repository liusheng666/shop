package com.cssl.pojo;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

/**
 * 评价表
 */
@Setter
@Getter
public class Pleave_Word {
    private int  plwcode; //id
    private int         uid; //用户id
    private int pcode; //商品id
    private String        plwcontent; //评价内容
    private Date plw; //留言时间
    private int        pstcode;//对应店铺id
    private int         pfuwu;//服务分
    private int  pwuliu;//物流
    private int        pshangpin;//商品满意度
    private int        pniming;//是否匿名

    //引用用户表
    private User user;
    //引用评论图片表表
    private Pleave_Word_Photo pleave_word_photo;

}
