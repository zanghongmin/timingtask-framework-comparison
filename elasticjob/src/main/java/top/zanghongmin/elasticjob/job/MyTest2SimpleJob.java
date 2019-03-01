package top.zanghongmin.elasticjob.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

public class MyTest2SimpleJob implements SimpleJob {
    @Override
    public void execute(ShardingContext shardingContext) {

        System.out.println(String.format("MyTest2SimpleJob------Thread ID: %s, 任务总片数: %s, 当前分片项: %s",
                Thread.currentThread().getId(),shardingContext.getShardingTotalCount(), shardingContext.getShardingItem()));

    }

}
