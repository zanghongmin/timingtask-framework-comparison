package top.zanghongmin.elasticjob.config;

import com.dangdang.ddframe.job.executor.handler.JobExceptionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public final class DefaultJobExceptionHandler implements JobExceptionHandler {
    private final static Logger log = LoggerFactory.getLogger(DefaultJobExceptionHandler.class);

    @Override
    public void handleException(final String jobName, final Throwable cause) {
        log.error("保险任务 {} 调度异常！异常：",jobName,cause);
    }

}