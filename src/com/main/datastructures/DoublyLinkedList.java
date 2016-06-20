/**
 * 
 */
package com.main.datastructures;


/**
 * @author Amruta Kajrekar
 * Output is:
   _______________________
    Elements are:
	1 -> 2 -> 3 -> 4 -> 5 -> NULL
	Elements in reverse order are:
	5 -> 4 -> 3 -> 2 -> 1 -> NULL
	Node = 1skipped
	Found = 3
	Elements are:
	1 -> 2 -> 4 -> 5 -> NULL
	Elements in reverse order are:
	5 -> 4 -> 2 -> 1 -> NULL
 */
public class DoublyLinkedList {

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
		Node.printReverseList();
		Node.delete(3);
		Node.printList();
		Node.printReverseList();
	}

	static class Node {
		
		int data;
		Node next;
		Node prev;
		
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

		public static void printReverseList() {
			System.out.println("Elements in reverse order are:");
			Node temp = tail;
			while (temp.prev!= null){
				System.out.print(temp.data + " -> ");
				temp = temp.prev;
			}
			System.out.print(temp.data + " -> NULL");
		}

				 
		public static void insert(int i) {
			Node newNode = new Node(i);
			newNode.next = null;
			if(head == null){
				head = newNode;
				tail = newNode;
				newNode.prev = null;
			}else{
				tail.next = newNode;
				newNode.prev = tail; 
				tail = newNode;
			}
		}
		
		public static void delete(int i) {
			Node temp = head;

			System.out.println("");
			for (int j=1; j< i-1 ;j++){
				System.out.println("Node = " + temp.data + "skipped");
				temp =temp.next;
			}
			System.out.println("Found = " + temp.next.data);
			temp.next = temp.next.next;
			temp.next.prev = temp;
		}

	}
}
