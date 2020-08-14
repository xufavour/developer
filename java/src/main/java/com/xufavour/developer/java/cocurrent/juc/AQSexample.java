package com.xufavour.developer.java.cocurrent.juc;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: xuyangyang
 * @Date: 2020/6/17
 */
public class AQSexample {

    /**
     * AbstractQueuedSynchronizer 队列同步器
     *
     */

    public static void main(String[] args) {
        Class<AbstractQueuedSynchronizer> abstractQueuedSynchronizerClass = AbstractQueuedSynchronizer.class;

        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        try{

        }finally {
            lock.unlock();
        }
    }
}
