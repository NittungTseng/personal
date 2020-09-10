package com.eddy.personal.concurrency.aqs;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * FutureTask
 * 希望启动一个线程去做些事情的时候，而且还关注结果以及是否正常执行的情况下，可以使用
 */
@Slf4j
public class FutureTaskExample {

    public static void main(String[] args) throws Exception {

        //定义好一个任务
        FutureTask<String> futureTask = new FutureTask<String>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                log.info("do sth in Callable...");
                Thread.sleep(5000);  //sleep5秒钟
                return "Finished";
            }
        });
        //启动一个线程执行
        new Thread(futureTask).start();
        log.info("do sth in main");
        Thread.sleep(1000);
        //想用任务结果的时候调用即可
        String result = futureTask.get();  //获取线程的处理结果【如果线程没有执行完成的话，该方法会一直阻塞等待】
        log.info("result = {}",result);
    }
}
