package com.learnjava.spring.test.Project_18_AOP_PointCut_Declaration;

import com.learnjava.spring.test.Project_18_AOP_PointCut_Declaration.dao.AccountDao;
import com.learnjava.spring.test.Project_18_AOP_PointCut_Declaration.dao.MembershipDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class AOP_PointCutDeclaration {
    public static void main(String[] args){
        SpringApplication.run(AOP_PointCutDeclaration.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AccountDao dao, MembershipDao membershipDao){
        return runner ->{
//            demoTheBeforeAdvice(dao, membershipDao);
            demoTheAfterReturningAdvice(dao);
        };
    }



    private void demoTheBeforeAdvice(AccountDao dao, MembershipDao membershipDao) {
        Account account= new Account();
        account.setFirstName("Cult Pass");
        account.setLastName("prime members");

        dao.addAccount(account, true);
        dao.addSillyAccount();
        dao.doWork();

        /**
         * Getter/Setter
         */
        dao.setName("Foobar");
        dao.setServiceCode("Random code");

        String name = dao.getName();
        String code = dao.getServiceCode();;

        membershipDao.addAccount();
        membershipDao.goToSleep();
    }

    private void demoTheAfterReturningAdvice(AccountDao dao) {
        List<Account> accounts = dao.findAccount();
        System.out.println("\n\n Main Program: demoTheAfterReturningAdvice");
        System.out.println("----------------");

        System.out.println(accounts);

        System.out.println("\n");
    }
}
