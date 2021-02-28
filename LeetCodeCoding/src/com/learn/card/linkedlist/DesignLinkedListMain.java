package com.learn.card.linkedlist;

public class DesignLinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index=2,val=4;
		  MyLinkedList obj = new MyLinkedList();
		  int param_1 = obj.get(index);
		  obj.addAtHead(val);
		  obj.addAtTail(val);
		  obj.addAtIndex(index,val);
		  obj.deleteAtIndex(index);
		  
		  MyLinkedList myLinkedList = new MyLinkedList();
		  myLinkedList.addAtHead(1);
		  myLinkedList.addAtTail(3);
		  myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
		  System.out.println(myLinkedList.get(1));              // return 2
		  myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
		  System.out.println(myLinkedList.get(1));  
		  
		  //["MyLinkedList","addAtHead","deleteAtIndex","addAtHead","addAtHead","addAtHead","addAtHead","addAtHead","addAtTail","get","deleteAtIndex","deleteAtIndex"]
		 // [[],[2],[1],[2],[7],[3],[2],[5],[5],[5],[6],[4]]
				  MyLinkedList myLinkedList1 = new MyLinkedList();
		  myLinkedList1.addAtHead(2);
		  myLinkedList1.deleteAtIndex(1);
		  myLinkedList1.addAtHead(2);
		  myLinkedList1.addAtHead(7);
		  myLinkedList1.addAtHead(3);
		  myLinkedList1.addAtHead(2);
		  myLinkedList1.addAtHead(5);
		  myLinkedList1.addAtTail(5);
		  myLinkedList1.get(5);
		  myLinkedList1.deleteAtIndex(6);
		  myLinkedList1.deleteAtIndex(4);
		  
	}

}
