package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * SpringBootApplication:标注springboot启动类
 * ImportResource:导入spring配置文件
 */
@SpringBootApplication
@ImportResource(value = {"classpath:beans.xml"})
public class SpringbootTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTestApplication.class, args);
	}
}
