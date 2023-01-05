package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {


//    private Passport passport;
//
//    public BeanConfig(@Qualifier("passport") Passport passport) {
//        this.passport = passport;
//    }


    @Bean
    public Passport passport1() {
        return new Passport("asgdhgasfd");
    }

    @Bean
    public Passport passport2() {
        return new Passport("yt7723r476r32");
    }

    @Bean
    public User user1() {
        System.out.println("1");
        return new User(1, "vasya", passport1());
    }

    @Bean(name = "u2")
    public User user2(@Qualifier("passport2") Passport passport) {
        System.out.println("2");
        return new User(2, "petya", passport);
    }


}
