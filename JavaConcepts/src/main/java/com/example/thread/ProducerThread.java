package com.example.thread;

public class ProducerThread implements  Runnable{

    private Resource resource;

    public ProducerThread(Resource resource){
        this.resource = resource;
    }

    @Override
    public void run() {
        int index = 1;
        while (index < 10){
            try {
                resource.putCounter(index);
                System.out.println("Put counter :" + index);
                index++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
