package com.test.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 扩展springmvc功能
 * 即保留了springboot所有的自动配置，也能用我们扩展的功能
 *
 */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //当访问项目根路径时跳转到login页面
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index.html").setViewName("login");
        //欢迎页
        registry.addViewController("/main.html").setViewName("dashboard");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //springboot巳经处理好了静态资源映射，不用配置
        // registry.addInterceptor(new LoginInterceptor())
        //         .addPathPatterns("/**")
        //         .excludePathPatterns("/", "/index.html", "/user/login");
    }
}
