package com.learnjava.spring.test.Project_07_CRUD_Employee_Spring_Security.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;


@Configuration
public class DemoSecurityConfig {

    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource){
        JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);

        jdbcUserDetailsManager.setUsersByUsernameQuery(
                "select user_id, pw, active from members where user_id=?");

        jdbcUserDetailsManager.setAuthoritiesByUsernameQuery(
                "select user_id, role from roles where user_id=?");

        return jdbcUserDetailsManager;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests(configurer ->{
            configurer
                    .requestMatchers(HttpMethod.GET, "/api/employees").hasRole("EMPLOYEE")
                    .requestMatchers(HttpMethod.GET, "/api/employees/**").hasRole("EMPLOYEE")
                    .requestMatchers(HttpMethod.POST, "/api/employees").hasRole("MANAGER")
                    .requestMatchers(HttpMethod.PUT, "/api/employees").hasRole("MANAGER")
                    .requestMatchers(HttpMethod.DELETE,"api/employees/**").hasRole("ADMIN");
        });

        // Basic http security
        http.httpBasic(Customizer.withDefaults());

        // disable Cross Site Request Forgery(CSRF)
        // Not required for stateless REST API POST, PUT, DELETE, PATCH
        http.csrf(csrf -> csrf.disable());

        return http.build();
    }


    // Hard Coded data user data
    /*
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
                .roles("MANAGER")
                .build();

        UserDetails sonu = User.builder()
                .username("sonu")
                .password("{noop}test123")
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(john, sobhit,sonu);

    }
*/

}
