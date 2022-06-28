package com.example.thread;

public class ProduceConsumerDriver {

    public static void main(String[] args) throws InterruptedException {
        Resource resource = new Resource();
        ConsumerThread consumerThread = new ConsumerThread(resource);
        ProducerThread producerThread = new ProducerThread(resource);
        Thread.sleep(30);
        Thread t1 =new Thread(consumerThread);
        Thread t2 = new Thread(producerThread);
        t1.start();
        t2.start();

    }
}
