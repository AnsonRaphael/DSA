package com.nanos.dsa.linkedList;

public class LinkedListCycleII {
    static   class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(4);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node2;
        detectCycle(node1);

    }
    public static ListNode detectCycle(ListNode head) {

          // find length


        ListNode fast=head;
        ListNode slow=null;
        int length=0;
        while (fast!=null&&fast.next!=null){
            if(slow==fast){
                do {
                    slow=slow.next;
                    if(slow==fast){
                        break;
                    }
                    length++;
                }while (slow!=fast);
                break;
            }
            slow=slow==null?head:slow.next;
            fast=fast.next.next;
        }
        if(fast==null||fast.next==null)
            return null;
        // pos s at length from head
        ListNode f=head;
        ListNode s=head;
        while (length>=0){
            s=s.next;
            length--;
        }

        // loop until f from head and s become same and return s
        while (f!=s){
            f=f.next;
            s=s.next;
        }
          return s;
    }
}
