package problems.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author amruta.kajrekar on 5/5/18.
 * leetcode problem # 103
 * Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

For example:
Given binary tree [3,9,20,null,null,15,7],
3
/ \
9  20
/  \
15   7
return its zigzag level order traversal as:
[
[3],
[20,9],
[15,7]
]
 */
public class ZigZagLevelOrdering {

    public static void main(String[] args){
        ZigZagLevelOrdering level = new ZigZagLevelOrdering();
        System.out.println(level.zigzagLevelOrder(TreeNode.getSampleTree()));
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int height = getHeightOfTree(root);
        boolean leftToRight = true;
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for (int i=1;i<=height;i++){
            List<Integer> subList = new ArrayList<>();
            printTree(root,i,leftToRight,subList);
            leftToRight= !leftToRight;
            list.add(subList);
        }

        return null;
    }

    private void printTree(TreeNode root, int level, boolean leftToRight, List<Integer> subList) {
        if(root ==null) return;
        if(level==1) subList.add(root.val);
        else{
            if(leftToRight){
                printTree(root.left,level-1,leftToRight, subList);
                printTree(root.right,level-1,leftToRight, subList);
            }else{
                printTree(root.right,level-1,leftToRight, subList);
                printTree(root.left,level-1,leftToRight, subList);
            }
        }
    }

    private int getHeightOfTree(TreeNode root) {
        if(root==null){
            return 0;
        }else{
            int leftH = getHeightOfTree(root.left);
            int rightH = getHeightOfTree(root.right);

            if(leftH>rightH) return leftH+1;
            else return rightH+1;
        }
    }

}
