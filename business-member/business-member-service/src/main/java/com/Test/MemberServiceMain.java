package com.Test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.member.dao")
public class MemberServiceMain {

	public static void main(String[] args) {
		SpringApplication.run(MemberServiceMain.class);

	}

}
