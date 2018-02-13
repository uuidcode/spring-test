package com.github.uuidcode.spring.test.component;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class ToolComponent {
    public String uuid() {
        return UUID.randomUUID().toString();
    }
}
