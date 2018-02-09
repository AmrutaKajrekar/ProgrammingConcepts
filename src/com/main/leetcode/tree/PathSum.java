package com.main.leetcode.tree;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * leetcode problem #112 Path Sum
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

For example:
Given the below binary tree and sum = 22,
     5
    / \
   4   8
  /   / \
 11  13  4
 / \     \
7    2    1
return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 */

public class PathSum {

    public static void main(String[] args){
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
        PathSum sol = new PathSum();
        System.out.println(sol.hasPathSum(root5, 22));

    }

    public boolean hasPathSum(TreeNode root, int sum) {
        LinkedList<TreeNode> nodes = new LinkedList<TreeNode>();
        LinkedList<String> paths = new LinkedList<String>();
        LinkedList<Integer> values = new LinkedList<Integer>();

        if(root==null){
            return false;
        }else{
            nodes.add(root);
            paths.add(String.valueOf(root.val));
            values.add(root.val);

            while(!nodes.isEmpty()){
                TreeNode curr = nodes.poll();
                int psum = values.poll();
                String path = paths.poll();

                if(curr.left==null && curr.right==null && psum == sum){
                    System.out.println("path found! "+ path + ", Sum = " + psum);
                    return true;
                }
                if(curr.left!=null){
                   nodes.add(curr.left);
                    paths.add(path+">"+curr.left.val);
                    values.add(psum+curr.left.val);
                }
                if(curr.right!=null){
                    nodes.add(curr.right);
                    paths.add(path+">"+curr.right.val);
                    values.add(psum+curr.right.val);
                }
            }
        }
        return false;
    }

    private void printNodes(LinkedList<TreeNode> nodes) {
        Iterator<TreeNode> it = nodes.iterator();
        while(it.hasNext()){
            System.out.print(it.next().val);
        }
    }
}
