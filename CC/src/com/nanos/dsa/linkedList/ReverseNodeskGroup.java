package com.nanos.dsa.linkedList;

public class ReverseNodeskGroup {
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
        display(node1);
        ListNode head=  reverseKGroup(node1,4);
        display(head);
    }
    public static ListNode reverseKGroup(ListNode head, int k) {

          if(head==null)
              return head;
        ListNode prev=null;
        ListNode current = head;
        int length = getLength(head)/k;
        while (length>0) {
            ListNode last = prev;
            ListNode newEnd = current;
            ListNode next = current.next;

            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null)
                    next = next.next;
            }

            if (last != null)
                last.next = prev;
            else
                head = prev;

            newEnd.next = current;
            prev=newEnd;
            length--;
        }
        return head;

    }

    private static int getLength(ListNode head) {
          int length=0;
          while (head!=null){
              length++;
              head=head.next;
          }
          return length;
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
