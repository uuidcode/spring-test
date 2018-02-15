package com.github.uuidcode.spring.test.component;

import org.springframework.batch.core.partition.support.Partitioner;
import org.springframework.batch.core.partition.support.SimplePartitioner;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "step")
public class HelloWorldPartitioner extends SimplePartitioner {
}
