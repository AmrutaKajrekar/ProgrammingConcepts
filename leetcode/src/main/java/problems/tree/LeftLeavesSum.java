package problems.tree;

import java.util.ArrayList;

/**
 * @author amruta.kajrekar.
 * leetcode problem #404 Sum of Left Leaves
 *Find the sum of all left leaves in a given binary tree.

Example:

3
/ \
9  20
/  \
15   7

There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
 * Given the below binary tree and sum = 22,
     5
    / \
   4   8
  /   / \
 11  13  4
/  \      \
7  2       1

 */
public class LeftLeavesSum {

    public static void main(String[] args){
//        TreeNode node7 = new TreeNode(7);
//        TreeNode node2 = new TreeNode(2);
//        TreeNode node1 = new TreeNode(1);
//
//        TreeNode node11 = new TreeNode(11);
//        node11.left=node7;
//        node11.right=node2;
//        TreeNode node13 = new TreeNode(13);
//        TreeNode node42 = new TreeNode(4);
//        node42.right=node1;
//
//        TreeNode node41 = new TreeNode(4);
//        node41.left=node11;
//        TreeNode node8 = new TreeNode(8);
//        node8.left=node13;
//        node8.right=node42;
//
//        TreeNode root5 = new TreeNode(5);
//        root5.left=node41;
//        root5.right=node8;

        LeftLeavesSum sum = new LeftLeavesSum();
        sum.sumOfLeftLeaves(TreeNode.getSampleTree());
    }

    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)
            return 0;
        ArrayList<Integer> leaves = new ArrayList<Integer>();
        TreeNode curr = root;
        System.out.println("left leaves sum="+leftLeaves(curr));
        System.out.println("right leaves sum="+rightLeaves(curr));
//        leftLeaves(curr);
        return 0;
    }

    private int leftLeaves(TreeNode root) {
        int sum=0;
        if(root!=null) {
            if(isLeaf(root.left)){
                sum+=root.left.val;
            }else {
                sum+=leftLeaves(root.left);
            }

            sum+=leftLeaves(root.right);
        }
        return sum;
    }

    private int rightLeaves(TreeNode root) {
        int sum=0;
        if(root!=null) {
            if(isLeaf(root.right)){
                sum+=root.right.val;
            }else {
                sum+=rightLeaves(root.right);
            }

            sum+=rightLeaves(root.left);
        }
        return sum;
    }

    private boolean isLeaf(TreeNode node){
        if(node==null) return false;
        return (node.left==null && node.right==null);
    }

    private int leftLeaves2(TreeNode root) {
        int sum=0;
        if(root!=null) {
            System.out.println("initial sum = " +sum);
            sum= checkLeft(root,sum);
            System.out.println("after checkleft sum = " +sum);
            sum= checkRight(root,sum);
            System.out.println("after checkright sum = " +sum);
        }
        return sum;
    }

    private int checkRight(TreeNode root, int sum) {
        if (root.left.left != null) {
            TreeNode node = root.left.left;
            if (node != null) {
                if (node.left == null && node.right == null) {
                    sum += node.val;
                    System.out.println(node.val);
                } else {
                    checkLeft(root.left, sum);
                    checkRight(root.right, sum);
                }
            }
        }
        if (root.right.left!=null) {
            TreeNode rnode = root.right.left;
            if(rnode!=null){
                if(rnode.left==null && rnode.right==null){
                    sum+=rnode.val;
                    System.out.println(rnode.val);
                }else{
                    checkLeft(root.left,sum);
                    checkRight(root.right,sum);
                }
            }
        }
        return sum;
    }

    private int checkLeft(TreeNode root,int sum) {
        if (root.left != null && root.right!=null) {
            TreeNode lnode = root.left.left;
            if(lnode!=null){
                if(lnode.left==null && lnode.right==null){
                    sum+=lnode.val;
                    System.out.println(lnode.val);
                }else{
                    checkLeft(root.left,sum);
                    checkRight(root.right,sum);
                }
            }
            TreeNode rnode = root.right.left;
            if(rnode!=null){
                if(rnode.left==null && rnode.right==null){
                    sum+=rnode.val;
                    System.out.println(rnode.val);
                }else{
                    checkLeft(root.left,sum);
                    checkRight(root.right,sum);
                }
            }
        }
        return sum;
    }

    private ArrayList helper(TreeNode root, ArrayList<Integer> leaves){
        if(root!=null) {
            if (root.left == null && root.right == null) {
                System.out.print(root.val+",");
                leaves.add(root.val);
            } else {
                helper(root.left, leaves);
                helper(root.right, leaves);
            }
        }
        return leaves;
    }
    private void printTree(TreeNode root) {
        if(root == null)
            return;
        printTree(root.left);
        System.out.print(root.val);
        printTree(root.right);

    }
}
