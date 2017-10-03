/**
 * 
 */
package com.main.algorithms;

/**
 * @author amruta
 *
 */
public class ConstructBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] inorder = {4,2,5,1,6,7,3,8};
		int[] postorder = {4,5,2,6,7,8,3,1};
		ConstructBinaryTree tree = new ConstructBinaryTree();
		tree.buildTree(inorder, postorder);
	}
	
	public TreeNode buildTree(int[] inorder, int[] postorder){
		int inorderStart = 0;
		int postorderStart = 0;
		int inorderEnd = inorder.length - 1;
		int postorderEnd = postorder.length - 1;
		return buildTree(inorder, inorderStart, inorderEnd, postorder, postorderStart, postorderEnd);
	}

	private TreeNode buildTree(int[] inorder, int inorderStart, int inorderEnd,
			int[] postorder, int postorderStart, int postorderEnd) {
		
		if (inorderStart > inorderEnd || postorderStart > postorderEnd)
			return null;
		
		int k=0;
		TreeNode root = new TreeNode(postorder[postorderEnd]);
		System.out.println("root = " + root.value);
		for (int i = 0; i < inorder.length; i++) {
			if(inorder[i] == root.value){
				k=i;
				break;
			}
		}
		
		root.left = buildTree(inorder,inorderStart, (k-1), postorder, postorderStart, (postorderStart+k-(inorderStart+1)));
		root.right = buildTree(inorder, k+1, inorderEnd, postorder, (postorderStart+k-inorderStart), postorderEnd-1);
		
		return root;
	}

}
