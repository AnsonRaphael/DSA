package com.nanos.dsa.linkedList;

public class PalindromeLinkedList {
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

        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(2);
        ListNode node6 = new ListNode(1);
        ListNode node7 = new ListNode(0);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        node6.next=node7;
        node7.next=null;
        display(node1);
        System.out.print(isPalindrome(node1));
    }


    public static boolean isPalindrome(ListNode head) {
        ListNode first =head;
        ListNode mid=mid(head);
        ListNode revmid=reverse(mid);


        while (first!=null&&revmid!=null){
            if(first.val!=revmid.val){
                break;
            }
            first=first.next;
            revmid=revmid.next;
        }
        reverse(revmid);

        return head == null || revmid == null;
    }
    public static ListNode reverse(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }

    public static ListNode mid (ListNode head){
        ListNode fast = head;
        ListNode slow=head;
       while (fast!=null&&fast.next!=null){
           fast=fast.next.next;
           slow=slow.next;
       }
       return slow;
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
