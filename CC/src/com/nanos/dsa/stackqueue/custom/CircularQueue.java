package com.nanos.dsa.stackqueue.custom;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public CircularQueue() {
        data=new int[DEFAULT_SIZE];
    }
    public CircularQueue(int size) {
        data=new int[size];
    }


    public boolean isFull() {
        return size==data.length;
    }
    public boolean isEmpty() {
        return size==0;
    }


    public boolean insert(int item) {
        if(isFull()){
            return false;
        }
        data[end++]=item;
        end=end% data.length;
        size++;
        return true;
    }
    public int remove() throws Exception {
        if(isEmpty()){
            throw new Exception("queue empty");
        }
        int val=data[front++];
        front=front% data.length;
        size--;
        return val;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        } while (i != end);
        System.out.println("END");
    }
}
