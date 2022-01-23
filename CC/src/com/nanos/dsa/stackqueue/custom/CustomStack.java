package com.nanos.dsa.stackqueue.custom;

public class CustomStack {
    protected int[] val;
    private static final int DEFAULT_SIZE=10;

    private int ptr=-1;

    public CustomStack(){
        val=new int[DEFAULT_SIZE];
    }
    public CustomStack(int size){
        val=new int[size];
    }

    public void push(int val) throws StackException {
        if(isFull()){
            throw new StackException("Stack is full");
        }
        ptr++;
        this.val[ptr]=val;

    }

    public int pop() throws StackException {
        if(isEmpty()){
            throw new StackException("Stack is empty");
        }
        int value=this.val[ptr];
        ptr--;
        return value;
    }

    public boolean isFull() {
        if(ptr==val.length-1){
           return true;
        }
        return false;
    }
    public boolean isEmpty() {
        if(ptr==-1){
            return true;
        }
        return false;
    }
}
