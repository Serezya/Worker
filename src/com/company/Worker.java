package com.company;

public class Worker {

    private final OnTaskDoneListener callback;
    private final OnTaskErrorListener errorCallback;

    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }

    @FunctionalInterface
    public interface OnTaskErrorListener {
        void onError(String result);
    }

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 1; i <= 32; i++) {
            callback.onDone("Task " + i + " is done");
        }
        errorCallback.onError("Task " + 33 + " is error");
        for (int i = 34; i <= 100; i++) {
            callback.onDone("Task " + i + " is done");
        }
    }
}
