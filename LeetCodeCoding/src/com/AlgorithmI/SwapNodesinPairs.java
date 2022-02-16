package com.AlgorithmI;

import java.util.Stack;

public class SwapNodesinPairs {
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
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);
        ListNode node9 = new ListNode(9);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        node6.next=node7;
        node7.next=node8;
        //node8.next=node9;
        display(node1);
        ListNode hl=swapPairs(node1);
        display(hl);
    }
    public static ListNode swapPairs(ListNode head) {
        // ListNode temp =head;
        if(head==null||head.next==null)
            return head;
        ListNode temp =head.next;
        ListNode curr=head.next;
        ListNode prev= head;
        while (true){
            ListNode next=curr.next;
            curr.next=prev;

            // If next NULL or next is the last node
            if (next == null || next.next == null) {
                prev.next = next;
                break;
            }
            prev.next=next.next;

            prev=next;
            curr=prev.next;

        }

        return temp;
    }


    public static ListNode swapPairs1(ListNode head) {
        ListNode temp =head;
        ListNode tempSt =head;
        if(head==null||head.next==null)
            return head;
        Stack<ListNode> stack = new Stack<>();
        while (tempSt!=null){
            stack.push(tempSt);
            tempSt=tempSt.next;
        }
        ListNode prev=null;
        if(stack.size()%2!=0){
            prev=stack.pop();
        }
        ListNode curr=null;
        ListNode next= null;
        while (!stack.isEmpty()){
            curr=stack.pop();
            next= stack.pop();
            next.next=prev;
            curr.next=next;
            prev=curr;
        }


        return curr;
    }
    public static void display(ListNode head){
          System.out.println("----------------------------------");
          while (head!=null){
              System.out.print(head.val+" -> ");
              head=head.next;
          }
        System.out.println("\n----------------------------------");
    }
}
