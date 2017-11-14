package com.main.leetcode.tree;

/**
 * @author amruta.kajrekar
 * leetcode problem #606
 *
 * You need to construct a string consists of parenthesis and integers from a binary tree with the preorder traversing way.

The null node needs to be represented by empty parenthesis pair "()". And you need to omit all the empty parenthesis pairs that don't affect the one-to-one mapping relationship between the string and the original binary tree.

Example 1:
Input: Binary tree: [1,2,3,4]
1
/   \
2     3
/
4

Output: "1(2(4))(3)"

Explanation: Originallay it needs to be "1(2(4)())(3()())",
but you need to omit all the unnecessary empty parenthesis pairs.
And it will be "1(2(4))(3)".
 */
public class ConstructStringFromBT {

    public static void main(String[] args){
        ConstructStringFromBT con = new ConstructStringFromBT();
        TreeNode node1 =new TreeNode(1);
        TreeNode node2 =new TreeNode(2);
        TreeNode node3 =new TreeNode(3);
        TreeNode node4 =new TreeNode(4);
        node1.left = node2;
        node1.right = node3;
        node2.right = node4;
        node2.left = null;

//        TreeNode node1 =new TreeNode(1);
//        TreeNode node2 =new TreeNode(2);
//        TreeNode node3 =new TreeNode(3);
//        TreeNode node4 =new TreeNode(4);
//        TreeNode node5 =new TreeNode(5);
//        TreeNode node6 =new TreeNode(6);
//        TreeNode node7 =new TreeNode(7);
//        TreeNode node8 =new TreeNode(8);
//        TreeNode node9 =new TreeNode(9);
//
//        node1.left=node2;
//        node1.right=node3;
//        node2.left=node4;
//        node2.right=node5;
//        node4.left=node8;
//        node4.right=node9;
//        node5.left=node6;
//        node5.right=node7;

        System.out.print(con.tree2str(node1));
    }

    public String tree2str(TreeNode tree){
        StringBuilder str = new StringBuilder();
        if(tree!=null) {
            preorderTraversal(tree,str);
        }
        return str.toString();
    }

    private void preorderTraversal(TreeNode tree, StringBuilder str) {
        str.append(tree.val);

        if(tree.left!=null){
            str.append("(");
            preorderTraversal(tree.left, str);
            str.append(")");
        }else{
            if(tree.right!=null){
                str.append("()");
            }
        }

        if(tree.right!=null){
            str.append("(");
            preorderTraversal(tree.right, str);
            str.append(")");
        }
    }
}
