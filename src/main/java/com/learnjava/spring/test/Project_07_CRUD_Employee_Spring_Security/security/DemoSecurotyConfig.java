package com.learnjava.spring.test.Project_07_CRUD_Employee_Spring_Security.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class DemoSecurotyConfig {
    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){

        UserDetails john = User.builder()
                .username("john")
                .password("{noop}test123")
                .roles("EMPLOYEE")
                .build();

        UserDetails sobhit = User.builder()
                .username("sobhit")
                .password("{noop}test123")
                .roles("EMPLOYEE")
                .build();

        UserDetails sonu = User.builder()
                .username("sonu")
                .password("{noop}test123")
                .roles("EMPLOYEE")
                .build();

        return new InMemoryUserDetailsManager(john, sobhit,sonu);

    }
}
