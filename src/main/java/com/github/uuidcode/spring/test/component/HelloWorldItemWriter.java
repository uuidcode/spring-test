package com.github.uuidcode.spring.test.component;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.uuidcode.spring.test.CoreUtil;
import com.github.uuidcode.spring.test.HelloWorld;

@Component
@Scope(value = "step")
public class HelloWorldItemWriter implements ItemWriter<HelloWorld> {
    @Override
    public void write(List<? extends HelloWorld> list) throws Exception {
        CoreUtil.info("write", list.size());
        CoreUtil.info(list);
    }
}
