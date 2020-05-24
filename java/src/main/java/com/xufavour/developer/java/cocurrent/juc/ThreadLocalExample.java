package com.xufavour.developer.java.cocurrent.juc;

/**
 * @author favour
 */
public class ThreadLocalExample {

    /**
     * 使得对变量读写线程隔离，一种将可变数据通过每个线程有自己的独立副本从而实现线程封闭的机制，保证了各个线程的数据互不干扰。
     * 使用的时候需要注意：
     *
     * 内存泄漏问题
     * Thread --> ThreadLocalMap --> Entry --> Value
     * ThreadLocal thLocal
     * WeakReference 弱引用， 当一个对象仅仅被weak reference（弱引用）指向, 而没有任何其他strong reference（强引用）指向的时候, 如果这时GC运行,
     * 那么这个对象就会被回收，不论当前的内存空间是否足够，这个对象都会被回收。
     */


}
