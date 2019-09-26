package problems.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author amruta.kajrekar on 8/11/18.
 */
public class MinDiffBST {

  public static void main(String[] args){
    MinDiffBST bst = new MinDiffBST();
    System.out.print(bst.getMinimumDifference(TreeNode.getSampleBinarySearchTree()));
  }

  public int getMinimumDifference(TreeNode root) {
    List<Integer> list = new ArrayList<>();

    if(root!=null)
      readTree(root,list);

    Collections.sort(list);
    int min=Integer.MAX_VALUE;

    for(int i=0;i<list.size()-1;i++){
      min = Math.min(min, Math.abs(list.get(i)-list.get(i+1)));
    }

    return min;
  }

  public void readTree(TreeNode root, List<Integer> list){
    if(root!=null) {
      list.add(root.val);
      readTree(root.left, list);
      readTree(root.right, list);
    }
  }
}
