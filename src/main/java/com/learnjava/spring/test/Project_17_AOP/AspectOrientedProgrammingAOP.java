package com.learnjava.spring.test.Project_17_AOP;

import com.learnjava.spring.test.Project_17_AOP.dao.AccountDao;
import com.learnjava.spring.test.Project_17_AOP.dao.MembershipDao;
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
    public CommandLineRunner commandLineRunner(AccountDao dao, MembershipDao membershipDao){
        return runner ->{
            demoTheBeforeAdvice(dao, membershipDao);
        };
    }

    private void demoTheBeforeAdvice(AccountDao dao, MembershipDao membershipDao) {
        Account account= new Account();

        dao.addAccount(account, true);
        dao.addSillyAccount();
        dao.doWork();

        membershipDao.addAccount();
        membershipDao.goToSleep();
    }
}
