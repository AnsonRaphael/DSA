package com.AlgorithmI;

public class RemoveNthNodeFromEndofList {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=lengthLinked(head);
        ListNode temp=head;
        int k=size-n;
        if(k==0){
            if(temp==head)
                head=head.next;
        }else{
            for(int i=0;i<k-1;i++){
                temp=temp.next;
            }
            if(temp!=null)
                if(temp.next!=null)
                    temp.next=temp.next.next;
        }

        return head;
    }
    public static int lengthLinked(ListNode head){
        int n=0;
        while(head!=null){
            n++;
            head=head.next;
        }
        return n;
    }
}
