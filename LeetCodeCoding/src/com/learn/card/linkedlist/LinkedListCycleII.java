package com.learn.card.linkedlist;

public class LinkedListCycleII {

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
	
	  public ListNode detectCycle(ListNode head) {
	        if(head==null) {
	        	return null;
	        }
	        ListNode slow=head;
	        ListNode fast=head.next;
			return fast;
	        
	  
	        
	    }
}
