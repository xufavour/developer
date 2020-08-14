package com.xufavour.developer.java.cocurrent.threads;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import lombok.SneakyThrows;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: xuyangyang
 * @Date: 2020/6/9
 */
public class ThreadPoolExample {

    /**
     * public ThreadPoolExecutor(int corePoolSize,
     * int maximumPoolSize,
     * long keepAliveTime,
     * TimeUnit unit,
     * BlockingQueue<Runnable> workQueue,
     * ThreadFactory threadFactory,
     * RejectedExecutionHandler handler)
     *
     * @param args
     */

    static ThreadPoolExecutor threadPool;
    static Runnable runnable;
    public static void main(String[] args) throws InterruptedException {
        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder()
                .setNameFormat("demo-pool-%d").build();
         threadPool = new ThreadPoolExecutor(2, 3,
                60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2), namedThreadFactory);
        for (int i = 0; i < 20; i++) {
            int finalI = i;
            if(i > 4){
                Thread.sleep(1000 * 3);
            }
            runnable = new Runnable() {
                @SneakyThrows
                @Override
                public void run() {
                    threadPool.execute(runnable);

//                    if(finalI < 1){
                        System.out.println("休眠:"+ "任务:" + finalI+ " 线程Id" + Thread.currentThread().getId());
//                        Thread.sleep(1000 * 60 * 10);
//                    }else {
//                        System.out.println("任务:" + finalI+ " 线程Id" + Thread.currentThread().getId());
//                        Thread.sleep(500);
//                    }
                }
            };
            threadPool.execute(runnable);
        }
    }
}
