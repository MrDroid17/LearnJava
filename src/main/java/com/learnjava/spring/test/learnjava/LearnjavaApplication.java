package com.learnjava.spring.test.learnjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {"com.learnjava.spring.test.learnjava", "com.learnjava.spring.test.utils"})
public class LearnjavaApplication {
	public static void main(String[] args) {
		SpringApplication.run(LearnjavaApplication.class, args);
	}
}
