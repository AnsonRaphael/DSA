package com.daily;

public class RemoveDuplicatesfromSortedListII {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=new ListNode();
        temp.next=head;

        if(head==null||head.next==null)
            return head;

        ListNode cur=head;
        ListNode pre=temp;
        while (cur!=null){

            if(cur.next!=null&&cur.val==cur.next.val){
                while (cur.next!=null&&cur.val==cur.next.val){
                    cur=cur.next;
                }
                pre.next=cur.next;
            }else {
                pre=cur;
            }
            cur=cur.next;

        }

        return temp.next;
    }
}
