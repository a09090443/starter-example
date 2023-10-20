package com.example.job;

import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import tw.com.webcomm.quartz.job.QuartzJobFactory;
import tw.com.webcomm.util.time.DateTimeUtils;

import java.util.Map;

@Slf4j
public class ExampleDbJob extends QuartzJobFactory {
    @Override
    protected void executeJob(JobExecutionContext jobExecutionContext) {
        Map<String, Object> jobMap = jobExecutionContext.getJobDetail().getJobDataMap();
        log.info("{}執行, 當前的時間:{}", this.getClass(), DateTimeUtils.getDateNow());
        jobMap.forEach(
                (k, v) -> {
                    log.info("參數名稱{}, 參數內容{}", k, v);
                }
        );
    }
}
