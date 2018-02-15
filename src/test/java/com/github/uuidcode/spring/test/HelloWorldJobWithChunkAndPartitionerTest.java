package com.github.uuidcode.spring.test;

import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(locations = {"classpath:jobs/helloWorldWithChunkAndPartitioner.xml"})
public class HelloWorldJobWithChunkAndPartitionerTest extends CoreTest {
}
