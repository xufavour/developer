package com.xufavour.developer.math.base.stack;

/**
 * @Author: favour
 */
public class ArrayStack {

    private String[] items;

    private int count;

    private int size;

    public ArrayStack(int size) {
        items = new String[size];
        this.size = size;
        this.count = 0;
    }

    public boolean push(String value) {
        if (count == size) {
            return false;
        }
        items[count] = value;
        count++;
        return true;
    }

    public String pop() {
        if (count == 0) return null;
        String tmp = items[count - 1];
        --count;
        return tmp;
    }
}
