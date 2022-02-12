package com.datastructureI;
  class ListNode {     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newList = new ListNode();
        ListNode tmp=newList;
        while (list1!=null&&list2!=null){
            if(list1.val<list2.val){
                ListNode ml= new ListNode(list1.val);
                tmp.next=ml;
                tmp=ml;
                list1=list1.next;
            }else {
                ListNode ml= new ListNode(list2.val);
                tmp.next=ml;
                tmp=ml;
                list2=list2.next;
            }
        }


        while (list1!=null){
                ListNode ml= new ListNode(list1.val);
                tmp.next=ml;
                tmp=ml;
                list1=list1.next;
        }

        while (list2!=null){

                ListNode ml= new ListNode(list2.val);
                tmp.next=ml;
                tmp=ml;
                list2=list2.next;

        }

        return newList.next;
    }
  }
