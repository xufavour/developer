package com.xufavour.developer.math.base.queue;

/**
 * @Author: favour
 */
public class CycleArrayQueue {

    private Object[] items;

    private int capacity;
    private int head = 0;
    private int tail = 0;


    public CycleArrayQueue(int capacity) {
        this.items = new Object[capacity];
        this.capacity = capacity;
    }

    public boolean enqueue(String value) {
        if ((tail + 1) % capacity == head) return false;
        items[tail] = value;
        tail = (tail + 1) % capacity;
        return true;
    }

    /**
     * 循环列表 空队列和满队列时都 head == tail解决方法
     * 1：使用一个标记flag 2： 保留一个元素空间。也就是说，队列满时，数组中还有一个空闲单元
     *
     * @return
     */
    public Object dequeue() {
        if (head == tail) return null;
        Object tmp = items[head];
        head = (head + 1) % capacity;
        return tmp;
    }
}
