package com.daily;

public class SwappingNodesLinkedList {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static void main(String[] args) {

    }
    public static ListNode swapNodes(ListNode head, int k) {
        int size=size(head);
        if(k>size)
            return head;
        int one=k-1,j=0;
        int two=size-k;
        if(one==two)
            return head;
        if(one>two){
            int t=one;
            one=two;
            two=t;
        }
        ListNode node=head;
        int val=0;

        ListNode ref=null;
        while (node!=null){
            if(j==one){
                ref=node;
            }
            if(j==two){
                val=node.val;
                node.val= ref.val;
                ref.val=val;
            }
            j++;
            node=node.next;
        }
        return head;
    }

    public static int size(ListNode node){
        ListNode head=node;
        int i=0;
        while (head!=null){
            i++;
            head=head.next;
        }
        return i;
    }
}
