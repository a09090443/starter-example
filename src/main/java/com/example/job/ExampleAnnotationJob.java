package com.example.job;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import tw.com.webcomm.util.time.DateTimeUtils;

@Slf4j
@Component
public class ExampleAnnotationJob {

    @Scheduled(cron = "0/20 * * * * ?")
    public void example() {
        log.info("{}執行, 當前的時間:{}", this.getClass(), DateTimeUtils.getDateNow());
    }
}
