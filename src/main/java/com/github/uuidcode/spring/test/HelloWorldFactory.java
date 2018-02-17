package com.github.uuidcode.spring.test;

import org.springframework.beans.factory.FactoryBean;

public class HelloWorldFactory implements FactoryBean<HelloWorld> {
    private Integer toolId;
    private String uuid;

    public String getUuid() {
        return this.uuid;
    }

    public HelloWorldFactory setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public Integer getToolId() {
        return this.toolId;
    }

    public HelloWorldFactory setToolId(Integer toolId) {
        this.toolId = toolId;
        return this;
    }

    public HelloWorld getObject() throws Exception {
        return HelloWorld.of()
            .setId(this.toolId)
            .setUuid(this.uuid);
    }

    public Class<?> getObjectType() {
        return HelloWorld.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
