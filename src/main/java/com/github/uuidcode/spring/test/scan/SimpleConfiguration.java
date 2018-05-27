package com.github.uuidcode.spring.test.scan;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@SimpleScan(name = "hello")
public class SimpleConfiguration {
    @Bean
    public DataSource alphaDataSource() {
        return new BasicDataSource();
    }
}
