package com.example.thread;

import java.util.concurrent.Semaphore;

public class ReaderThread implements Runnable{

    private String resource ;

    private Semaphore readingSemaphore;

    public ReaderThread(String resource, Semaphore readingSemaphore) {
        this.resource = resource;
        this.readingSemaphore = readingSemaphore;
    }


    @Override
    public void run() {

        try {
            readingSemaphore.acquire();
            System.out.println(Thread.currentThread() + resource);
            Thread.sleep(10000);
            readingSemaphore.release();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
