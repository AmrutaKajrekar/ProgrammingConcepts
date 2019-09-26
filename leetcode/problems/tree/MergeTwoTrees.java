package problems.tree;

/**
 * @author amruta.kajrekar on 5/2/18.
 * leetcode problem # 617
 * Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.

You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.

Example 1:
Input:
Tree 1                     Tree 2
1                         2
/ \                       / \
3   2                     1   3
/                           \   \
5                             4   7
Output:
Merged tree:
3
/ \
4   5
/ \   \
5   4   7
Note: The merging process must start from the root nodes of both trees.
 *
 */
public class MergeTwoTrees {

    public static void main(String[] args){
        MergeTwoTrees two = new MergeTwoTrees();
        TreeNode root1 = new TreeNode(1);
//        TreeNode node1 = new TreeNode(2);
//        TreeNode node2 = new TreeNode(3);
//        TreeNode node3 = new TreeNode(5);
//        root1.left = node2;
//        root1.right = node1;
//        node2.left=node3;

        TreeNode root2 = new TreeNode(1);
        TreeNode node4 = new TreeNode(2);
//        TreeNode node5 = new TreeNode(3);
//        TreeNode node6 = new TreeNode(4);
//        TreeNode node7 = new TreeNode(7);
        root2.left=node4;
//        root2.right=node5;
//        node4.right=node6;
//        node5.right=node7;

        System.out.print(two.mergeTrees(root1,root2));
    }

    TreeNode newRoot;
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1!=null && t2==null) return t1;
        if(t2!=null && t1==null) return t2;

        if(t1!=null && t2!=null){
            newRoot = new TreeNode(t1.val+t2.val);
            if(t1.left!=null||t2.left!=null)
                newRoot.left = new TreeNode(0);
            if(t1.right!=null||t2.right!=null)
                newRoot.right = new TreeNode(0);
            merge(t1.left,t2.left,newRoot.left);
            merge(t1.right,t2.right,newRoot.right);
        }

        return newRoot;
    }


    private void merge(TreeNode t1, TreeNode t2, TreeNode node) {

        if(t1!=null && t2!=null){
            node.val = t1.val+t2.val;
            if(t1.left!=null||t2.left!=null)
                node.left = new TreeNode(0);
            if(t1.right!=null||t2.right!=null)
                node.right = new TreeNode(0);
            merge(t1.left,t2.left,node.left);
            merge(t1.right,t2.right,node.right);
        }else if(t1!=null && t2==null){
            node.val = t1.val;
            if(t1.left!=null)
                node.left = new TreeNode(0);
            if(t1.right!=null)
                node.right = new TreeNode(0);
            merge(t1.left,null,node.left);
            merge(t1.right,null,node.right);
        }else if(t2!=null && t1==null){
            node.val = t2.val;
            if(t2.left!=null)
                node.left = new TreeNode(0);
            if(t2.right!=null)
                node.right = new TreeNode(0);
            merge(null,t2.left,node.left);
            merge(null,t2.right,node.right);
        }else{
            if(node!=null) {
                node.left = null;
                node.right = null;
                node = null;
            }
        }

    }
}
