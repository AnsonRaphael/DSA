package com.nanos.dsa.linkedList;

public class MergeTwoSortedLists {
     public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head=new ListNode();
        ListNode tmp=head;

        while (list1!=null&&list2!=null){
            if(list1.val>list2.val){
                tmp.next=list2;
               list2=list2.next;
            }else {
                tmp.next=list1;
                list1=list1.next;
            }
            tmp=tmp.next;
        }
        while (list1!=null){
            tmp.next=list1;
            list1=list1.next;
            tmp=tmp.next;
        }
        while (list2!=null){
            tmp.next=list2;
            list2=list2.next;
            tmp=tmp.next;
        }
        head=head.next;
        return head;
    }
}
