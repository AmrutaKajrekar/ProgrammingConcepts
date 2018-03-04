package problems.tree;

/**
 * @author amruta.kajrekar on 1/2/18.
 * leetcode problem #101 Symmetric tree
 *
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

      1
     / \
    2   2
   / \ / \
  3  4 4  3
 /\ /\ /\ /\
5 67 8 87 6 5

But the following [1,2,2,null,3,null,3] is not:
   1
  / \
 2   2
 \   \
 3    3
Note:
Bonus points if you could solve it both recursively and iteratively.
 */
public class SymmetricTree {

    public static void main(String args[]){
        TreeNode root = new TreeNode(1);
        TreeNode node21 = new TreeNode(2);
        TreeNode node22 = new TreeNode(2);

        TreeNode node31 = new TreeNode(3);
        TreeNode node32 = new TreeNode(3);
        root.left=node21;
        root.right=node22;

        node21.left=node31;
        node22.right=node32;

        SymmetricTree tree = new SymmetricTree();
        TreeNode.printTree(root);
        System.out.println(tree.isSymmetric(root));
    }

    public boolean isSymmetric(TreeNode root) {
    return isTreeaMirror(root,root);
    }

    private boolean isTreeaMirror(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null){
            return true;
        }
        if(root1==null || root2==null){
            return false;
        }
        return (root1.val==root2.val && isTreeaMirror(root1.left,root2.right) && isTreeaMirror(root1.right,root2.left));

    }

}
