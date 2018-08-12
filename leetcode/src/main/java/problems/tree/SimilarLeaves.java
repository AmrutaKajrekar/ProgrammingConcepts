package problems.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author amruta.kajrekar on 8/4/18.
 */
public class SimilarLeaves {

  public static void main(String[] args){
    SimilarLeaves sim= new SimilarLeaves();
    sim.leafSimilar(TreeNode.getCustomTree(new String[]{"3","5","1","6","2","9","8","null","null","7","4"}),
        TreeNode.getCustomTree(new String[]{"3","5","1","6","2","9","8","null","null","7","4"}));
  }
  public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    if((root1!=null && root2==null) || (root2!=null && root1==null)) return false;
    List<Integer> l1 = getLeafList(root1);
    List<Integer> l2 = getLeafList(root2);

    if(l1.size()!=l2.size()) return false;
    for(int i=0;i<l1.size();i++){
      if(l1.get(i)!=l2.get(i)) return false;
    }
    return true;
  }

  public List<Integer> getLeafList(TreeNode root){
    List<Integer> list = new ArrayList<>();
    if(root!=null) getLeaves(root, list);
    return list;
  }

  public void getLeaves(TreeNode root, List<Integer> list){
    if(root.left==null && root.right==null) {
      System.out.println(root.val+" added");
      list.add(root.val);
    }
    if(root.left!=null) getLeaves(root.left, list);
    if(root.right!=null) getLeaves(root.right, list);
  }

}
