package com.example.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTaskDemo {

    private FutureTask<Boolean> futureTask;

    public FutureTaskDemo() {
        futureTask = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                return true;
            }
        });

    }

    public Boolean getResult() {

        futureTask.run();

        try {
            return futureTask.get();
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


    public static void main(String args[]) {

        FutureTaskDemo futureTaskDemo = new FutureTaskDemo();

        Thread thread = new Thread(() -> {

            System.out.println( futureTaskDemo.getResult());
        }
        );

        thread.start();

    }

}