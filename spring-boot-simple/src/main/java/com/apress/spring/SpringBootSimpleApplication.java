package com.apress.spring;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class SpringBootSimpleApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringBootSimpleApplication.class);

	public static void main(String[] args) throws IOException {
		SpringApplication.run(SpringBootSimpleApplication.class, args);
	}

	@Bean
	@Order(3)
	String info() {
		return "간단한 문자열 빈입니다.";
	}

	@Autowired
	String info;

	@Bean
	@Order(2)
	CommandLineRunner myMethod() {
		return args -> {
			log.info("## > 111 CommandLineRunner 구현체...");
			log.info("info 빈에 액세스: " + info);
			for(String arg:args)
				log.info(arg);
		};
		
	}
	
	@Bean
	@Order(1)
	CommandLineRunner myMethod2() {
		return args -> {
			log.info("## > 2222 CommandLineRunner 구현체...");
			log.info("info 빈에 액세스: " + info);
			for(String arg:args)
				log.info(arg);
		};
		
	}


}
