package com.xufavour.developer.java.cocurrent.juc;

import lombok.SneakyThrows;

import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author: xuyangyang
 * @Date: 2020/6/29
 */
public class LockExample {

    static ReentrantLock lock = new ReentrantLock();

    ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();


    /**
     * lock.lock() 只会记录中断，只有拿到锁时才会根据代码响应中断。
     * lock.lockInterruptibly(); 响应中断,等待过程中也响应中断
     *
     */

    public static void main(String[] args) throws InterruptedException {
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    System.out.println("th1 start");
                    Thread.sleep(30000);
                    System.out.println("th1 end");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        });

        Thread th2 = new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                lock.lockInterruptibly();
                try {
                    System.out.println("th2 start");
                    Thread.sleep(10000);
                    System.out.println("th2 end");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        });
        th1.start();
        th2.start();
        Thread.sleep(10000);
        th2.interrupt();


    }



}
