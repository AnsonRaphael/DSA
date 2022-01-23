package com.nanos.dsa.stackqueue.custom;

public class DynamicQueue extends CustomQueue{
    public DynamicQueue() {
        super();
    }
    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int val) {
        if(isFull()){
            int[] temp=new int[data.length*2];
            for (int i = 0; i < data.length; i++) {
                temp[i]=data[i];
            }
            data=temp;
        }

        return super.insert(val);
    }
}
