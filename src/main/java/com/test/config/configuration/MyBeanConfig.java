package com.test.config.configuration;


import com.test.config.importResource.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 指明当前类是一个配置类，用来代替之前的spring配置文件
 */
@Configuration
public class MyBeanConfig {

    /**
     * 将方法的返回值加到容器中，容器中默认的bean id就是方法名
     * @return
     */
    @Bean
    public HelloService helloService02(){
        System.out.println("helloService02初始化");
        return new HelloService();
    }
}
