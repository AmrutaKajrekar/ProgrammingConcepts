/**
 * 
 */
package com.main.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author amruta
 *
 */
public class PreorderBST {
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		TreeNode node5 = new TreeNode(5);
		TreeNode node2 = new TreeNode(2);
		TreeNode node6 = new TreeNode(6);
		TreeNode node1 = new TreeNode(1);
		TreeNode node3 = new TreeNode(3);
		TreeNode node8 = new TreeNode(8);
		
		node5.left = node2;
		node5.right = node6;
		node2.left = node1;
		node3.right = node3;
		node6.right = node8;
		
		System.out.println("Preorder traversal: \n");
		PreorderBST preorder = new PreorderBST();
		list = preorder.preOrderTraversal(node5);
		
	}

	/**
	 * first push,
	 * while stack not empty -> pop and print 
	 * if right not null -> push right 
 	 * if left not null -> push left
	 * @param root
	 * @return
	 */
	private List<Integer> preOrderTraversal(TreeNode root){
		List<Integer> list = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		
		while(!stack.isEmpty()){
			TreeNode node = stack.pop();
			list.add(node.value);
			
			if(node.right!=null){
				stack.push(node.right);
			}
			if(node.left!=null){
				stack.push(node.left);
			}
		}
		return list;
	}
	
	/**
	 * While stack not empty->
	 * if root not null ->push and go left
	 * else -> pop, print and go right.
	 * 
	 * @param root
	 * @return
	 */
	private List<Integer> inOrderTreversal(TreeNode root){
		List<Integer> list = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();

		TreeNode p = root;
		
		while(!stack.isEmpty() || p!=null){
			if(p!=null){
				stack.push(p);
				p=p.left;
			}
			else{
				TreeNode item = stack.pop();
				list.add(item.value);
				p=p.right;
			}
		}

		return list;
	}

	/**
	 * first push,
	 * while stack not empty ->
	 * PEEK-> if left and right not null -> pop and print
	 * else if right not null -> push right and nullify right
	 * if left not null -> push left and nullify left
	 * 
	 * @param root
	 * @return
	 */
	private List<Integer> postOrderTraversal(TreeNode root){
		List<Integer> list = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		
		while(!stack.isEmpty()){
			TreeNode item = stack.peek();
			if(item.left!=null && item.right!=null){
				TreeNode pop = stack.pop();
				list.add(pop.value);
			}
			else{
				if(item.right!= null){
					stack.push(item.right);
					item.right =null;
				}
				if(item.left!= null){
					stack.push(item.left);
					item.left =null;
				}
			}
			
		}
		return list;
	}
	
}

class TreeNode{
	int value;
	TreeNode left;
	TreeNode right;
	
	TreeNode (int x){
		value = x;
	}
}