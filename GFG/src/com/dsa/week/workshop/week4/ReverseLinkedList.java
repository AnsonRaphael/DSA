package com.dsa.week.workshop.week4;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedListImp llist = new LinkedListImp();

        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);
        System.out.println(" Before reversing loop ");
        llist.printList();
        llist.reverseList();
        System.out.println(" After reversing loop ");
        llist.printList();
    }
}
