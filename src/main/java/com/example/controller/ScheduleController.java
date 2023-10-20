package com.example.controller;

import org.quartz.Scheduler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tw.com.webcomm.quartz.controller.QuartzController;

@RestController
@RequestMapping("/job")
public class ScheduleController extends QuartzController {
    public ScheduleController(Scheduler scheduler) {
        super(scheduler);
    }
}
