package com.github.uuidcode.spring.test.component;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.uuidcode.spring.test.CoreUtil;
import com.github.uuidcode.spring.test.Tool;

@Component
@Scope(value = "step")
public class HelloWorldItemProcessor implements ItemProcessor<Tool, Tool> {
    @Override
    public Tool process(Tool tool) throws Exception {
        return tool.setUuid(CoreUtil.uuid());
    }
}
