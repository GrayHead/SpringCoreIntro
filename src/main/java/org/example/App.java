package org.example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        User user1 = context.getBean("user1", User.class);
        System.out.println(user1);

        User u2 = context.getBean("u2", User.class);
        System.out.println(u2);
    }
}
