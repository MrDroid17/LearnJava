package com.learnjava.spring.test.Project_17_AspectOrientedProgramming;

import com.learnjava.spring.test.Project_17_AspectOrientedProgramming.dao.AccountDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AspectOrientedProgrammingAOP {
    public static void main(String[] args){
        SpringApplication.run(AspectOrientedProgrammingAOP.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AccountDao dao){
        return runner ->{
            demoTheBeforeAdvice(dao);
        };
    }

    private void demoTheBeforeAdvice(AccountDao dao) {
        dao.addAccount();
        System.out.println("\n Lets call it again:  \n");
        dao.addAccount();
    }
}
