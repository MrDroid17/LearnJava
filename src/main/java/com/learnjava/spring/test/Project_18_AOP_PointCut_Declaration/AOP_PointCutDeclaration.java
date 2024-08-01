package com.learnjava.spring.test.Project_18_AOP_PointCut_Declaration;

import com.learnjava.spring.test.Project_18_AOP_PointCut_Declaration.dao.AccountDao;
import com.learnjava.spring.test.Project_18_AOP_PointCut_Declaration.dao.MembershipDao;
import com.learnjava.spring.test.Project_18_AOP_PointCut_Declaration.service.TrafficFortuneService;
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
    public CommandLineRunner commandLineRunner(AccountDao dao, MembershipDao membershipDao, TrafficFortuneService trafficFortuneService){
        return runner ->{
//            demoTheBeforeAdvice(dao, membershipDao);
//            demoTheAfterReturningAdvice(dao);
//            demoTheAfterThrowingAdvice(dao);
//            demoAfterFinallyAdvice(dao);
//            demoAroundAdvice(trafficFortuneService);
            demoAroundAdviceWithExceptionhandling(trafficFortuneService);
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

    private void demoTheAfterThrowingAdvice(AccountDao dao) {

        List<Account> accounts = null;

        try {
            boolean tripWire = true;
            accounts = dao.findAccount(tripWire);
        }catch (Exception exception){
            System.out.println("\n\n Main Program: New Exception : " + exception);
        }
        System.out.println("\n\n Main Program: demoTheAfterThrowingAdvice");
        System.out.println("----------------");

        System.out.println(accounts);

        System.out.println("\n");
    }

    private void demoAfterFinallyAdvice(AccountDao dao) {
        List<Account> accounts = null;

        try {
            boolean tripWire = false;
            accounts = dao.findAccount(tripWire);
        }catch (Exception exception){
            System.out.println("\n\n Main Program: New Exception : " + exception);
        }
        System.out.println("\n\n Main Program: demoTheAfterThrowingAdvice");
        System.out.println("----------------");

        System.out.println(accounts);

        System.out.println("\n");
    }

    private void demoAroundAdvice(TrafficFortuneService service) {
        System.out.println("\nMain Program: Running  demoAroundAdvice ... ");
        System.out.println("\nCalling getFortune ... ");
        String fortune = service.getFortune();
        System.out.println("Fortune is: "+ fortune);

    }

    private void demoAroundAdviceWithExceptionhandling(TrafficFortuneService service) {
        System.out.println("\nMain Program: Running  demoAroundAdvice ... ");
        System.out.println("\nCalling getFortune ... ");

        boolean tripWire = true;
        String fortune = service.getFortune(tripWire);

        System.out.println("Fortune is: "+ fortune);

    }

}
