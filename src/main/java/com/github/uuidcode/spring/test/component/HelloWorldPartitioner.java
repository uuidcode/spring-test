package com.github.uuidcode.spring.test.component;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.partition.support.Partitioner;
import org.springframework.batch.core.partition.support.SimplePartitioner;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.uuidcode.spring.test.CoreUtil;

@Component
@Scope(value = "step")
public class HelloWorldPartitioner implements Partitioner {
    private static final String PARTITION_KEY = "partition";

    @Override
    public Map<String, ExecutionContext> partition(int gridSize) {
        CoreUtil.info("gridSize", gridSize);

        Map<String, ExecutionContext> map = new HashMap<>(gridSize);

        for (int i = 0; i < gridSize; i++) {
            ExecutionContext executionContext = new ExecutionContext();
            executionContext.putInt("index", i);
            map.put(PARTITION_KEY + i, executionContext);
        }

        CoreUtil.info("executionContextMap", map);

        return map;
    }

}
