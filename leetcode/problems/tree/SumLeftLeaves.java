package problems.tree;

/**
 * @author amruta.kajrekar on 5/2/18.
 */
public class SumLeftLeaves {

    public static void main(String[] args){
        SumLeftLeaves left = new SumLeftLeaves();
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);
//        TreeNode node5 = new TreeNode(11);
//        TreeNode node6 = new TreeNode(7);
        root.left=node1;
        root.right=node2;
        node2.left=node3;
        node2.right=node4;
//        node1.left=node5;
//        node1.right=node6;

        System.out.print(left.sumOfLeftLeaves(root));
    }
    private int sum=0;

    public int sumOfLeftLeaves(TreeNode root) {

        if(root==null) return 0;
        else{
            return getSum(root);
        }

    }

    public int getSum(TreeNode root){

        if(root.left!=null && root.left.left==null&& root.left.right==null){
            sum+=root.left.val;
        }
        if(root.left!=null)
            getSum(root.left);
        if(root.right!=null)
            getSum(root.right);

        return sum;
    }

}
