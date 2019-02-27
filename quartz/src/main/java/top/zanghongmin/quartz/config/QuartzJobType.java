/**
 *
 */
package top.zanghongmin.quartz.config;

import top.zanghongmin.quartz.job.SampleJob1;
import top.zanghongmin.quartz.job.SampleJob2;

import java.util.HashMap;
import java.util.Map;

public enum QuartzJobType {
    SampleJob1(SampleJob1.class, "*/30 * * * * ? *", "SampleJob1定时任务"),
    SampleJob2(SampleJob2.class, "*/10 * * * * ? *", "SampleJob2定时任务");
    //SampleJob3(SampleJob2.class,"*/20 * * * * ? *","SampleJob3定时任务");

    private Class jobclass;
    private String cron;
    private String description;

    private QuartzJobType(Class jobclass, String cron, String description) {
        this.jobclass = jobclass;
        this.cron = cron;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getCron() {
        return cron;
    }

    public Class getJobclass() {
        return jobclass;
    }
}
