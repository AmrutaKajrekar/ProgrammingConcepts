package problems.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author amruta.kajrekar on 5/5/18.
 * leetcode problem #102
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],
3
/ \
9  20
/  \
15   7
return its level order traversal as:
[
[3],
[9,20],
[15,7]
]

 */
public class LevelOrderTraversal {

    public static void main(String[] args){
        LevelOrderTraversal traversal = new LevelOrderTraversal();
        System.out.println(traversal.levelOrder(TreeNode.getSampleTree()));
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        int height = getHeightOfTree(root);
        ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();

        for (int i=1;i<=height;i++){
            List<Integer> sub = new ArrayList<Integer>();
            printTree(root,i, sub);
            list.add(sub);
        }
        return list;
    }

    private void printTree(TreeNode root, int level, List<Integer> sub) {
        if(root==null) return;
        System.out.println("root.val = "+ root.val + ", level = "+ level);
        if(level ==1) sub.add(root.val);
        else{
            printTree(root.left,level-1,sub);
            printTree(root.right,level-1,sub);
        }
    }

    private int getHeightOfTree(TreeNode root) {
        if(root==null) return 0;
        else{
            int left = getHeightOfTree(root.left);
            int right = getHeightOfTree(root.right);

            if(left>right) return left+1;
            else return right+1;
        }
    }
}
