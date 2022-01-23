package com.nanos.dsa.linkedList;

public class ReverseLinkedListII {
     public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        node6.next=null;
        ListNode head=reverseBetween(node1,2,4);
        display(head);

    }
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right)
            return head;

        ListNode current=head;
        ListNode prev=null;
        // shift left
        for (int i = 0;current!=null &&i < left-1; i++) {
            prev=current;
            current=current.next;
        }

        ListNode last=prev;
        ListNode next=current.next;
        ListNode newEnd=current;
        // reverse left - right
        for (int i = 0;current!=null && i < right-left+1; i++) {
            current.next=prev;
            prev=current;
            current=next;
            if(next!=null)
                next=next.next;
        }
        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = current;
        return head;

    }

    public static void display(ListNode head){
        ListNode tmp = head;
        while (tmp!=null){
            System.out.print(tmp.val+" -> ");
            tmp=tmp.next;
        }
        System.out.print(" END  \n");
    }
}
