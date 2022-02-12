package com.datastructureI;

public class LinkedListCycle {
      class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public static boolean hasCycle(ListNode head) {
        if(head==null)
            return false;
        ListNode fast=head;

        ListNode slow =null;
        while (fast!=null&&fast.next!=null){
            if(fast==slow)
                return true;

            fast=fast.next.next;
            slow=slow==null?head:slow.next;
        }
        return false;
    }
}
