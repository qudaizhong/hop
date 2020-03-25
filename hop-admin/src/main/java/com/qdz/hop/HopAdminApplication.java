package com.qdz.hop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author qdz
 * @createDate 2020年3月7日 下午1:45:54
 * @updateDate 2020年3月7日 下午1:45:54
 * @version 1.0
 */
@SpringBootApplication
@MapperScan({ "com.qdz.hop.mapper", "com.qdz.hop.dao" })
public class HopAdminApplication {
	public static void main(String[] args) {
		SpringApplication.run(HopAdminApplication.class, args);
	}
}
