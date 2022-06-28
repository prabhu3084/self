package com.example.thread;

public class Resource {

    private int counter ;

    private  boolean binarySemaphore ;


    public int getCounter() throws InterruptedException {

        synchronized (this) {
            if (!binarySemaphore) {
                wait();
            }
            binarySemaphore = false;
            notify();
            return counter;
        }
    }

    public void putCounter(int counter)  throws InterruptedException{

            synchronized (this){
                if(binarySemaphore) {
                    wait();
                }
                this.counter =counter;
                binarySemaphore = true;
                notify();
            }
        }

}
