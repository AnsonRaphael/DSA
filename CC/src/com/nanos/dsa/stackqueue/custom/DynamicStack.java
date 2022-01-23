package com.nanos.dsa.stackqueue.custom;

public class DynamicStack extends CustomStack{
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public void push(int val) throws StackException {
        if(isFull()){
            extendSize();
        }
        super.push(val);
    }

    private void extendSize() {
        int[] temp = new int[this.val.length*2];
        for (int i = 0; i < val.length; i++) {
            temp[i]=val[i];
        }
        val=temp;
    }
}
