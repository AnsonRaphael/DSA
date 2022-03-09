package com.nanos.multi.threadCreation;

public class MultithreadingDemo extends Thread{

    public static void main(String[] args) {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            MultiThread object
                    = new MultiThread();
            object.start(); // use start that will call run method on a thread
        }
    }
}
// if extend class with thread, it cannot be extended further
class MultiThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
