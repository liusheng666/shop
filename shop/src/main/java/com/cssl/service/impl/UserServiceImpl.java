package com.cssl.service.impl;

import com.cssl.dao.UserDao;
import com.cssl.pojo.User;
import com.cssl.pojo.Usermassage;
import com.cssl.pojo.Userxq;
import com.cssl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public User userLogin(User user) {
        return userDao.userLogin(user);
    }

    /**
     * 用户显示个人信息
     * */
    @Override
    public Usermassage usergrxx(Usermassage usermassage){return  userDao.usergrxx(usermassage);}

    /**
     * 判断用户名是否存在
     * */
    public int usercount(String uname){return  userDao.usercount(uname);}


    /**
     * 修改个人信息
     * */
    public int userxiugai(Usermassage usermassage){return  userDao.userxiugai(usermassage);}

    /**
     * 更多个人信息
     * */
    public Userxq usergengdgrxx(Userxq userxq){return  userDao.usergengdgrxx(userxq);}

    /**
     * 修改更多个人信息
     * */
    public int usergengdxx(Userxq userxq){return  userDao.usergengdxx(userxq);}

    /**
     * 查询是否有个人信息
     * */
    public int grxxcount(int uid){return  userDao.grxxcount(uid);}

    /**
     * 添加个人信息
     * */
    public int insertgrxx(Usermassage usermassage){return userDao.insertgrxx(usermassage);}

    /**
     * 查询是否有更多个人信息
     * */
    public int gengdxxcount(int userid){return  userDao.gengdxxcount(userid);}

    /**
     * 添加更多个人信息
     * */
    public int insertgengdxx(Userxq userxq){return  userDao.insertgengdxx(userxq);}
}
