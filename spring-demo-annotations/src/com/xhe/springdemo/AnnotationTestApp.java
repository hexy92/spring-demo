package com.xhe.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTestApp {
    public static void main(String[] args) {

        //read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //get the bean from the spring container
        Coach tennisCoach = (Coach) context.getBean("tennisCoach");

        System.out.println(tennisCoach.getDailyWorkout());

        System.out.println(tennisCoach.getDailyFortune());
        context.close();
    }
}
