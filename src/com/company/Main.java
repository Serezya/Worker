package com.company;

public class Main {

    public static void main(String[] args) {
        Worker.OnTaskDoneListener listener = System.out::println;
        Worker.OnTaskErrorListener listen = System.out::println;

        Worker worker = new Worker(listener);
        Worker worker1 = new Worker(listen);

        worker.start();
        worker1.onError();
    }
}
