package com.khadri.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Student student = context.getBean("std", Student.class);
        System.out.println(student.getCollege());
        System.out.println(student.getAddress());


    }
}