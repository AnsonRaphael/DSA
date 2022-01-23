package com.nanos.dsa.stackqueue.custom;

public class MainQueue {
    public static void main(String[] args) throws StackException {
        CustomQueue queue = new CustomQueue();

        queue.insert(10);
        queue.insert(11);
        queue.insert(12);
        queue.insert(13);
        queue.insert(14);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
