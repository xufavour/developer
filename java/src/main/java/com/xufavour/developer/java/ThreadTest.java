package com.xufavour.developer.java;

import net.sf.ehcache.util.NamedThreadFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @Author: xyy
 */
public class ThreadTest {

    public static ThreadPoolExecutor threadPoolExecutor;


    static {
        int coreNum = Runtime.getRuntime().availableProcessors();
        //饱和策略选择 线程池队列满时，由当前提交线程去执行
        ThreadPoolExecutor.CallerRunsPolicy callerRunsPolicy = new ThreadPoolExecutor.CallerRunsPolicy();
        threadPoolExecutor = new ThreadPoolExecutor(coreNum, coreNum, 0, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(200), new NamedThreadFactory("执行金融产品试算的线程"),
                callerRunsPolicy);
        //提前创建核心线程池
        threadPoolExecutor.prestartAllCoreThreads();
    }
    public static void main(String[] args) throws Exception {
        ThreadTest test = new ThreadTest();
        long l = System.currentTimeMillis();
        List<String> result = new ArrayList<>();
        Callable<String> stringCallable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return test.getA();
            }
        };
        Callable<String> stringCallable1 = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return test.getB();
            }
        };
        Callable<String> stringCallabl2 = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return test.getC();
            }
        };
        Future<String> submit = threadPoolExecutor.submit(stringCallable);
        Future<String> submit1 = threadPoolExecutor.submit(stringCallable1);
        Future<String> submit2 = threadPoolExecutor.submit(stringCallabl2);
        result.add(submit.get());
        result.add(submit1.get());
        result.add(submit2.get());
        for (String str:
             result) {
            System.out.println(str);
        }
        System.out.println(System.currentTimeMillis() - l);
    }


    public String getA() throws InterruptedException, ExecutionException {
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "test";
            }
        };
        Thread.sleep(1200);
        Future<String> submit = threadPoolExecutor.submit(callable);
        return submit.get();
    }
    public String getB() throws InterruptedException {
        Thread.sleep(1000);
        return "B";
    }

    public String getC() throws InterruptedException {
        Thread.sleep(3000);
        return "C";
    }
}
