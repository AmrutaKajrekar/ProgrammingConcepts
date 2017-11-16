package com.main.algorithms;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Refer to the below link for problem statement:
 * http://www.programcreek.com/2012/11/top-10-algorithms-for-coding-interview/
 * 
 * 
 *Add all node to a queue and store sum value of each node to another queue. 
 *When it is a leaf node, check the stored sum value.

 *For the tree above, the queue would be: 5 - 4 - 8 - 11 - 13 - 4 - 7 - 2 - 1. It will check node 13, 7, 2 and 1. 
 *This is a typical breadth first search(BFS) problem.
 */
public class PathSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TreeNode node7 = new TreeNode(7);
		TreeNode node2 = new TreeNode(2);
		TreeNode node1 = new TreeNode(1);

		TreeNode node11 = new TreeNode(11, node7, node2);
		TreeNode node13 = new TreeNode(13);
		TreeNode node42 = new TreeNode(4, null, node1);

		TreeNode node41 = new TreeNode(4, node11, null);
		TreeNode node8 = new TreeNode(8, node13, node42);

		TreeNode root5 = new TreeNode(5, node41, node8);
		
		PathSum sol = new PathSum();
		System.out.println(sol.hasPath(root5, 22));

	}
		
		public boolean hasPath(TreeNode root, int sumRequired){
			LinkedList<TreeNode> nodes = new LinkedList<TreeNode>();
			LinkedList<Integer> values = new LinkedList<Integer>();
			LinkedList<String> path = new LinkedList<String>();
			
			if(null == root){
				return false;
			}else{
				System.out.println("root = "+ root.value + ", sum = " + sumRequired);
				
				nodes.add(root);
				values.add(root.value);
				path.add(">"+root.value);
				
				while(!nodes.isEmpty()){
					printNodes(nodes);
					printValues(values);
					
					TreeNode curr = nodes.poll();
					int sumVal = values.poll();
					String p = path.poll();
					
					if(curr.left == null && curr.right == null && sumVal == sumRequired){
						System.out.println("node found = " + curr.value + ", with sum = "+ sumVal +", and path: "+ p);
						printPaths(path);
						return true;
					}
					if(curr.left != null){
						nodes.add(curr.left);
						values.add(sumVal + curr.left.value);
						path.add(p+">"+curr.left.value);
						System.out.println("node added = "+ curr.left.value + ", with Sum added = "+ (sumVal + curr.left.value));
					}
					if(curr.right != null){
						nodes.add(curr.right);
						values.add(sumVal + curr.right.value);
						path.add(p+">"+curr.right.value);
						System.out.println("node added = "+ curr.right.value + ", with Sum added = "+ (sumVal + curr.right.value));
					}
					
				}
			}
			
			return false;
		}

		private void printValues(LinkedList<Integer> values) {
			for (Iterator iterator = values.iterator(); iterator.hasNext();) {
				Integer integer = (Integer) iterator.next();
				System.err.println("values>>"+integer);
			}
		}

		private void printNodes(LinkedList<TreeNode> nodes) {
			for (Iterator iterator = nodes.iterator(); iterator.hasNext();) {
				TreeNode treeNode = (TreeNode) iterator.next();
				System.err.println(">>" + treeNode.value);
			}
		}

	private void printPaths(LinkedList<String> nodes) {
		for (Iterator iterator = nodes.iterator(); iterator.hasNext();) {
			String treeNode = (String) iterator.next();
			System.err.println(">>" + treeNode);
		}
	}
}
