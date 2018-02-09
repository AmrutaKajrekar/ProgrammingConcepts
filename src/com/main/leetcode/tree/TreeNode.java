package com.main.leetcode.tree;

public  class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { val = x; }

    /**
     *
         5
        / \
       4   8
      /   / \
     11  13  4
     / \      \
    7  2      1

     * @return TreeNode
     */
    public static TreeNode getSampleTree(){
        TreeNode node7 = new TreeNode(7);
        TreeNode node2 = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);

        TreeNode node11 = new TreeNode(11);
        node11.left=node7;
        node11.right=node2;
        TreeNode node13 = new TreeNode(13);
        TreeNode node42 = new TreeNode(4);
        node42.right=node1;

        TreeNode node41 = new TreeNode(4);
        node41.left=node11;
        TreeNode node8 = new TreeNode(8);
        node8.left=node13;
        node8.right=node42;

        TreeNode root5 = new TreeNode(5);
        root5.left=node41;
        root5.right=node8;

        return root5;
    }

    public static void printTree(TreeNode root){
        if(root!=null) {
            System.out.println(root.val);
        }
        if(root.left!=null) {
            printTree(root.left);
        }
        if(root.right!=null) {
            printTree(root.right);
        }

    }
 }
