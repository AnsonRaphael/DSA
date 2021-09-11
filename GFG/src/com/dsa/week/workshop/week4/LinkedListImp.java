package com.dsa.week.workshop.week4;

import java.util.HashSet;

public class LinkedListImp {
    Node head;

    class Node{
        int data;
        Node next;
        Node(int a){
            data=a;
            next=null;
        }
    }
    public void printList(){
        Node n=head;
        while (n!=null){
            System.out.println(n.data+" ");
            n=n.next;
        }
    }
    // push data
    public void push(int nval){
        Node n= new Node(nval);
        n.next=head;
        head=n;
    }

    // detect loop through hashset
    public Node loop(){
        HashSet<Node> visited=new HashSet<>();
        Node n= head;
        while (n!=null){
            if(n.next!=null&&visited.contains(n.next)){
                return n;
            }
            visited.add(n);
            n=n.next;
        }
        return null;
    }
    // remove loop
    public void removeloop(){
        Node m=loop();
        if(m!=null){
            m.next=null;
        }
    }

    // reversing list
    public void reverseList(){
        Node prev=null,curr=head,nex=head.next;
        while (curr!=null){
            nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
        }
        head=prev;
    }
}
