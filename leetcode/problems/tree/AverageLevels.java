package problems.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author amruta.kajrekar on 8/4/18.
 */
public class AverageLevels {

  public static void main(String[] args){
    AverageLevels avg = new AverageLevels();
    avg.averageOfLevels(TreeNode.getCustomTree(new String[]{"3","9","20","15","7"}));
  }

  public List<Double> averageOfLevels(TreeNode root) {
    int height = getHeightOfTree(root);
    //List<Double> list = new ArrayList<Double>();
    ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();

    for (int i=1;i<=height;i++){
      List<Integer> sub = new ArrayList<Integer>();
      int sum=0;
      printTree(root,i, sub);
      for(int j=0;j<sub.size();j++) {
        System.out.println(sub.get(j));
      }
      list.add(sub);
    }

    return new ArrayList<Double>();
  }

  private void printTree(TreeNode root, int level, List<Integer> sub) {
    if(root==null) return;
    if(level ==1) {sub.add(root.val);System.out.println(root.val);}
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
