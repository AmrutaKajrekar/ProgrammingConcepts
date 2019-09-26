package problems.tree;

import java.util.LinkedList;

/**
 * @author amruta.kajrekar on 8/7/18.
 */
public class SerializeAndDeserializeTree {

  public static void main(String[] args){
    SerializeAndDeserializeTree tree = new SerializeAndDeserializeTree();
    tree.deserialize(tree.serialize(TreeNode.getSampleBinarySearchTree()));
  }
  // Encodes a tree to a single string.
  public String serialize(TreeNode root) {
    StringBuilder string = new StringBuilder();
    LinkedList<TreeNode> q = new LinkedList<TreeNode>();

    q.add(root);
    while(!q.isEmpty()){
      TreeNode node = q.poll();
      if(node!=null && String.valueOf(node.val)!="" && String.valueOf(node.val) != "#") {
        //System.out.println(node.val);
        string.append(String.valueOf(node.val)+",");
        q.add(node.left);
        q.add(node.right);
      }else{
        string.append("#,");
      }

    }
    string =  new StringBuilder(string.substring(0,string.length()-1));
//    String[] data = string.toString().split(",");
//    for(int i=data.length;i>0;i--) {
//      if(!data[i].equalsIgnoreCase("") && !data[i].equalsIgnoreCase("#"))
//
//    }
    System.out.println(string.toString());
    return string.toString();
  }

  // Decodes your encoded data to tree.
  public TreeNode deserialize(String data) {
    String[] nodes = data.split(",");

    TreeNode root = null;
    if(nodes[0]!=null && !nodes[0].equalsIgnoreCase("")){
      root = new TreeNode(Integer.parseInt(nodes[0]));

      LinkedList<TreeNode> q = new LinkedList<TreeNode>();
      q.add(root);

      int i=1;
      while(!q.isEmpty()){
        TreeNode temp = q.poll();
        if(temp!=null){
          if(!nodes[i].equals("") && !nodes[i].equals("#")){
            temp.left = new TreeNode(Integer.parseInt(nodes[i]));
            q.offer(temp.left);
          }else{
            temp.left = null;
            q.offer(temp.left);
          }
          i++;

          if(!nodes[i].equals("") && !nodes[i].equals("#")){
            temp.right = new TreeNode(Integer.parseInt(nodes[i]));
            q.offer(temp.right);
          }else{
            temp.right = null;
            q.offer(temp.right);
          }
          i++;

        }
      }
    }

    return root;

  }

}
