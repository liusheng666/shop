package com.cssl.service;

import com.cssl.pojo.User;
import com.cssl.pojo.Usermassage;
import com.cssl.pojo.Userxq;

public interface UserService {

    /**
     * 登录
     * */
    public User userLogin(User user);

    /**
     * 用户显示个人信息
     * */
    public Usermassage usergrxx(Usermassage usermassage);

    /**
     * 判断用户名是否存在
     * */
    public int usercount(String uname);

    /**
     * 修改个人信息
     * */
    public int userxiugai(Usermassage usermassage);

    /**
     * 修改更多个人信息
     * */
    public int usergengdxx(Userxq userxq);

    /**
     * 更多个人信息
     * */
    public Userxq usergengdgrxx(Userxq userxq);

    /**
     * 查询是否有个人信息
     * */
    public int grxxcount(int uid);

    /**
     * 添加个人信息
     * */
    public int insertgrxx(Usermassage usermassage);

    /**
     * 查询是否有更多个人信息
     * */
    public int gengdxxcount(int userid);

    /**
     * 添加更多个人信息
     * */
    public int insertgengdxx(Userxq userxq);
}
