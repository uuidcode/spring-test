package com.github.uuidcode.spring.test.scan;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SimpleConfigurationTest {
    protected static Logger logger = LoggerFactory.getLogger(SimpleConfigurationTest.class);

    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(SimpleConfiguration.class);
        context.refresh();

        Object object = context.getBean("alphaDataSource");

        if (logger.isDebugEnabled()) {
            logger.debug(">>> test object: {}", object);
        }
    }

}