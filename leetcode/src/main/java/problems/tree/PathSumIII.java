package problems.tree;

import java.util.LinkedList;

/**
 * @author amruta.kajrekar on 5/2/18.
 * leetcode problem # 437
 * You are given a binary tree in which each node contains an integer value.

Find the number of paths that sum to a given value.

The path does not need to start or end at the root or a leaf, but it must go downwards (traveling only from parent nodes to child nodes).

The tree has no more than 1,000 nodes and the values are in the range -1,000,000 to 1,000,000.

Example:

root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8

10
/  \
5   -3
/ \    \
3   2   11
/ \   \
3  -2   1

Return 3. The paths that sum to 8 are:

1.  5 -> 3
2.  5 -> 2 -> 1
3. -3 -> 11
 */
public class PathSumIII {

    public static void main(String[] args){

        TreeNode node11 = new TreeNode(11);
        TreeNode node1 = new TreeNode(1);

        TreeNode node22 = new TreeNode(-2);
        TreeNode node31 = new TreeNode(3);

        TreeNode node13 = new TreeNode(3);
        node13.left=node31;
        node13.right=node22;
        TreeNode node2 = new TreeNode(2);
        node2.right=node1;

        TreeNode node3 = new TreeNode(-3);
        node3.right=node11;
        TreeNode node5 = new TreeNode(5);
        node5.left=node13;
        node5.right=node2;

        TreeNode root = new TreeNode(10);
        root.left=node3;
        root.right=node5;

        PathSumIII sum3 = new PathSumIII();
        System.out.print(sum3.pathSum(root,8));

    }

    public int pathSum(TreeNode root, int sum) {

        return sum;
    }

    public boolean pathSumExists(TreeNode root, int sum) {

        LinkedList<TreeNode> nodes = new LinkedList();
        LinkedList<String> path = new LinkedList();
        LinkedList<Integer> values = new LinkedList();

        if (root == null)
            return false;
        else {
            nodes.add(root);
            path.add(String.valueOf(root.val));
            values.add(root.val);

            while (!nodes.isEmpty()) {
                TreeNode curr = nodes.poll();
                int psum = values.poll();
                String p = path.poll();

                if (curr.left == null && curr.right == null && psum == sum) {
                    return true;
                } else if (curr.left != null) {
                    nodes.add(curr.left);
//                    path.add(p+">"+)
                } else if (curr.right != null) {
                }
            }
            return false;
        }
    }
}
