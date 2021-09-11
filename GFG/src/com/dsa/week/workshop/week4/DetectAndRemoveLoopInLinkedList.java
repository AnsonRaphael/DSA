package com.dsa.week.workshop.week4;

public class DetectAndRemoveLoopInLinkedList {

    public static void main(String[] args) {
        LinkedListImp llist = new LinkedListImp();

        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);
        System.out.println(" Before creating loop ");
        llist.printList();
        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head.next;
        if(llist.loop()!=null){
            System.out.println(" loop Exist");
        }else {
            System.out.println("No loop Exist");
        }
        System.out.println(" removing Loop if any ");
        llist.removeloop();
        if(llist.loop()!=null){
            System.out.println(" loop Exist");
        }else {
            System.out.println(" No loop Exist");
        }
        llist.printList();
    }
}
