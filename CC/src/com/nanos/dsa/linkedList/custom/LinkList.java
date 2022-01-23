package com.nanos.dsa.linkedList.custom;

public class LinkList {
    Node head;
    Node tail;
    int size;

    private class Node{
        int val;
        Node next;

        Node(int value){
            val=value;
        }
        Node(int value,Node next){
           val=value;
           this.next=next;
        }
    }

    public void addFirst(int val){
        Node temp= new Node(val);
        if(head==null){
            head=temp;
            tail=head;
        }else{
            temp.next=head;
            head=temp;
        }
        size++;
    }
    public void addLast(int val){
        Node temp= new Node(val);
        if(tail==null){
            addFirst(val);
        }else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }
    public void insert(int val,int index){
        if(index==0)
            addFirst(val);
        if(index==size)
            addLast(val);

        Node tm= head;
        for (int i = 0; i < index-1; i++) {
            tm=tm.next;
        }
        Node tmp=new Node(val);
        tmp.next=tm.next;
        tm.next=tmp;
        size++;
    }
    public void insertRec(int val,int index){
     head=insertRecVal(val,index,head);
    }

    private Node insertRecVal(int val,int index,Node head){
        if(index==0){
            Node tm= new Node(val);
            tm.next=head;
            size++;
            return tm;
        }
        head.next=insertRecVal(val,index-1,head.next);
        return head;
    }

    // *************************************************************************
    //Delete
    //************************************************

    public int deleteFirst(){
        int val=head.val;
        head=head.next;
        if(head==null){
            tail=head;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val= tail.val;
        tail=secondLast;
        secondLast.next=null;
        size--;
        return val;
    }
    public int delete(int index){
        if(index==0)
            deleteFirst();
        if(index==size)
            deleteLast();
        Node pre=get(index-1);
        int val= pre.next.val;
        pre.next=pre.next.next;
        size--;
        return val;
    }
    public Node find(int value) {
        Node tmp= head;
        while (tmp!=null){
            if(tmp.val==value)
                return tmp;
            tmp=tmp.next;
        }
        return null;
    }

    public Node get(int index){
        Node tm= head;
        for (int i = 0; i < index; i++) {
            tm=tm.next;
        }
        return tm;
    }

    public void deleteDuplicates() {
        Node tmp=head;

        while (tmp!=null){

            if(tmp.val==tmp.next.val){
                tmp.next=tmp.next.next;
                size--;
            }else {
                tmp = tmp.next;
            }
        }
        tail=tmp;
        tail.next=null;

    }

    public void display(){
        Node tmp = head;
        while (tmp!=null){
            System.out.print(tmp.val+" -> ");
            tmp=tmp.next;
        }
        System.out.print(" END  \n");
    }



}
