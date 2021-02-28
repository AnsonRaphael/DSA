package com.learn.card.linkedlist;

public class LinkedListCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		         val = x;
		          next = null;
		      }
		  }
	
	 public boolean hasCycle(ListNode head) {
		 if(head==null)
			 return false;
		 
		 ListNode slow=head;
		 ListNode fast=head.next;
		 
		 while(slow!=fast) {
			 if(fast==null||fast.next==null) {
				 return false;
			 }
			 slow=slow.next;
			 fast=fast.next.next;
		 }
		 
		 
		 return true;
	        
	    }
}
