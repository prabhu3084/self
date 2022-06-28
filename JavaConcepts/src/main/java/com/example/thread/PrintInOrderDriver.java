package com.example.thread;

public class PrintInOrderDriver {

    public static void main(String[] args) throws InterruptedException {

        PrintInOrder printInOrder = new PrintInOrder();

        Runnable t1 = () -> {
            System.out.println("second");
        };

        Runnable t2 = () -> {
            System.out.println("second");
        };

        Runnable t3 = () -> {
            System.out.println("third");
        };


        new Thread(t2).start();
        new Thread(t3).start();
        new Thread(t1).start();


    }
}
