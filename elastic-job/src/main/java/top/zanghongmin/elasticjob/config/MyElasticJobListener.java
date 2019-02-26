package top.zanghongmin.elasticjob.config;

import com.dangdang.ddframe.job.executor.ShardingContexts;
import com.dangdang.ddframe.job.lite.api.listener.ElasticJobListener;

public class MyElasticJobListener implements ElasticJobListener {

    @Override
    public void beforeJobExecuted(ShardingContexts shardingContexts) {
        // do something ...
        System.out.println("beforeJobExecuted" + shardingContexts.getJobName() + shardingContexts.getTaskId() + shardingContexts.getShardingTotalCount());
    }

    @Override
    public void afterJobExecuted(ShardingContexts shardingContexts) {
        // do something ...
        System.out.println("afterJobExecuted" + shardingContexts.getJobName() + shardingContexts.getTaskId() + shardingContexts.getShardingTotalCount());
    }
}