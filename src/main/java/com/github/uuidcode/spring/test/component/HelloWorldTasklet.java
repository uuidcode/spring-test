package com.github.uuidcode.spring.test.component;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.uuidcode.spring.test.CoreUtil;

@Component
@Scope("step")
public class HelloWorldTasklet implements Tasklet {
    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        CoreUtil.debug("HelloWorldTasklet execute");
        return RepeatStatus.FINISHED;
    }
}
