package com.nanos.dsa.stackqueue.custom;

public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack();

        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        //------------------------------------------------
        DynamicStack stackD = new DynamicStack(3);

        stackD.push(10);
        stackD.push(11);
        stackD.push(12);
        stackD.push(13);
        stackD.push(14);
        System.out.println(stackD.pop());
        System.out.println(stackD.pop());
    }
}
