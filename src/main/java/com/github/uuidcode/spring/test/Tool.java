package com.github.uuidcode.spring.test;

public class Tool {
    private Integer id;
    private Long uuid;

    public Long getUuid() {
        return this.uuid;
    }

    public Tool setUuid(Long uuid) {
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
