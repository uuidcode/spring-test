package com.github.uuidcode.spring.test.component;

import java.util.Map;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.scope.context.StepContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.uuidcode.spring.test.CoreUtil;

@Component
@Scope("step")
public class HelloWorldTasklet implements Tasklet {
    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        CoreUtil.info("HelloWorldTasklet execute");
        StepContext stepContext = chunkContext.getStepContext();
        ExecutionContext executionContext = stepContext.getStepExecution().getExecutionContext();
        Map<String, Object> partitionPlan = stepContext.getPartitionPlan();
        Map<String, Object> jobExecutionContext = stepContext.getJobExecutionContext();
        Map<String, Object> stepExecutionContext = stepContext.getStepExecutionContext();
        CoreUtil.info("jobExecutionContext", jobExecutionContext);
        CoreUtil.info("stepExecutionContext", stepExecutionContext);
        CoreUtil.info("partitionPlan", partitionPlan);
        CoreUtil.info("executionContext", executionContext);

        return RepeatStatus.FINISHED;
    }
}
