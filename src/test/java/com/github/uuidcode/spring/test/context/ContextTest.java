package com.github.uuidcode.spring.test.context;

import java.util.Map;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContextTest {
    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(SimpleContext.class);
        context.register(SimpleContext2.class);
        context.refresh();

        Map<String, DataSource> beansOfType = context.getBeansOfType(DataSource.class);
        System.out.println(beansOfType);
    }
}