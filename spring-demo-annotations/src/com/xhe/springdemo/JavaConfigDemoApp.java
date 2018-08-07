package com.xhe.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {

        //read spring config file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //get the bean from the spring container
        Coach tennisCoach = (Coach) context.getBean("tennisCoach");

        System.out.println(tennisCoach.getDailyWorkout());

        System.out.println(tennisCoach.getDailyFortune());
        context.close();
    }
}
