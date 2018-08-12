package problems.tree;

public  class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { val = x; }
    public TreeNode(int x, TreeNode left, TreeNode right) {
        val = x;
        this.left = left;
        this.right = right;
    }

    /**
     *
     *        5
     *      /  \
     *     4   8
     *    /   / \
     *   11  13  4
     *   / \      \
     *  7  2      1
     *      \
     *      22
     *
     * @return TreeNode
     */
    public static TreeNode getSampleTree(){
        TreeNode node7 = new TreeNode(7);
        TreeNode node2 = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);
        node2.right = new TreeNode(22);

        TreeNode node11 = new TreeNode(11);
        node11.left=node7;
        node11.right=node2;
        TreeNode node13 = new TreeNode(13);
        TreeNode node42 = new TreeNode(4);
        node42.right=node1;

        TreeNode node41 = new TreeNode(4);
        node41.left=node11;
        TreeNode node8 = new TreeNode(8);
        node8.left=node13;
        node8.right=node42;

        TreeNode root5 = new TreeNode(5);
        root5.left=node41;
        root5.right=node8;

        return root5;
    }

    /**
     *            10
     *          /    \
     *         5     20
     *        / \    / \
     *       3  8   15 31
     *      /\  /\     / \
     *     2 4 7 9    25 35
     * @return
     */
    public static TreeNode getSampleBinarySearchTree(){
        TreeNode node2 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3, node2, node4);

        TreeNode node7 = new TreeNode(7);
        TreeNode node9 = new TreeNode(9);
        TreeNode node8 = new TreeNode(8, node7, node9);

        TreeNode node5 = new TreeNode(5, node3, node8);

        TreeNode node15 = new TreeNode(15);
        TreeNode node25 = new TreeNode(25);
        TreeNode node35 = new TreeNode(35);

        TreeNode node31 = new TreeNode(31, node25, node35);

        TreeNode node20 = new TreeNode(20, node15, node31);

        TreeNode root10 = new TreeNode(10, node5, node20);

        return root10;
    }

    public static void printTree(TreeNode root){
        if(root!=null) {
            System.out.print(root.val+",");
        }
        if(root.left!=null) {
            printTree(root.left);
        }
        if(root.right!=null) {
            printTree(root.right);
        }

    }

//[1,2,2,3,3,null,null,4,4]
    //not working
    //call made as TreeNode.getCustomTree(new String[] {"1","2","2","3",null,null,"3","4",null,null,"4"})
    public static TreeNode getCustomTree(String[] tree){
        TreeNode root = new TreeNode(Integer.parseInt(tree[0]));
        TreeNode nodel =null;
        TreeNode noder = null;

        if(tree[1]!=null);
        nodel = new TreeNode(Integer.parseInt(tree[1]));
        if(tree[2]!=null);
        noder = new TreeNode(Integer.parseInt(tree[2]));

        root.left= nodel;
        root.right=noder;

        for (int i=1;i<tree.length-3;i=i+3){
            TreeNode node1 = null;
            if(tree[i]!=null)
            node1 = new TreeNode(Integer.parseInt(tree[i]));

            nodel =null;
            noder = null;

            if(tree[i+1]!=null)
             nodel = new TreeNode(Integer.parseInt(tree[i+1]));
            if(tree[i+2]!=null)
             noder = new TreeNode(Integer.parseInt(tree[i+2]));

             if(node1!=null) {
                 node1.left = nodel;
                 node1.right = noder;
             }

        }

        return root;
    }

    public static TreeNode getCustomTree(String data){
        String[] tree = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(String.valueOf(tree[0])));
        TreeNode nodel =null;
        TreeNode noder = null;

        if(String.valueOf(tree[1])!=null);
        nodel = new TreeNode(Integer.parseInt(String.valueOf(tree[1])));
        if(String.valueOf(tree[2])!=null);
        noder = new TreeNode(Integer.parseInt(String.valueOf(tree[2])));

        root.left= nodel;
        root.right=noder;

        for (int i=1;i<tree.length-3;i=i+3){
            TreeNode node1 = null;
            if(String.valueOf(tree[i])!=null)
                node1 = new TreeNode(Integer.parseInt(String.valueOf(tree[i])));

            nodel =null;
            noder = null;

            if(String.valueOf(tree[i+1])!=null)
                nodel = new TreeNode(Integer.parseInt(String.valueOf(tree[i+1])));
            if(String.valueOf(tree[i+2])!=null)
                noder = new TreeNode(Integer.parseInt(String.valueOf(tree[i+2])));

            if(node1!=null) {
                node1.left = nodel;
                node1.right = noder;
            }

        }

        return root;
    }

    public static void main(String[] args){
        TreeNode.getCustomTree("");
    }
 }
