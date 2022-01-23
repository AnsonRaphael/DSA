package com.nanos.dsa.linkedList;

public class ReorderList {
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
        node4.next=null;
        //node5.next=null;
        //node6.next=null;
        display(node1);
        reorderList(node1);
        display(node1);
    }

    public static void reorderList(ListNode head) {
         ListNode node = mid(head);
        //System.out.print(node.val);
        ListNode ml=reverse(node);
        //display(ml);
        //System.out.print(ml.val);
        ListNode ml1= ml;
        ListNode head1= head;
        while (ml1!=null&&head1!=null){
            ListNode tmp = head1.next;
            head1.next=ml1;

            head1=tmp;
            ListNode tmp2=ml1.next;
            ml1.next=tmp;
            ml1=tmp2;
        }
        if (head1 != null) {
            head1.next = null;
        }
    }

    public static void display(ListNode head){
        ListNode tmp = head;
        while (tmp!=null){
            System.out.print(tmp.val+" -> ");
            tmp=tmp.next;
        }
        System.out.print(" END  \n");
    }
    public static ListNode mid(ListNode head){
        if(head==null||head.next==null)
            return head;
         ListNode slow=head;
         ListNode fast=head;

         while (fast!=null&&fast.next!=null){
             slow=slow.next;
             fast=fast.next.next;
         }
         return slow;
    }

    public static ListNode reverse(ListNode head) {
        if(head==null)
            return head;

        ListNode prev=null;
        ListNode current=head;
        ListNode next=current.next;
        ListNode last=prev;
        ListNode newEnd=current;
        while (current!=null){
            current.next=prev;
            prev=current;
            current=next;
            if(next!=null)
                next=next.next;

        }
        return prev;
    }
}
