package com.github.uuidcode.spring.test;

import org.springframework.beans.factory.FactoryBean;

public class ToolFactory implements FactoryBean<Tool> {
    private Integer toolId;
    private Long uuid;

    public Long getUuid() {
        return this.uuid;
    }

    public ToolFactory setUuid(Long uuid) {
        this.uuid = uuid;
        return this;
    }
    public Integer getToolId() {
        return this.toolId;
    }

    public ToolFactory setToolId(Integer toolId) {
        this.toolId = toolId;
        return this;
    }

    public Tool getObject() throws Exception {
        return Tool.of()
            .setId(this.toolId)
            .setUuid(this.uuid);
    }

    public Class<?> getObjectType() {
        return Tool.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
