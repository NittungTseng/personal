package com.eddy.personal.concurrency.aqs;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Slf4j
public class FutureExample {

    //首先定义一个Callable的任务,返回类型为String
    static class myCallable implements Callable<String>{

        @Override
        public String call() throws Exception {
            log.info("do sth in Callable...");
            Thread.sleep(5000);  //sleep5秒钟
            return "Finished";
        }
    }

    public static void main(String[] args) throws Exception {
        //接下来声明一个线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<String> stringFuture = executorService.submit(new myCallable());
        log.info("do sth in main");
        Thread.sleep(1000);
        String result = stringFuture.get();  //获取线程的处理结果【如果线程没有执行完成的话，该方法会一直阻塞等待】
        log.info("result = {}",result);

    }
}
