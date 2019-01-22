package com.apress.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SimpleWebSpringBootApplication {

	@RequestMapping("/showMessage.html")
	public String index() {
		return "Spring boot start!!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SimpleWebSpringBootApplication.class, args);
	}

}

