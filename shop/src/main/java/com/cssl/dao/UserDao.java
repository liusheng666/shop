package com.cssl.dao;

import com.cssl.pojo.User;
import com.cssl.pojo.Usermassage;
import com.cssl.pojo.Userxq;
import org.apache.ibatis.annotations.Param;

/**
 * 用户接口
 */
public interface UserDao {
    /**
     * 用户登录
     * */
    public User userLogin(User user);

    /**
     * 用户显示个人信息
     * */
    public Usermassage usergrxx(Usermassage usermassage);

    /**
     * 判断用户名是否存在
     * */
    public int usercount(@Param("uname") String uname);

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
    public int grxxcount(@Param("uid") int uid);

    /**
     * 添加个人信息
     * */
    public int insertgrxx(Usermassage usermassage);

    /**
     * 查询是否有更多个人信息
     * */
    public int gengdxxcount(@Param("userid") int userid);

    /**
     * 添加更多个人信息
     * */
    public int insertgengdxx(Userxq userxq);

    /**
     * 注册
     * */
    public int zhuce(User user);


}
