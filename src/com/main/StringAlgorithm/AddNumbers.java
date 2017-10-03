/**
 * 
 */
package com.main.StringAlgorithm;

import com.main.stack.Node;

/**
 * @author amruta
 *
 */
public class AddNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AddNumbers num = new AddNumbers();
		Node p1 = new Node(2);
		Node p11 = new Node(4);
		Node p12 = new Node(3);
		p1.next = p11;
		p11.next = p12;
		
		Node p2 = new Node(5);
		Node p21 = new Node(6);
		Node p22 = new Node(4);
		p2.next = p21;
		p21.next = p22;
		
		num.printLists(p1);
		num.printLists(p2);
		
		num.printLists(num.addNumbers(p1, p2));
	}

	public void printLists(Node p1){
		System.out.print("\nList 1: ");
		Node temp = p1;
		while(temp!=null){
			System.out.print(temp.value + "->");
			temp = temp.next;
		}
	}
	
	
	public Node addNumbers(Node temp1, Node temp2){
		Node head = new Node(0);
		Node p3 = head;
		int carry = 0;
		Node p1 = temp1, p2 = temp2;
		
		while(p1!=null || p2!=null){
			if(p1!=null){
				carry+=p1.value;
				p1=p1.next;
			}
			if(p2!=null){
				carry+=p2.value;
				p2=p2.next;
			}
			p3.next = new Node(carry% 10);
			p3 = p3.next;
			carry /= 10;
		}
		
		return head.next;
	}
}
