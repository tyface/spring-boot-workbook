package com.boot.ex;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.boot.ex.domain.Journal;
import com.boot.ex.repository.JournalRepository;

@SpringBootApplication
public class SpringBootBoard2Application {
	
	@Bean
	InitializingBean saveData(JournalRepository repo) {
		return () -> {
			repo.save(new Journal("스프링 부트 입문111","1111","2016/01/01"));
			repo.save(new Journal("스프링 부트 입문2","2222","2016/01/02"));
			repo.save(new Journal("스프링 부트 입문3","33333","2016/01/03"));
			repo.save(new Journal("스프링 부트 입문4","4444","2016/01/04"));
		};
	}
	
    @Bean
    CommandLineRunner init(JournalRepository repo) {
        return args -> {
            System.out.println("---------------------------------");
            repo.findAll().forEach(System.out::println);
            System.out.println("---------------------------------");
        };
    }
    
	public static void main(String[] args) {
		SpringApplication.run(SpringBootBoard2Application.class, args);
	}

}

