package com.github.uuidcode.spring.test.component;

import java.util.Map;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.uuidcode.spring.test.CoreUtil;
import com.github.uuidcode.spring.test.HelloWorld;

@Component
@Scope(value = "step")
public class HelloWorldItemReader implements ItemReader {
    private static int id = 1;

    @Value("#{stepExecutionContext}")
    private Map stepExecutionContext;

    @Override
    public Object read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        CoreUtil.info("stepExecutionContext[" + Thread.currentThread().getName() + "]", stepExecutionContext);

        Thread.sleep(1000);

        if (id >= 10) {
            return null;
        }

        return HelloWorld.of().setId(id++);
    }
}
