package com.example.job;

import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import tw.com.webcomm.quartz.job.QuartzJobFactory;
import tw.com.webcomm.util.time.DateTimeUtils;

@Slf4j
public class ExampleXmlJob extends QuartzJobFactory {
    @Override
    protected void executeJob(JobExecutionContext jobExecutionContext) {
        log.info("{}執行, 當前的時間:{}", this.getClass(), DateTimeUtils.getDateNow());
    }
}
