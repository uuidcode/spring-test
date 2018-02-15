package com.github.uuidcode.spring.test.component;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.uuidcode.spring.test.CoreUtil;
import com.github.uuidcode.spring.test.Tool;

@Component
@Scope(value = "step")
public class HelloWorldItemWriter implements ItemWriter<Tool> {
    @Override
    public void write(List<? extends Tool> list) throws Exception {
        CoreUtil.info(list);
    }
}
