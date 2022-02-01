package com.nanos.dsa.stackqueue;

public class DesignStackWithIncrementOperation {
    class CustomStack {

        private int[] data;
        private int pos=-1;
        public CustomStack(int maxSize) {
                data=new int[maxSize];
        }

        public void push(int x) {
            if(isFull()){
                return;
            }else {
                data[++pos]=x;
            }
        }

        public int pop() {
            if(isEmpty()){
                return -1;
            }else {
                int val=data[pos];
                data[pos]=0;
                pos--;
                return val;
            }
        }
        public boolean isEmpty(){
            if(pos<0)
                return true;
            return false;
        }
        public boolean isFull(){
            if(pos>=data.length-1)
                return true;
            return false;
        }
        public void increment(int k, int val) {
            if(k>data.length)
                k=pos;
            if(pos<k)
                k=pos+1;
            for (int i = 0; i < k; i++) {
                data[i]+=val;
            }
        }
    }
}
