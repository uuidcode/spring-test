package com.github.uuidcode.spring.test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:context.xml" })
public class ToolFactoryTest {
    protected static Logger logger = LoggerFactory.getLogger(ToolFactoryTest.class);

    @Autowired
    private Tool tool;

    @Test
    public void test() {
        CoreUtil.toJson(this.tool);
        assertThat(tool.getId()).isEqualTo(1);
    }
}