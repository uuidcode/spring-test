package com.github.uuidcode.spring.test;

public class HelloWorld {
    private Integer id;
    private String uuid;

    public String getUuid() {
        return this.uuid;
    }

    public HelloWorld setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public static HelloWorld of() {
        return new HelloWorld();
    }

    public Integer getId() {
        return this.id;
    }

    public HelloWorld setId(Integer id) {
        this.id = id;
        return this;
    }
}
