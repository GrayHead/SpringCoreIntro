package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {


    @Bean
    public User user1() {
        System.out.println("1");
        return new User(1, "vasya");
    }

    @Bean(name = "u2")
    public User user2() {
        System.out.println("2");
        return new User(2, "petya");
    }


}
