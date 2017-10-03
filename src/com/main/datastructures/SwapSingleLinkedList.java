package com.main.datastructures;

import com.main.datastructures.SinglyLinkedList;
import com.main.datastructures.SinglyLinkedList.Node;

public class SwapSingleLinkedList {
	
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		Node.insert(5);
		Node.insert(13);
		Node.insert(15);
		Node.insert(18);
		Node.insert(20);
		Node.insert(11);
		Node.insert(6);
		Node.insert(7);
		
		Node.printList();
		Node head = list.swapTwoNodes();
		while (head!= null){
			System.out.print(head.data + " -> ");
			head = head.next;
		}
		System.out.print("NULL");
	}


	
}
