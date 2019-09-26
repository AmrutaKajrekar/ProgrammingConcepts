package problems.tree;

/**
 * @author amruta.kajrekar on 5/5/18.
 * leetcode problem #110
 * Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as:

a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

Example 1:

Given the following tree [3,9,20,null,null,15,7]:

3
/ \
9  20
/  \
15   7
Return true.

Example 2:

Given the following tree [1,2,2,3,3,null,null,4,4]:

1
/ \
2   2
/ \
3   3
/ \
4   4
Return false.
 */
public class BalancedTree {

    public static void main(String[] args){
        BalancedTree tree = new BalancedTree();
//        System.out.println(tree.isBalanced(TreeNode.getSampleTree()));
        TreeNode node15 = new TreeNode(15);
        TreeNode node7 = new TreeNode(7);
        TreeNode node20 = new TreeNode(20, null, node7);
        TreeNode node9 = new TreeNode(9, node15, null);
        TreeNode root = new TreeNode(3, node9, node20);
        System.out.println(tree.isBalanced(root));
    }

    boolean isBalanced = true;
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        isBal(root);
        return isBalanced;
    }

    public int isBal(TreeNode root) {
        if (root == null)
            return 0;
        int left = isBal(root.left);
        int right = isBal(root.right);

        if (Math.abs(left - right) > 1)
            isBalanced = false;
        return Math.max(left, right) + 1;
    }


}
