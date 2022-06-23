package com.example.thread;

import java.util.concurrent.CountDownLatch;

public class LatchDemo {

    private CountDownLatch readLatch = new CountDownLatch(1);
    private CountDownLatch timeLatch = new CountDownLatch(5);



    class WorkerThread implements  Runnable{


        @Override
        public void run() {
            try {
                readLatch.await();
                System.out.println("All thread Reached");

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void allThread() throws InterruptedException {
        for(int i =1; i<5; i++){
           Thread t =  new Thread(new WorkerThread());
           t.start();

        }

        timeLatch.await();
    }

    public static void main(String[] args) {



    }
}
