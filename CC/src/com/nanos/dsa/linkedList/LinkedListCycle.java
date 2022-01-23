package com.nanos.dsa.linkedList;

public class LinkedListCycle {
     class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public boolean hasCycle(ListNode head) {

        ListNode fast=head;
        ListNode slow=null;
        while (fast!=null&&fast.next!=null){
            if(slow==fast){
                return true;
            }
            slow=slow==null?head:slow.next;
            fast=fast.next.next;
        }

         return false;
    }
}
