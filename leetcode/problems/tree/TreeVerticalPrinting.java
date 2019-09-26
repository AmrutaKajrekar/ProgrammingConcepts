package problems.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author amruta.kajrekar on 7/1/18.
 */
public class TreeVerticalPrinting {
//    Values v = new Values();
    int min =0, max = 0;
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    HashMap<Integer, List<Integer>> vertical = new HashMap<Integer, List<Integer>>();

    public static void main(String[] args){
        TreeVerticalPrinting tree = new TreeVerticalPrinting();
        TreeNode node = TreeNode.getSampleTree();
        tree.startPrinting(tree,node);

    }

    private void startPrinting(TreeVerticalPrinting tree, TreeNode node) {
        tree.findMinMaxInt(node,0);
//        tree.findMinMax(node, v, v, 0);

        for(int i = this.min;i<=this.max;i++){
            tree.verticalPrinting(node,i, 0);
            System.out.println("");
        }
    }

    public void verticalMapPrinting(TreeNode node, int level, int dist){
        if(node == null) return;
        if(dist== level) {
            List<Integer> list;
            if (!vertical.containsKey(level)) {
                list = new ArrayList<Integer>();
            } else {
                list = vertical.get(level);
            }
            list.add(node.val);
            vertical.put(level, list);
            System.out.print(node.val+ ",");
        }
        verticalMapPrinting(node.left, level, dist-1);
        verticalMapPrinting(node.right, level, dist+1);
    }



     public void verticalPrinting(TreeNode node, int level, int dist){
        if(node == null) return;
        if(dist== level) {
            System.out.print(node.val+ ",");
        }
        verticalPrinting(node.left, level, dist-1);
        verticalPrinting(node.right, level, dist+1);
    }



    public void topViewPrinting(TreeNode node, int level, int dist){
        if(node == null) return;
        if(dist== level && !map.containsKey(level)) {
            map.put(level,node.val);
            System.out.print(node.val + ",");
        }

        topViewPrinting(node.left, level, dist-1);
        topViewPrinting(node.right, level, dist+1);
    }

    public void findMinMaxInt(TreeNode node, int dist){
        if(node==null) return;

        if(dist<this.min) this.min = dist;
        if(dist>this.max) this.max = dist;

        findMinMaxInt(node.left,dist-1);
        findMinMaxInt(node.right,dist+1);
    }

    /*
    public void findMinMax(TreeNode node, Values min, Values max, int dist){
        if(node==null) return;

        if(dist<min.min) min.min = dist;
        if(dist>max.max) max.max = dist;

        findMinMax(node.left, min, max, dist-1);
        findMinMax(node.right, min, max, dist+1);
    }
*/


}

/*
    class Values{
        int min=0, max=0;
        public Values(){
        }
        public Values(int min, int max){
            this.min = min;
            this.max = max;
        }
    }
*/
