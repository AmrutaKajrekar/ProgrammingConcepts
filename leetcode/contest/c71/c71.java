package contest;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author amruta.kajrekar
 */
public class c71 {

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */

    public static void main(String[] args){
        c71 obj = new c71();
        //[4,2,6,1,3,null,null]
//        TreeNode root = new TreeNode(4);
//        TreeNode child1 = new TreeNode(2);
//        TreeNode child2 = new TreeNode(6);
//        TreeNode child3 = new TreeNode(1);
//        TreeNode child4 = new TreeNode(3);
//
//        root.left = child1;
//        root.right = child2;
//        child1.left = child3;
//        child1.right = child4;

        //[27,null,34,null,58,50,44,null,null,null,null]
//        27,null,34,null,58,50,null,44,null,null,null
//        TreeNode root = new TreeNode(27);
//        TreeNode child1 = new TreeNode(34);
//        TreeNode child2 = new TreeNode(58);
//        TreeNode child3 = new TreeNode(50);
//        TreeNode child4 = new TreeNode(44);
//
//        root.right = child1;
//        child1.right = child2;
//        child2.left = child3;
//        child3.left = child4;

        TreeNode root = new TreeNode(90);
        TreeNode child1 = new TreeNode(69);
        TreeNode child2 = new TreeNode(49);
        TreeNode child3 = new TreeNode(89);
        TreeNode child4 = new TreeNode(52);

        root.left = child1;
        child1.right = child3;
        child1.left = child2;
        child2.right = child4;
        System.out.println(obj.minDiffInBST(root));
    }

    public int minDiffInBST(TreeNode root) {
        int min_Diff = Integer.MAX_VALUE;

        ArrayList<Integer> list = new ArrayList<Integer>();
        list = addToList(list, root);
        Collections.sort(list);

        for(int i=0;i<list.size()-1;i++){
            int abs = Math.abs(list.get(i)-list.get(i+1));
            if(abs<min_Diff) min_Diff=abs;
        }
        return min_Diff;
    }

    private ArrayList addToList(ArrayList list, TreeNode root) {
        if(root!=null){
            list.add(root.val);
            addToList(list, root.left);
            addToList(list, root.right);
        }
        return list;
    }

    public int minDiffInBST2(TreeNode root) {
        int min_diff = Integer.MAX_VALUE;
        //recursively call left and right tree nodes and find distance
        int diff1 = findDist(root,root.left, min_diff);
        int diff2 = findDist(root,root.right, min_diff);
        if(diff1<diff2){
            return diff1 <min_diff ? diff1: min_diff;
        }
        if(diff2<diff1){
            return diff2 <min_diff ? diff2: min_diff;
        }
//        return min_diff;
        return diff1 < diff2 ? diff1: diff2;
    }

    private int findDist(TreeNode root, TreeNode child, int min_diff) {
        if(root!=null && child!=null){
            int diff = Math.abs(root.val-child.val);
            if(diff < min_diff){
                min_diff=diff;
            }
            if(child.left!=null){
                int diff3 =findDist(child,child.left,min_diff);
                if ( diff3< min_diff){
                    min_diff=diff3;
                }
            }
            if(child.right!=null){
                int diff4 =findDist(child,child.right,min_diff);
                if ( diff4< min_diff){
                    min_diff=diff4;
                }
            }
        }
        return min_diff;
    }


}

class TreeNode {

   int val;
   TreeNode left;
   TreeNode right;

   TreeNode(int x) {
       val = x;
   }
}
