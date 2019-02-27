package top.zanghongmin.quartz.config;

import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class QuartzJobInit  {


	@Autowired
	Scheduler scheduler;

	@Bean
	public void init(){
		try {
            if(scheduler.isStarted()){
                scheduler.pauseAll();
                scheduler.clear();
                scheduler.shutdown(false);
            }
			scheduler.pauseAll();
            scheduler.clear();

			QuartzJobType[] quartzJobTypes = QuartzJobType.values();
			for(QuartzJobType quartzJobType:quartzJobTypes){
				JobDetail jobDetail = JobBuilder.newJob(quartzJobType.getJobclass()).withDescription(quartzJobType.getDescription()).withIdentity(quartzJobType.name()+"JobDetail").build();
				CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(quartzJobType.getCron());
				Trigger Trigger = TriggerBuilder.newTrigger().forJob(jobDetail)
						.withIdentity(quartzJobType.name()+"Trigger").withSchedule(scheduleBuilder).build();
				scheduler.scheduleJob(jobDetail,Trigger);
			}
			scheduler.resumeAll();
		} catch (SchedulerException e) {
			throw new RuntimeException("初始化定时任务,设置任务异常：" + e.getMessage());
		}


	}
}
