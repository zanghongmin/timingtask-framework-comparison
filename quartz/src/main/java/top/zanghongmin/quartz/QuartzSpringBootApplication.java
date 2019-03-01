package top.zanghongmin.quartz;

import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import top.zanghongmin.quartz.job.SampleJob1;
import top.zanghongmin.quartz.job.SampleJob2;

@SpringBootApplication()
public class QuartzSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuartzSpringBootApplication.class, args);
    }
}

