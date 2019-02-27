package top.zanghongmin.quartz.job;

import org.springframework.stereotype.Service;

@Service
public class TestService {


    public void Test(String name){


        System.out.println(Thread.currentThread().getId() +"  TestService : " + name + " " + System.currentTimeMillis());
    }
}
