package com.example.thread;

public class ConsumerThread implements  Runnable{

    private Resource resource;

    public  ConsumerThread(final Resource resource){
        this.resource = resource;

    }

    @Override
    public void run() {
        while (true)
            try {
                System.out.println("Got counter :" + resource.getCounter());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }
}
