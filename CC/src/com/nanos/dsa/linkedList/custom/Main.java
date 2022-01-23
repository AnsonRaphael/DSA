package com.nanos.dsa.linkedList.custom;

public class Main {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.addFirst(1);
        list.addFirst(3);
        list.addFirst(6);
        list.addFirst(7);
        list.addFirst(9);
        list.addLast(0);
        list.display();
        list.insert(5,3);
        list.display();
        list.insertRec(4,4);
        list.display();
    }
}
