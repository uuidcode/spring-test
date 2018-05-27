package com.github.uuidcode.spring.test.proxy;

import static org.junit.Assert.*;

import java.lang.reflect.Proxy;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BookInvocationHandlerTest {
    protected static Logger logger = LoggerFactory.getLogger(BookInvocationHandlerTest.class);

    @Test
    public void test() throws Exception {
        Book book = (Book) Proxy.newProxyInstance(Book.class.getClassLoader(), new Class[] {Book.class},
            new BookInvocationHandler().setBook(new BookImpl()));

        String name = book.getName();

        if (logger.isDebugEnabled()) {
            logger.debug(">>> test name: {}", name);
        }
    }
}