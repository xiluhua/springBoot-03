package com.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource(value = {"classpath:applicationContext.xml"})
@SpringBootApplication
public class SpringBoot03Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot03Application.class, args);
	}

}

