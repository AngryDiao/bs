package com.bsojbk.orderCarry;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//扫描mapper接口
@MapperScan("com.bsojbk.orderCarry.mapper")
public class OrderCarryApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderCarryApplication.class, args);
	}

}
