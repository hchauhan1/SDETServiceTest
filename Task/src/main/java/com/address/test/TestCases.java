package com.address.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@ComponentScan({"com.address.test"})

@SpringBootApplication
public class TestCases {

	public static void main(String[] args) {
		SpringApplication.run(TestCases.class, args);
	}

}
