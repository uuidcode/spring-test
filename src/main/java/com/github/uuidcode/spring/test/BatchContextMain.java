package com.github.uuidcode.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BatchContextMain {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("batch-context.xml");
    }
}
