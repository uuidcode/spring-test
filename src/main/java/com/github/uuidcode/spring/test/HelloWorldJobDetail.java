package com.github.uuidcode.spring.test;

import java.util.Map;
import java.util.UUID;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.configuration.JobRegistry;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class HelloWorldJobDetail extends QuartzJobBean {
    protected static Logger logger = LoggerFactory.getLogger(HelloWorldJobDetail.class);

    private JobLauncher jobLauncher;
    private JobRegistry jobRegistry;

    public JobRegistry getJobRegistry() {
        return this.jobRegistry;
    }

    public HelloWorldJobDetail setJobRegistry(JobRegistry jobRegistry) {
        this.jobRegistry = jobRegistry;
        return this;
    }

    public JobLauncher getJobLauncher() {
        return this.jobLauncher;
    }

    public HelloWorldJobDetail setJobLauncher(JobLauncher jobLauncher) {
        this.jobLauncher = jobLauncher;
        return this;
    }

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        CoreUtil.debug("HelloWorldJobDetail executeInternal");

        Map<String, Object> jobDataMap = context.getMergedJobDataMap();
        String jobName = (String) jobDataMap.get("jobName");
        JobParameters jobParameters = this.createJobParameter(jobDataMap);

        try {
            jobLauncher.run(this.jobRegistry.getJob(jobName), jobParameters);
        } catch (Throwable t) {
            if (logger.isErrorEnabled()) {
                logger.error(">>> HelloWorldJobDetail executeInternal error", t);
            }
        }
    }

    private JobParameters createJobParameter(Map<String, Object> jobDataMap) {
        JobParametersBuilder parameterBuilder = new JobParametersBuilder();

        for(String key : jobDataMap.keySet()) {
            parameterBuilder.addString(key, jobDataMap.get(key).toString());
        }

        return parameterBuilder.toJobParameters();
    }
}
