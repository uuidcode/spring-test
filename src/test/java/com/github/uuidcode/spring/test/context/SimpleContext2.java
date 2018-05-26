package com.github.uuidcode.spring.test.context;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;

public class SimpleContext2 {
    @Bean
    public DataSource simpleDataSource() {
        return new BasicDataSource();
    }
}
