package problems.tree;

/**
 * @author amruta.kajrekar on 7/8/18.
 */
public class Sol1 {
    public static void main(String[] args){
        Sol1 sol = new Sol1();
        System.out.println(sol.isBinarySearchTree(TreeNode.getSampleTree()));
        System.out.println(sol.isBinarySearchTree(TreeNode.getSampleBinarySearchTree()));
    }

    public boolean isBinarySearchTree(TreeNode root){
        if(root!=null) {
            if(root.left!=null && !(root.left.val < root.val)) return false;
            if(root.right!=null && !(root.right.val > root.val)) return false;

            return isBinarySearchTree(root.left) && isBinarySearchTree(root.right);
        }
        return true;
    }

    public int height(TreeNode root){
        if(root==null) return 0;
        return Math.max(height(root.left), height(root.right)) +1;
    }
}
