package problems.depthFirstSearch;

import problems.tree.TreeNode;

/**
 * @author amruta.kajrekar on 4/3/18.
 * leetcode problem #100
 *
 * Given two binary trees, write a function to check if they are the same or not.
 * Two binary trees are considered the same if they are structurally identical and the nodes have the same value.


Example 1:

Input:     1         1
/ \       / \
2   3     2   3

[1,2,3],   [1,2,3]

Output: true
Example 2:

Input:     1         1
/           \
2             2

[1,2],     [1,null,2]

Output: false
Example 3:

Input:     1         1
/ \       / \
2   1     1   2

[1,2,1],   [1,1,2]

Output: false
 */
public class SameTree {

    public static void main(String[] args){
        TreeNode p = new TreeNode(1);
        TreeNode p1 = new TreeNode(2);
        TreeNode p2 = new TreeNode(4);
//        TreeNode p3 = new TreeNode(3);
        p.left=p1;
        p.right=p2;
//        p2.right=p3;

        TreeNode q = new TreeNode(1);
        TreeNode q1 = new TreeNode(2);
        TreeNode q2 = new TreeNode(3);
        q.left=q1;
        q.right=q2;

        SameTree tree= new SameTree();
        System.out.print(tree.isSameTree(p,q));
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if((p!=null && q==null) || (p==null && q!=null)) return false;
        if(p.val==q.val){
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }
        return false;
    }


}
