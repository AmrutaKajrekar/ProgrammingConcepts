/**
 * 
 */
package com.main.stack;

/**
 * @author amruta
 *
 */
public class Node {
	public Node next = null;
	public int value = 0;
	
	public Node(int val, Node nextLink){
		value = val;
		next = nextLink;
	}
	
	public Node(int val){
		value = val;
	}

}
