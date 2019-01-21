//package com.apress.spring.ex;
//
//import java.io.IOException;
//import java.util.List;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.stereotype.Component;
//
//@SpringBootApplication
//public class SpringBootSimpleApplication01 {
//
//	public static void main(String[] args) throws IOException {
//		SpringApplication.run(SpringBootSimpleApplication01.class,args);
//	}
//}
//
//@Component
//class MyComponent {
//
//	private static final Logger log = LoggerFactory.getLogger(MyComponent.class);
//
//	@Autowired
//	public MyComponent(ApplicationArguments args) {
//		boolean enable = args.containsOption("enable");
//		
//		/**
//		 * 스프링 부트 최신버전을 사용한다면 다른명령어를 사용해야함
//		 * mvnw spring-boot:run -Drun.arguments="--enable"  << 교재 내용
//		 * mvnw spring-boot:run -Dspring-boot.run.arguments="--enable"  << 바뀐 내용
//		 */
//		if (enable)
//			log.info("## > enable 옵션을 주셨습니다.");
//		
//		List<String> _args = args.getNonOptionArgs();
//		log.info("## > 다른인자...");
//		if (!_args.isEmpty())_args.forEach(file -> log.info(file));
//
//	}
//
//}