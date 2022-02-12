package com.datastructureI;

public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode tmp=head;

        while (tmp!=null){

            if(tmp.next!=null&&tmp.val==tmp.next.val){
                tmp.next=tmp.next.next;

            }else {
                tmp = tmp.next;
            }
        }

        return head;
    }
}
