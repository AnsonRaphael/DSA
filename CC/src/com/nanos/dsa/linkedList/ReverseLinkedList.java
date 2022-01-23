package com.nanos.dsa.linkedList;

public class ReverseLinkedList {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode prev=null;
        ListNode cur=head;
        ListNode next=head.next;
        while (cur!=null){
            cur.next=prev;
            prev=cur;
            cur=next;
            if(next!=null)
                next=next.next;

        }
        head=cur;
        return head;
    }
}
