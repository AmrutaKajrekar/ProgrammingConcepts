package problems.tree;

/**
 * @author amruta.kajrekar on 7/1/18.
 */
public class TreeRightSideView {
    static int rightmax = 0;
    static int leftmax = 0;

    public static void main(String[] args){
        TreeRightSideView right = new TreeRightSideView();
        right.rightSideView(TreeNode.getSampleTree(), 1);
        System.out.println();
        right.leftSideView(TreeNode.getSampleTree(), 1);

    }

    public void rightSideView(TreeNode root, int level){
        if(root!=null){
//            System.out.println("l="+level+", r="+rightmax);
            if(rightmax<level){
                rightmax = level;
                System.out.print(root.val+",");
            }

            rightSideView(root.right, level+1);
            rightSideView(root.left, level+1);
        }
    }

    public void leftSideView(TreeNode root, int level){
        if(root!=null){
            if(leftmax<level){
                leftmax = level;
                System.out.print(root.val+",");
            }

            leftSideView(root.left, level+1);
            leftSideView(root.right, level+1);
        }
    }
}
