package com.cssl.service;

import com.cssl.pojo.Pleave_Word;

import java.util.Map;

/**
 * 评论
 */
public interface Pleave_WordService {
    //查询评论
    public Pleave_Word pw(Map<String,Object> map);

    //查询商品的评论人数
    public int pwCount(int pid);

    //查询好评率
    public Map<String ,Object> pwMap(Map<String,Object> map);
    //总数
    public int pwCounts(int pid);
}
