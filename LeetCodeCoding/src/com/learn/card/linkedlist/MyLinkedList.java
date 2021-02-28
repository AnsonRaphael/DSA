package com.learn.card.linkedlist;

public class MyLinkedList {
	Node head;

	/** Initialize your data structure here. */
	public MyLinkedList() {
		// this.head=new Node();
	}

	/**
	 * Get the value of the index-th node in the linked list. If the index is
	 * invalid, return -1.
	 */
	public int get(int index) {
		Node result = head;
		if (result != null) {
			for (int i = 1; i <= index; i++) {
				if (result.next != null)
					result = result.next;
				else
					return -1;
			}
		} else
			return -1;
		return result.val;

	}

	/**
	 * Add a node of value val before the first element of the linked list. After
	 * the insertion, the new node will be the first node of the linked list.
	 */
	public void addAtHead(int val) {
		Node temp = new Node(val);
		temp.next = head;
		head = temp;

	}

	/** Append a node of value val to the last element of the linked list. */
	public void addAtTail(int val) {
		Node temp = new Node(val);
		Node nodeI = head;
		if (head != null) {
			while (nodeI.next != null) {
				nodeI = nodeI.next;
			}
			nodeI.next = temp;
		} else {
			head = temp;
		}

	}

	/**
	 * Add a node of value val before the index-th node in the linked list. If index
	 * equals to the length of linked list, the node will be appended to the end of
	 * linked list. If index is greater than the length, the node will not be
	 * inserted.
	 */
	public void addAtIndex(int index, int val) {
		Node temp = new Node(val);
		Node result = head;
		boolean add = true;
		if (index == 0) {
			addAtHead(val);
		} else {
			if (head != null) {
				for (int i = 1; i <= index - 1; i++) {
					if (result.next != null)
						result = result.next;
					else {
						add = false;
					}

				}
			}
			if (add) {
				Node prev = result;
				if (prev != null) {
					Node nex = result.next;
					prev.next = temp;
					temp.next = nex;
				}

			}
		}
	}

	/** Delete the index-th node in the linked list, if the index is valid. */
	public void deleteAtIndex(int index) {
		Node result = head;
		boolean sub = true;
		if (index == 0) {
			if (head != null) {
				head=head.next;
			}
		} else {
			if (head != null) {
				for (int i = 1; i <= index - 1; i++) {
					if (result.next != null)
						result = result.next;
					else {
						sub = false;
					}

				}
			}
			if (sub) {
				Node prev = result;
				if (prev != null) {
					Node del = result.next;
					if (del != null) {
						Node delnx = del.next;
						prev.next = delnx;
					} else {
						prev.next = null;
					}
				}
			}
		}
	}

	static class Node {
		int val;
		Node next;

		Node() {

		}

		Node(int val) {
			this.val = val;
		}
	}
}
