package problems.tree;

/**
 * @author amruta.kajrekar on 5/1/18.
 * leetcode problem # 226
 * Invert a binary tree.

4
/   \
2     7
/ \   / \
1   3 6   9
to

4
/   \
7     2
/ \   / \
9   6 3   1
 */
public class InvertTree {

    public static void main(String[] args){
//        4,2,7,1,3,6,9
        InvertTree tree = new InvertTree();
        TreeNode root = new TreeNode(4);
        TreeNode node1 = new TreeNode(2);
//        TreeNode node2 = new TreeNode(7);
//        TreeNode node3 = new TreeNode(1);
//        TreeNode node4 = new TreeNode(3);
//        TreeNode node5 = new TreeNode(6);
//        TreeNode node6 = new TreeNode(9);
        root.left=node1;
//        root.right=node2;
//        node1.left=node3;
//        node1.right=node4;
//        node2.left=node5;
//        node2.right=node6;



        System.out.print(tree.invertTree(root));
        System.out.print(":)");
    }

    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        else{
            return invert(root);
        }
    }

    public TreeNode invert(TreeNode root){
        if(root!=null){
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            if(root.left!=null)
            invert(root.left);
            if(root.right!=null)
            invert(root.right);
        }
        return root;
    }

}
