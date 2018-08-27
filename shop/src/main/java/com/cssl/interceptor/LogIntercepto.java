package com.cssl.interceptor;

import com.cssl.pojo.User;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@Component
public class LogIntercepto  implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       System.out.println(("请求路径：{}:"+request.getRequestURI()));
       boolean flag=true;
       User user = (User) request.getSession().getAttribute("user");
       if(user == null){
       response.sendRedirect("dengl");
         flag = false;
       }
        return true;
    }

}
