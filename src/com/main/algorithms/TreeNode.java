/**
 * 
 */
package com.main.algorithms;

/**
 * @author amruta
 *
 */
public class TreeNode {
	TreeNode left;
	TreeNode right;
	int value;
	
	TreeNode(int x){
		value = x;
	}
	TreeNode(int x, TreeNode pleft, TreeNode pright){
		value = x;
		left = pleft;
		right = pright;
	}
}
