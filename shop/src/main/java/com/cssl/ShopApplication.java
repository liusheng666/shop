package com.cssl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan(basePackages="com.cssl.dao")
@EnableTransactionManagement
@SpringBootApplication
@ServletComponentScan
//(exclude = {DataSourceAutoConfiguration.class})
public class ShopApplication {

	public static void main(String[] args) throws Exception {

		SpringApplication app = new SpringApplication(ShopApplication.class);
		//app.setBannerMode(Banner.Mode.OFF);// 关闭启动Banner
		app.run(args);
	}

}
