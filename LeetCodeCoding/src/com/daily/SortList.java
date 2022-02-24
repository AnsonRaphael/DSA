package com.daily;

public class SortList {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
        ListNode n1= new ListNode(4);
        ListNode n2= new ListNode(2);
        ListNode n3= new ListNode(1);
        ListNode n4= new ListNode(3);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        display(n1);
        ListNode ck=sortList(n1);
        display(ck);
    }

    public static ListNode sortList(ListNode head) {
        if(head==null||head.next==null)
            return head;

        ListNode mid= midNode(head);
        ListNode rh=mid.next;
        mid.next=null;
        ListNode left = sortList(head);
        ListNode right = sortList(rh);

        return merge(left,right);
    }

    private static ListNode merge(ListNode left, ListNode right) {
        ListNode ll=new ListNode(0);;
        ListNode newNode =ll;

        while (left!=null&&right!=null){
            if(left.val<right.val){
                newNode.next=left;
                left=left.next;
                newNode=newNode.next;
            }else {
                newNode.next=right;
                right=right.next;
                newNode=newNode.next;
            }
        }
        while (left!=null){
            newNode.next=left;
            left=left.next;
            newNode=newNode.next;
        }

        while (right!=null){
            newNode.next=right;
            right=right.next;
            newNode=newNode.next;
         }
       return ll.next;
    }


    public static ListNode midNode(ListNode node){
        ListNode slow=null;
        ListNode fast=node;
        while (fast!=null&&fast.next!=null){
            slow=slow==null?node:slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void display(ListNode node){
        System.out.println("-------------------------");
        while (node!=null){
            System.out.print(node.val+" -> ");
            node=node.next;
        }
        System.out.println("\n-------------------------");
    }
}
