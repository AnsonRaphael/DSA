package com.nanos.dsa.stackqueue.custom;

public class CustomQueue {
    int [] data;
    private static final int DEFAULT_SIZE=10;

    private int end=0;

    public CustomQueue(int size) {
        data = new int[size];
    }

    public CustomQueue() {
        data = new int[DEFAULT_SIZE];
    }

    public boolean isFull() {
        if(end==data.length){
            return true;
        }
        return false;
    }
    public boolean isEmpty() {
        if(end==0){
            return true;
        }
        return false;
    }
    public boolean  insert(int val)  {
        if(isFull()){
            return false;
        }

        this.data[end]=val;
        end++;
        return true;
    }

    public int remove() throws StackException {
        if(isEmpty()){
            throw new StackException("queue is empty");
        }
        int value=this.data[0];
        for (int i = 1; i < end; i++) {
            data[i-1]=data[i];
        }
        end--;
        return value;
    }
}
