package com.example.thread;

import java.util.concurrent.Semaphore;

public class ReaderThreadDemo {

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(1);

        ReaderThread readerThread = new ReaderThread("Hello", semaphore);
        new Thread(readerThread).start();
        new Thread(readerThread).start();
        new Thread(readerThread).start();
        new Thread(readerThread).start();

    }
}
