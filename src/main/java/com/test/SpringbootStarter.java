package com.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * SpringBootApplication:标注springboot启动类
 * ImportResource:导入spring配置文件
 */
@SpringBootApplication
@ImportResource(value = {"classpath:beans.xml"})
// 扫描mapper
@MapperScan(value = "com.test.web.mapper")
public class SpringbootStarter {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootStarter.class, args);
	}
}
