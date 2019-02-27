>quartz

   
1.  [官网地址](http://www.quartz-scheduler.org/)  和  [Springboot集成样例](https://github.com/spring-projects/spring-boot/tree/v2.1.3.RELEASE/spring-boot-samples/spring-boot-sample-quartz)

2. 核心概念

    ```
    Job 表示一个工作，要执行的具体内容。此接口中只有一个方法
    JobDetail 表示一个具体的可执行的调度程序，Job 是这个可执行程调度程序所要执行的内容，另外 JobDetail 还包含了这个任务调度的方案和策略。
    Trigger 代表一个调度参数的配置，什么时候去调。
    Scheduler 代表一个调度容器，一个调度容器中可以注册多个 JobDetail 和 Trigger。当 Trigger 与 JobDetail 组合，就可以被 Scheduler 容器调度了。 
    ```
3. 关键代码说明(Springboot)
   ```
   *  springboot集成了quartz
      pom文件：spring-boot-starter-quartz
      配置：spring.quartz.properties等
   *  任务记录持久化到数据库
      在quartz源代码中有tables_mysql_innodb.sql，在数据库中运行该文件      
      配置：spring.quartz.job-store-type=jdbc
   *  自定义简化代码部分
      类QuartzJobInit，进行遍历当前所有job进行初始化
   *  集群、失效转移
      配置集群：spring.quartz.properties.org.quartz.jobStore.isClustered=true
      配置失效转移：spring.quartz.properties.org.quartz.jobStore.misfireThreshold: 6000   
   *  测试开启多台实例时
      一个任务在触发点只运行一次
      停止一台机器，另一台运行所有任务
      多台机器正常运行所有任务
   ```
    

