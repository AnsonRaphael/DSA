package com.nanos.dsa.stackqueue;

public class MinStack {
    private class Node{
        int val;
        int min;
        Node next;
        public Node(){

        }
        public Node(int val,int min){
            this.val=val;
            this.min=min;
        }
        public Node(int val,int min,Node next){
            this.val=val;
            this.min=min;
            this.next=next;
        }
    }
    private Node head;

    public MinStack() {

    }

    public void push(int val) {
        if(head==null)
            head=new Node(val,Integer.MAX_VALUE);
        int minValue=Math.min(head.min,val);
        Node temp=new Node(val,minValue,head);
        head=temp;
    }

    public void pop() {
        if(head==null)
            return;
        head=head.next;
    }

    public int top() {
        if(head==null)
            return -1;
        return head.val;
    }

    public int getMin() {
        return head.min;
    }
}
