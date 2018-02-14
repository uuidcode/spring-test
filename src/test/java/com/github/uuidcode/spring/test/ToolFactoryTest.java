package com.github.uuidcode.spring.test;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.uuidcode.spring.test.component.ToolComponent;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:context.xml" })
public class ToolFactoryTest {
    protected static Logger logger = LoggerFactory.getLogger(ToolFactoryTest.class);

    @Autowired
    private Tool tool;

    @Autowired
    private ToolComponent toolComponent;

    @Test
    public void test() {
        CoreUtil.debug(this.tool);
        assertThat(this.tool.getId()).isEqualTo(1);
        assertThat(this.toolComponent.uuid()).isNotNull();
    }
}