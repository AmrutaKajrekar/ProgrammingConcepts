package problems.tree;

/**
 * @author amruta.kajrekar on 8/6/18.
 */
public class IsBinarySearchTree {

  public static void main(String[] args){
    IsBinarySearchTree bst = new IsBinarySearchTree();
    System.out.println(bst.isBinary(TreeNode.getSampleBinarySearchTree()));
  }

  TreeNode prev = null;
  public boolean isBinary(TreeNode root){
    if(root.left!=null && !isBinary(root.left)) return false;
//    if((root.left!=null && root.left.val > root.val) || (root.right!=null && root.right.val <root.val)) return false;
//    else if(root.left==null && root.right==null) return true;
    if (prev != null && root.val <= prev.val )
      return false;
    prev = root;
    if(root.right!=null && !isBinary(root.right)) return false;

    return true;
  }
}
