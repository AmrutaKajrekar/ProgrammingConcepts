package problems.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author amruta.kajrekar on 5/1/18.
 */
public class InorderTraversal {

    public static void main(String[] args){
        InorderTraversal traversal = new InorderTraversal();
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        root.right=node1;
        TreeNode node2 = new TreeNode(3);
        node1.left=node2;

        System.out.print(traversal.inorderTraversal(root));
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(root==null) return list;
        return inorder(root,list);

    }

    private List<Integer> inorder(TreeNode root, ArrayList<Integer> list) {
        if(root!=null){
            inorder(root.left, list);
            list.add(root.val);
            inorder(root.right, list);
        }
        return list;
    }

}
