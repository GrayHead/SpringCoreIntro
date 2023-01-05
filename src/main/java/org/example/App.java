package org.example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 */
@ComponentScan("org.example.**")
public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class,App.class);

        User user1 = context.getBean("user1", User.class);
        System.out.println(user1);

        User u2 = context.getBean("u2", User.class);
        System.out.println(u2);


        Passport passport = context.getBean("passport2",Passport.class);
        System.out.println(passport);


    }
}
