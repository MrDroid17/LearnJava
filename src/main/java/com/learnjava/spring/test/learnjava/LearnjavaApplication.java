package com.learnjava.spring.test.learnjava;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//@SpringBootApplication(
//		scanBasePackages = {"com.learnjava.spring.test.learnjava", "com.learnjava.spring.test.utils"}
//)

@SpringBootApplication
public class LearnjavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnjavaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(String[] args){
		return runner -> {
			System.out.println("Hello World");
		};
	}
}
