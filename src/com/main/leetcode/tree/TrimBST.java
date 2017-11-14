package com.main.leetcode.tree;

/**
 *  @author amruta.kajrekar
 * leetcode problem #669
 *
 *Given a binary search tree and the lowest and highest boundaries as L and R, trim the tree so that all its elements lies in [L, R] (R >= L). 
 * You might need to change the root of the tree, so the result should return the new root of the trimmed binary search tree.
Example 1:
Input: 
    1
   / \
  0   2

  L = 1
  R = 2

Output: 
    1
      \
       2
 */
public class TrimBST {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		root.left = node2;
		node2.left = node1;
		root.right = node5;
		node5.left = node4;
		
		TrimBST tree = new TrimBST();
		root = tree.trimBST(root, 1,4);
		
		printTree(root);
	}
	
//	private static void printTree(TreeNode root) {
//		TreeNode temp = root;
//		TreeNode tempRoot = null;
//		while(temp.left!=null){
//			tempRoot = temp;
//			temp = temp.left;
//		}
//		System.out.print(temp.val);
//		System.out.print(tempRoot.val);
//		System.out.print(tempRoot.right.val);
//		
//	}

	
	private static void printTree(TreeNode root) {
		if(root == null)
			return;
			printTree(root.left);
			System.out.print(root.val);
			printTree(root.right);

	}

	public TreeNode trimBST(TreeNode root, int L, int R) {
        if(null!=root){
        	//if root is lesser than L - remove root
        	if(root.val > R){
        		root = root.left;
        	}
        	
        	//if root is greater than R - remove root
        	if(root.val < L){
        		root = root.right;
        	}
        	
        	
        }
		return root;
    }

private TreeNode trim (TreeNode root, int min, int max) {
    if (root == null) {
        return root;
    }
    if(root.val <= max && root.val>= min) {
        root.left = trim(root.left, min, max);
        root.right = trim (root.right, min, max);
        return root;
    }else if (root.val < min) {
        return trim (root.right, min, max);
    }else if (root.val > max) {
        return trim(root.left, min, max);
    }else{
        return root;
    }
}
}
