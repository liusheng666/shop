package com.cssl.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

//@Configuration
public class WebConfiguration implements WebMvcConfigurer {
    /**
     * 重写添加拦截器方法并添加配置拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        List<String> list = new ArrayList<>();
        list.add("/dengl");
        list.add("/static/**");
        list.add("/zhuc.html");
        list.add("/index");
        registry.addInterceptor(new LogIntercepto()).addPathPatterns("/**").excludePathPatterns(list);
    }

}
