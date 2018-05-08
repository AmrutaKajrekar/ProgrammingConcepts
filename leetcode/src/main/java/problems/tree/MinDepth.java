package problems.tree;

/**
 * @author amruta.kajrekar on 5/5/18.
 * Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],

3
/ \
9  20
/  \
15   7
return its minimum depth = 2.
 */
public class MinDepth {

    public static void main(String[] args){
        MinDepth min = new MinDepth();
        System.out.println(min.minDepth(TreeNode.getSampleTree()));
    }

    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        return minDep(root)+1;
    }

    public int minDep(TreeNode root){
        if(root==null) return 0;
        else{
            int left = minDep(root.left);
            int right = minDep(root.right);

            if(left<right) return left+1;
            else return right+1;
        }
    }

}
