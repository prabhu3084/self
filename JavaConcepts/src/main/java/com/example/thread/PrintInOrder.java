package com.example.thread;

public class PrintInOrder {

    private boolean first = false;


    private boolean second = false;


    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        synchronized (this) {
            printFirst.run();
            first = true;
            notifyAll();
        }


    }

    public void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.
        synchronized (this) {
            if (first) {
                wait();
            }
            printSecond.run();
            second = true;
            notifyAll();
        }

    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.

        synchronized (this) {
            if (first && second) {
                wait();
            }
            printThird.run();
            second = true;
            notifyAll();
        }

    }
}
