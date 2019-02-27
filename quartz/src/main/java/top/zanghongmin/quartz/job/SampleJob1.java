package top.zanghongmin.quartz.job;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;


@DisallowConcurrentExecution
public class SampleJob1 extends QuartzJobBean {

    @Autowired
    TestService testService;

    @Override
    protected void executeInternal(JobExecutionContext context)
            throws JobExecutionException {
        testService.Test("SampleJob1");
    }

}
