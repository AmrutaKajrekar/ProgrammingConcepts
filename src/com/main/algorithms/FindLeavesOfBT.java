/**
 * 
 */
package com.main.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * @author amruta
 *
 */
public class FindLeavesOfBT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode rLeft2 = new TreeNode(2);
		TreeNode rRight3 = new TreeNode(3);
		TreeNode nLeft4 = new TreeNode(4);
		TreeNode nRight5 = new TreeNode(5);
		
		rLeft2.left = nLeft4;
		rLeft2.right = nRight5;
		
		root.left = rLeft2;
		root.right = rRight3;
		
		FindLeavesOfBT find = new FindLeavesOfBT();
		System.out.print(find.findLeaves(root));
	}

	
	public List<List<Integer>> findLeaves(TreeNode root) {
	    List<List<Integer>> result = new ArrayList<List<Integer>>();
	    helper(result, root);
	    return result;
	}
	 
	// traverse the tree bottom-up recursively
	private int helper(List<List<Integer>> list, TreeNode root){
	    if(root==null)
	        return -1;
	 
	    int left = helper(list, root.left);
	    System.out.println("left = " + left);
	    int right = helper(list, root.right);
	    System.out.println("right = " + right);
	    int curr = Math.max(left, right)+1;
	    System.out.println("curr = " + curr);
	 
	    // the first time this code is reached is when curr==0,
	    //since the tree is bottom-up processed.
	    if(list.size()<=curr){
	    	System.out.println("list.size = " + list.size() + "and curr = " + curr);
	        list.add(new ArrayList<Integer>());
	    }
	 
	    list.get(curr).add(root.value);
	 
	    return curr;
	}
}
