/**
 * 
 */
package com.main.stack;

import java.awt.print.Printable;

/**
 * @author amruta
 *
 */
public class ReorderList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		
		print(node1);
		
	}
	
	public static void print(Node node){
		System.out.println(node.value);
		if(null!=node.next){
			print(node.next);
		}
	}

}
