package com.github.uuidcode.spring.test;

public class Tool {
    private Integer id;
    private String uuid;

    public String getUuid() {
        return this.uuid;
    }

    public Tool setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public static Tool of() {
        return new Tool();
    }

    public Integer getId() {
        return this.id;
    }

    public Tool setId(Integer id) {
        this.id = id;
        return this;
    }
}
