package com.company;

public class Worker {
    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }

    private final OnTaskDoneListener callback;

    public interface OnTaskErrorListener {
        void onError(String result);
    }

    private final OnTaskErrorListener errorCallback;
    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback)
    {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 1; i <= 67; i++) {
            callback.onDone("Task " + i + " is done");
        }
    }
    public void onError(){
        for (int i = 68; i <= 100; i++) {
            errorCallback.onError("Task " + i + " is error");
        }
    }
}
