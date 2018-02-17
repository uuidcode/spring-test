package com.github.uuidcode.spring.test.component;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.uuidcode.spring.test.CoreUtil;
import com.github.uuidcode.spring.test.HelloWorld;

@Component
@Scope(value = "step")
public class HelloWorldItemProcessor implements ItemProcessor<HelloWorld, HelloWorld> {
    @Override
    public HelloWorld process(HelloWorld helloWorld) throws Exception {
        return helloWorld.setUuid(CoreUtil.uuid());
    }
}
