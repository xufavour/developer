package com.xufavour.developer.java.cocurrent.threads;

import lombok.SneakyThrows;

import java.util.concurrent.locks.LockSupport;

/**
 * @Author: xuyangyang
 * @Date: 2020/6/28
 */
public class ThreadWaitCase {

    /**
     * 1. sleep 调用线程处于 TIMED_WAITING
     * 2. wait 配合Synchronized
     * 3. LockSupport 其实内部调用了UnSafe 的park unPark的本地方法
     *    调用后 park()对应 WAITING parkNanos() 对应 TIMED_WAITING。
     * 4. Thread.yield();使当前线程释放cpu,重新进入就绪状态,此时仍可以与其他线程一起争cpu,故有可能再次拿到cpu。
     */
    public static void main(String[] args) throws InterruptedException {

        WaitCase waitCase = new WaitCase();
        Thread th1 = new Thread(waitCase);
        Thread th2 = new Thread(waitCase);
        th1.start();
        th2.start();
        for(;;){
            Thread.sleep(500);
            System.out.println(th2.getState());
        }

    }

    /**
     *   Thread对象的native实现里有一个成员代表线程的中断状态，我们可以认为它是一个bool型的变量。初始为false。
     *   Thread对象的native实现里有一个成员代表线程是否可以阻塞的许可permit，我们可以认为它是一个int型的变量，但它的值只能为0或1。当为1时，再累加也会维持1。初始为0。
     *
     */





    static class SleepCase implements Runnable{

        @Override
        public void run() {
            System.out.println("--- Sleep start ---");
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("--- Sleep end ---");
            System.out.println("--- LockSupport start ---");
            long supportStart = System.currentTimeMillis();
            LockSupport.park();
            System.out.println("--- LockSupport end --- time : " + (System.currentTimeMillis() - supportStart));
        }
    }

    static class LockSupportCase implements Runnable{
        @Override
        public void run() {
            System.out.println("--- LockSupport start ---");
            long supportStart = System.currentTimeMillis();
            LockSupport.park();
            System.out.println("interrupt: " + Thread.currentThread().isInterrupted());
            System.out.println("--- LockSupport end --- time : " + (System.currentTimeMillis() - supportStart));
        }
    }

    static class WaitCase implements Runnable{
        @SneakyThrows
        @Override
        public void run() {
            System.out.println(Thread.currentThread() + "--- Wait start ---");
            long start = System.currentTimeMillis();
            synchronized (this){
                Thread.sleep(5000);
                this.wait(10000);
            }
            System.out.println(Thread.currentThread() + "--- Wait end --- time : " + (System.currentTimeMillis() - start));
        }
    }

}
