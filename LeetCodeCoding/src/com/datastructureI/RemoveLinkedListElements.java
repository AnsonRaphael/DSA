package com.datastructureI;

public class RemoveLinkedListElements {
static  class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
    public static ListNode removeElements(ListNode head, int val) {
        if(head==null)
            return head;

        ListNode lm=head;
        ListNode prv=null;
        while (lm!=null){
            if(lm.val==val){
                if(prv==null){
                    head=head.next;
                }else {
                    prv.next=lm.next;
                }
            }else {
                prv=lm;
            }
            lm=lm.next;
        }
        return head;
    }
}
