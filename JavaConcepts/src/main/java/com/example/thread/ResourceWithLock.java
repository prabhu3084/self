package com.example.thread;

import java.util.concurrent.locks.ReentrantLock;

public class ResourceWithLock {

    private int index;

    private ReentrantLock reentrantLock = new ReentrantLock();


    public int get() {
        reentrantLock.lock();
        try {
            return index;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void put(int index ) {
        reentrantLock.lock();
        try {
            this.index = index;
        } finally {
            reentrantLock.unlock();
        }
    }
}
