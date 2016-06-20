/**
 * 
 */
package com.main.datastructures;


/**
 * @author Amruta Kajrekar
 *
 */
public class SinglyLinkedList {

	private static Node head;
	private static Node tail;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
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
				System.out.println(temp.data);
				temp = temp.next;
			}
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
}
