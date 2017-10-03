/**
 * 
 */
package com.main.datastructures;


/**
 * @author Amruta Kajrekar
 *
 *  Output is:
    _______________________
	Elements are:
	0 -> 1 -> 2 -> 3 -> 4 -> NULL
	Node = 0skipped
	Node = 1skipped
	Found = 3
	Elements are:
	0 -> 1 -> 2 -> 4 -> NULL
 */
public class SinglyLinkedList {

	private static Node head;
	private static Node tail;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			Node.insert(i);
		}
		Node.printList();
		Node.delete(4);
		Node.printList();
	}

	static class Node {
		
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
		}

		
		public static void printList() {
			System.out.println("Elements are:");
			Node temp = head;
			while (temp!= null){
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
			System.out.println("NULL");
		}

				 
		public static void insert(int i) {
			Node newNode = new Node(i);
			newNode.next = null;
			if(head == null){
				head = newNode;
				tail = newNode;
			}else{
				tail.next = newNode;
				tail = newNode;
			}
		}
		
		public static void delete(int i) {
			Node temp = head;
			
			for (int j=1; j< i-1 ;j++){
				System.out.println("Node = " + temp.data + "skipped");
				temp =temp.next;
			}
			
			System.out.println("Found = " + temp.next.data);
			temp.next = temp.next.next;
		}

	}

	public static Node getHead() {
		return head;
	}

	public static Node getTail() {
		return tail;
	}
	
	public Node swapTwoNodes(){
		 Node temp = head;
		 while (temp != null && temp.next != null) {
			 
	            /* Swap the data */
	            int k = temp.data;
	            temp.data = temp.next.data;
	            temp.next.data = k;
	            temp = temp.next.next;
	         }
		 return head;
		 
	}

}
