/**
 * 
 */
package problems.arrays;

/**
 * @author amruta.kajrekar
 * leetcode problem #485
 */
public class MaxConsecutiveOnes {

	public static void main(String[] args){
        int[] nums ={1}; 
//        	{1,1,1,0,0,0,0,1,0,0,1,0,1,1,1,1,1,0,1,0,0,1,1,0,0,0,0,1,0,1,1,0,0,0,0,1,1,1,0,0,0,1,1,1,1,1,0,0,1,1,1,1,1,0,0,1,0,1,1,0,1,1,0,1,0,1,0,0,1,0,0,0,0,1,0,0,0,1,0,1,0,0,0,0,1,1,1,0,1,0,1,1,1,1,0,1,0,0,0,0,0,0,1,0,1,0,1,1,1,1,0,1,0,0,1,1,1,0,1,0,1,1,1,1,0,0,0,0,1,0,0,0,0,1,1,0,0,0,1,0,0,0,0,1,1,0,1,0,0,0,0,0,1,1,0,1,1,1,0,0,0,0,0,0,1,1,0,1,0,1,0,1,0,0,0,0,1,0,0,0,0,1,0,1,0,0,1,1,1,1,1,1,0,1,1,1,0,0,1,0,1,1,0,1,1,0,1,1,0,1,0,0,0,1,0,0,0,1,0,1,1,1,1,0,0,1,1,1,0,1,0,1,0,0,0,0,1,0,1,0,1,0,1,1,0,1,0,1,1,0,0,0,0,0,0,1,0,0,1,0,1,0,0,1,1,0,1,0,0,0,0,1,0,0,1,0,0,1,0,1,0,0,0,1,0,1,0,1,0,1,1,1,0,0,1,0,0,1,0,1,0,1,0,1,1,1,0,1,0,0,0,1,1,0,1,1,0,0,1,1,0,0,0,0,1,1,1,1,1,0,1,1,0,1,1,1,0,0,0,0,1,1,0,1,1,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,1,1,0,1,1,0,1,1,0,0,0,0,1,0,0,1,0,0,1,0,0,0,1,0,0,1,0,0,1,0,0,0,1,0,1,0,1,0,0,0,1,1,0,1,1,0,0,0,1,0,0,0,0,1,1,0,0,1,0,1,1,1,0,0,0,0,1,1,1,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,0,0,1,0,0,1,1,0,0,1,0,1,1,0,1,1,1,1,0,0,0,1,0,1,0,0,1,0,0,0,0,0,0,1,0,0,0,1,1,1,1,0,1,1,0,0,1,1,0,0,1,0,1,0,0,0,0,1,0,0,1,0,1,1,0,0,1,0,0,0,1,1,0,1,0,0,0,1,1,0,0,1,0,1,0,1,1,1,0,0,1,0,1,0,1,1,0,1,0,1,1,1,0,1,1,0,1,1,1,1,0,1,0,0,0,1,1,0,0,0,1,1,1,1,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,1,1,0,1,1,1,1,0,1,1,0,1,0,1,1,1,0,0,0,0,1,0,0,0,1,1,1,1,0,1,1,0,0,1,1,0,1,1,1,1,1,1,0,0,0,1,0,1,0,1,1,1,0,1,1,1,1,1,0,1,0,0,1,0,1,1,1,1,1,0,0,0,0,0,1,0,0,1,1,1,1,1,1,1,1,0,1,1,1,0,0,1,0,0,0,0,1,1,0,0,1,1,0,1,0,0,0,1,0,1,0,0,1,0,1,1,1,0,0,0,1,0,1,1,1,1,1,0,0,1,1,1,1,0,0,1,1,1,1,1,0,1,1,1,0,1,1,0,1,1,0,1,0,1,0,1,0,1,0,1,0,0,1,0,1,0,1,0,0,0,0,1,0,1,0,1,0,1,1,0,0,0,0,1,0,1,0,0,0,1,1,0,1,1,1,1,1,0,1,0,1,1,1,0,1,0,1,1,1,0,0,0,1,1,0,0,0,0,1,0,1,1,1,0,1,1,1,1,0,1,0,1,0,1,0,0,0,1,1,1,0,1,0,0,1,0,1,0,0,0,1,0,1,1,0,0,0,1,0,0,0,1,1,1,0,1,0,1,1,0,0,1,1,0,1,1,0,1,0,0,1,0,0,1,1,1,1,1,1,0,1,0,1,0,1,0,1,0,1,0,0,0,0,0,0,1,1,0,0,0,1,1,0,1,1,1,0,0,0,0,0,0,0,1,0,1,1,1,1,1,0,1,1,1,0,1,0,1,0,1,0,1,0,0,0,1,0,1,1,0,0,0,1,1,0,1,0,1,0,1,0,1,0,0,1,1,1,1,1,1,1,0,1,0,0,0,1,0,1,0,0,1,0,1,0,1,1,1,0,1,0,0,0,1,0,0,0,1,1,0,1,0,1,0,0,0,1,1,0,0,1,1,0,0,1,1,1,1,0,0,1,0,1,0,0,0,1,0,0,0,1,1,0,1,1,1,1,0,0,0,1,0,1,0,0,1,1,0,0,0,1,1,1,1,1,0,0,1,1,1,0,1,1,0,1,0,1,1,0,1,0,1,0,0,1,1,1,1,0,1,1,0,0,0,1,0,1,0,0,1,1,1,1,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,1,1,1,0,1,0,1,0,0,1,1,1,0,1,0,1,1,0,1,1,0,0,1,0,0,1,0,0,1,1,1,0,0,1,0,1,0,1,1,0,1,0,1,1,1,1,1,1,1,0,0,1,0,0,0,0,1,1,0,1,1,0,0,0,1,1,1,1,0,0,1,0,0,1,0,0,1,1,0,0,1,0,1,0,0,0,1,0,1,0,1,0,0,1,1,0,1,0,1,1,1,1,0,1,0,0,1,0,1,1,0,0,1,1,1,0,1,0,0,1,0,1,0,0,0,0,1,0,0,0,1,0,0,1,1,1,0,1,0,0,1,1,0,1,0,1,0,0,1,0,1,1,1,1,1,0,1,0,0,1,1,0,1,1,0,0,0,1,0,1,1,1,1,0,0,1,1,0,1,1,1,0,0,1,0,0,1,1,1,0,0,0,1,0,1,1,0,1,1,0,1,0,0,1,0,1,1,0,0,0,0,1,0,1,1,1,0,0,0,1,0,1,0,0,1,0,1,1,0,0,1,0,1,0,1,0,1,0,0,1,0,0,0,0,0,0,0,0,1,0,0,1,0,1,0,1,0,0,1,1,1,0,0,1,0,0,1,1,0,1,0,1,0,0,1,0,0,0,1,0,1,0,0,0,1,1,1,1,1,0,1,0,0,0,1,0,1,0,0,1,1,0,0,1,0,0,0,0,0,1,0,0,0,0,1,1,1,1,0,0,1,0,0,0,0,1,1,0,0,1,1,0,1,0,1,0,0,1,0,1,1,0,1,0,1,1,1,0,1,0,0,0,0,0,1,0,1,1,1,0,1,1,0,0,0,0,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,1,0,1,0,1,0,1,0,1,1,0,1,0,1,0,0,0,1,0,0,1,0,1,0,1,0,1,1,0,1,0,1,1,0,1,1,0,0,0,0,1,1,0,1,0,0,1,1,1,1,0,1,0,0,1,0,0,1,1,1,0,1,0,1,1,1,0,1,0,1,1,1,0,1,1,1,0,1,1,1,1,0,1,1,1,0,0,0,1,0,0,0,1,1,1,1,1,1,1,1,1,0,1,0,1,1,0,1,0,0,0,0,0,0,1,1,1,0,1,0,0,1,1,0,1,0,1,0,0,1,0,0,1,1,0,0,0,1,0,0,1,1,1,1,0,1,0,1,1,1,1,1,1,1,0,0,0,0,0,0,1,0,0,1,0,1,1,0,1,1,0,1,0,0,1,0,1,0,1,1,0,0,1,1,1,1,0,0,0,1,1,1,1,1,1,0,0,1,1,1,0,1,0,1,1,1,0,1,1,1,1,0,1,1,0,1,0,0,0,1,0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,1,1,1,0,0,1,1,0,1,0,0,1,1,0,1,0,0,0,1,1,0,0,1,1,0,1,1,1,1,1,1,1,0,1,1,1,1,0,1,0,1,0,1,1,0,1,1,1,0,0,1,0,1,1,1,1,1,0,1,0,1,1,0,1,0,1,0,0,0,1,0,1,0,0,1,0,1,1,1,0,0,0,1,0,0,0,1,1,1,1,0,1,0,0,0,0,0,1,0,0,0,1,0,0,1,0,0,0,0,1,0,1,0,0,1,0,0,0,0,0,0,1,0,1,1,1,0,0,1,1,0,1,0,0,0,1,1,0,0,0,0,0,1,0,1,1,1,0,0,0,0,0,1,0,1,1,1,0,0,1,1,1,1,0,1,1,0,1,1,1,1,1,1,0,1,1,0,1,0,0,1,1,0,0,1,0,1,0,1,0,1,0,1,0,0,0,0,1,0,0,0,0,1,1,0,1,1,1,0,1,0,0,0,1,0,1,0,0,1,1,1,0,1,1,0,0,1,1,1,0,0,0,1,0,0,0,0,0,1,1,0,1,1,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,1,0,0,1,0,0,1,0,1,1,1,1,0,0,1,0,0,0,0,0,1,1,1,0,0,1,0,0,1,0,0,1,1,0,1,1,1,1,1,0,0,0,0,1,0,1,0,1,1,1,0,1,1,1,0,1,0,1,1,1,0,0,0,1,1,1,0,0,0,1,1,0,0,0,0,0,1,0,1,1,1,0,1,0,0,1,1,1,0,0,0,1,1,0,0,1,1,0,1,1,0,0,0,0,0,1,1,1,1,0,0,0,1,0,1,0,1,1,1,1,1,0,1,1,1,0,0,0,0,0,1,0,0,1,1,1,1,1,0,1,1,0,0,0,1,1,0,0,1,1,0,0,1,1,0,0,1,1,1,1,1,0,0,1,1,0,0,1,1,1,1,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,1,1,0,1,1,0,1,0,1,1,1,1,0,1,1,1,0,0,0,1,0,0,1,1,1,1,1,1,1,0,0,1,1,0,1,0,1,0,1,0,1,1,1,1,1,0,1,1,1,1,0,1,0,0,0,1,0,0,0,0,1,0,0,1,0,0,1,1,1,1,0,1,1,1,0,0,0,0,1,0,1,0,1,1,0,1,0,0,1,0,0,1,0,0,0,0,1,1,1,1,1,0,1,1,0,0,1,1,0,0,0,0,0,1,1,0,1,1,0,0,1,1,1,0,0,0,1,0,1,0,1,0,0,1,0,0,0,0,1,1,0,0,0,1,0,1,1,1,0,1,0,0,0,0,0,0,0,1,0,0,0,1,0,0,1,0,1,0,1,0,0,0,1,1,0,1,0,1,0,0,1,0,0,0,1,1,0,1,1,1,0,0,1,0,0,0,1,1,0,1,0,0,0,0,1,0,0,0,1,1,1,0,1,1,1,1,0,0,0,0,0,0,1,1,0,0,0,0,1,0,0,1,1,1,0,0,1,1,1,1,1,1,0,0,0,1,0,1,0,1,0,1,1,1,0,0,0,1,1,1,1,0,0,1,1,0,0,0,1,1,1,1,0,0,1,0,1,1,0,0,0,0,0,0,1,0,1,1,0,1,1,0,0,0,0,1,0,0,1,1,0,0,0,1,0,1,1,1,0,1,1,0,1,1,0,1,1,0,1,0,1,1,0,0,1,1,0,1,0,1,0,1,0,0,1,1,1,0,0,1,1,1,0,0,1,1,1,0,0,0,0,1,1,0,1,0,1,0,1,0,1,0,0,0,1,1,1,0,0,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,1,1,1,0,0,0,1,1,0,1,1,0,1,0,0,1,1,0,1,0,0,0,0,0,1,1,0,1,1,0,1,0,1,1,1,0,0,0,0,1,1,0,0,0,1,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,0,0,1,1,1,1,1,1,1,1,1,0,1,0,0,0,1,0,1,0,0,1,0,0,1,0,0,0,0,0,0,1,1,1,1,1,1,0,1,0,0,0,1,0,0,0,0,0,0,1,0,1,1,0,0,1,0,0,0,0,1,1,0,1,0,0,1,0,1,1,0,1,0,1,0,0,1,0,1,0,1,0,1,1,0,1,0,1,0,0,1,1,0,0,0,0,0,0,1,1,0,0,0,0,0,1,1,1,1,0,1,0,1,1,0,1,0,0,0,0,0,0,1,1,1,1,1,1,0,1,1,0,1,0,1,1,1,0,1,0,0,1,0,0,1,1,0,0,1,1,0,0,0,1,1,1,1,0,1,0,0,1,1,0,1,0,0,0,1,1,1,1,0,1,1,1,0,0,0,0,1,1,1,1,1,1,0,0,0,1,1,0,0,1,0,0,0,1,1,1,0,0,0,0,0,1,1,1,1,0,0,1,0,1,0,1,1,1,0,1,1,0,0,1,0,1,0,0,0,1,1,1,0,0,1,0,1,1,1,1,1,1,0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,0,1,0,0,1,0,0,1,0,0,0,1,0,1,0,0,1,0,0,1,1,1,1,0,1,1,0,1,0,0,0,1,0,0,1,0,1,1,0,1,0,0,0,1,1,0,0,0,0,0,0,0,1,1,1,0,0,1,1,0,0,1,0,0,0,1,0,1,1,1,1,1,0,1,1,0,1,0,1,0,0,1,0,1,1,0,0,0,0,1,1,0,1,1,0,1,1,0,1,0,0,0,0,0,1,0,1,1,0,1,0,0,1,0,1,0,1,1,0,1,1,1,0,0,1,1,1,0,1,0,0,1,0,0,1,0,0,1,1,0,1,0,0,1,1,1,1,0,0,1,1,1,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,1,0,0,1,0,0,1,0,0,1,0,1,1,1,1,1,0,1,0,1,0,1,1,1,1,0,1,0,0,0,1,1,0,0,1,1,0,1,1,1,1,1,0,1,1,0,1,1,0,0,0,0,0,1,1,1,1,0,1,1,1,0,0,1,0,1,1,0,0,0,0,1,0,0,0,0,0,1,1,1,0,1,1,0,0,1,0,0,0,1,1,0,0,0,1,0,1,1,0,1,1,0,0,0,1,1,0,1,1,1,0,0,0,1,1,1,1,0,0,1,1,0,0,1,0,0,0,0,0,0,1,0,0,0,0,1,1,1,1,0,0,1,0,1,0,0,0,1,1,0,0,0,0,0,0,1,1,1,0,0,1,0,0,0,0,0,0,0,1,0,0,1,0,0,1,1,1,0,1,1,0,1,1,0,0,1,0,1,1,0,0,1,0,0,0,0,0,0,1,1,0,1,1,1,0,0,0,0,1,0,0,0,0,0,0,1,1,0,0,0,1,0,0,1,1,1,0,1,0,1,0,1,1,0,1,0,0,1,1,1,0,1,1,0,1,0,1,1,0,0,0,0,1,0,0,0,1,0,0,0,0,1,0,0,1,0,1,1,1,1,0,0,1,0,1,1,0,0,1,1,1,1,1,0,0,0,1,0,1,0,1,1,1,1,1,0,0,0,1,1,1,0,0,0,0,1,0,1,0,0,1,0,1,1,0,1,0,0,1,1,0,0,1,0,1,1,0,1,1,1,1,0,0,1,0,0,1,1,0,0,0,1,1,1,1,0,1,1,0,1,0,1,0,1,1,0,0,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,0,1,0,1,1,0,0,0,1,0,0,1,1,0,0,0,1,1,0,0,0,1,0,1,0,1,0,1,1,1,1,0,0,1,0,1,0,0,0,0,0,0,0,1,0,1,0,0,1,0,1,0,0,1,1,0,0,0,0,0,1,1,1,1,0,1,1,0,1,0,0,0,1,0,0,1,0,1,0,0,1,0,0,0,0,0,1,1,0,1,1,0,0,0,1,1,1,0,0,0,1,0,1,0,0,0,1,0,0,0,0,0,1,0,1,1,0,0,1,0,1,1,0,1,1,0,1,1,1,0,1,0,1,1,1,1,1,0,1,0,1,1,0,0,1,1,1,1,1,0,1,1,0,1,0,1,0,1,0,0,1,0,0,0,1,1,0,1,1,1,1,0,1,1,1,0,0,1,0,0,1,1,1,1,0,1,1,1,0,1,0,1,1,1,1,0,0,0,1,1,0,1,1,1,0,0,0,0,1,0,1,1,0,0,0,1,0,0,0,1,0,1,0,0,0,1,0,1,1,1,1,1,1,0,1,1,0,0,1,0,0,0,1,0,1,1,1,0,1,0,0,0,0,1,0,1,0,0,1,0,1,1,0,0,1,0,0,1,0,0,0,0,1,1,0,0,0,0,1,0,1,1,1,1,0,1,1,0,1,0,0,1,0,0,1,0,1,1,1,0,0,1,0,1,1,1,1,0,1,1,1,1,1,1,1,1,0,1,1,1,0,1,1,0,0,1,0,1,1,0,0,0,0,1,0,1,0,1,1,1,0,1,0,0,1,1,1,1,1,0,0,0,0,1,1,1,0,1,0,1,1,0,0,0,1,0,0,0,1,1,0,0,1,0,1,0,0,1,0,1,1,1,1,1,0,1,0,0,1,0,0,0,1,1,0,1,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,1,0,0,0,1,1,1,0,1,1,1,1,0,1,0,1,0,0,0,0,0,0,1,1,1,0,0,1,0,0,0,1,0,1,0,0,0,0,1,1,0,1,1,0,1,1,0,1,1,0,1,0,1,0,1,0,0,1,1,1,1,0,1,1,1,1,1,0,1,0,1,0,1,0,0,0,1,1,1,0,1,0,1,1,1,0,1,1,0,0,0,1,0,0,0,1,1,0,0,1,0,0,0,1,1,1,0,1,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,1,1,1,0,1,1,1,1,0,0,1,0,0,0,1,1,1,1,1,1,1,1,0,1,1,0,1,1,1,1,1,1,0,1,0,0,1,0,1,1,1,0,1,0,0,1,0,0,1,0,0,0,1,1,1,1,0,1,0,0,0,0,1,0,1,1,0,1,1,1,0,1,0,0,1,0,0,1,0,0,0,0,0,0,0,1,1,0,1,0,1,1,0,0,0,0,1,1,0,0,1,0,1,0,1,1,1,1,1,0,1,1,0,1,0,1,1,0,1,1,1,0,1,0,0,0,0,0,1,0,1,0,0,0,1,1,1,0,1,1,1,0,0,0,1,1,0,1,0,0,0,1,0,0,1,0,1,1,0,0,0,0,1,1,1,0,0,0,1,0,0,0,0,1,0,0,1,1,0,0,1,1,1,1,0,0,0,1,1,0,1,0,1,1,1,1,1,0,1,1,1,1,0,1,1,1,0,0,1,0,0,1,1,0,0,0,1,0,1,1,0,1,1,0,1,1,1,1,0,0,0,1,1,0,0,1,1,0,1,1,0,0,0,0,1,1,0,0,0,1,1,1,1,0,1,1,0,0,1,1,1,0,1,0,1,0,0,0,1,1,0,0,0,1,0,0,1,0,0,1,1,0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,1,1,1,0,1,1,0,0,0,0,1,1,1,1,0,1,0,0,0,1,0,0,0,0,1,1,1,0,0,1,0,1,1,0,1,0,1,1,0,1,1,0,0,1,0,0,1,1,0,0,0,0,1,1,0,0,1,0,0,1,0,0,1,0,0,1,1,1,0,1,1,0,1,0,1,0,1,1,1,1,1,0,0,0,0,1,0,1,0,0,1,1,0,1,1,0,0,0,1,0,0,0,1,0,0,0,1,1,0,1,0,0,1,0,1,0,1,0,0,0,0,0,0,0,0,0,1,1,0,0,1,0,1,0,0,0,1,0,0,1,0,1,1,0,1,0,1,0,0,1,1,1,0,0,1,1,1,0,1,1,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,1,1,0,0,0,1,1,0,1,1,0,0,1,1,0,0,1,0,1,0,1,1,0,0,1,1,0,0,1,1,0,0,0,1,0,1,0,0,0,0,0,1,1,0,1,1,0,0,1,1,1,1,1,0,0,1,1,0,1,0,0,1,0,0,1,0,1,0,1,0,1,0,1,1,1,1,1,1,1,0,1,1,1,0,1,0,1,1,0,0,0,0,0,1,1,0,0,1,1,1,1,0,1,1,0,1,1,1,1,1,0,1,0,1,0,0,0,0,1,1,0,0,1,1,0,1,0,1,0,1,0,1,1,1,1,1,1,0,0,0,1,0,1,0,1,0,1,1,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,1,1,0,1,0,1,1,0,0,1,1,0,1,1,1,0,0,1,0,1,0,0,0,0,1,0,1,1,0,1,1,1,0,1,0,1,1,0,1,0,1,1,0,0,1,0,0,1,1,0,1,1,1,1,0,0,0,0,1,0,1,0,0,1,0,1,1,1,0,1,1,1,0,0,0,0,1,1,0,1,1,1,0,0,1,1,0,0,1,0,0,1,0,0,1,1,1,1,0,1,1,0,1,0,1,1,0,1,0,1,0,0,1,1,0,0,1,0,0,0,1,0,0,0,1,0,0,1,0,0,1,1,1,1,1,1,0,1,0,1,0,1,1,0,0,1,1,0,0,0,0,0,1,0,0,1,0,0,1,1,0,1,1,1,0,0,0,0,0,1,0,0,1,1,0,1,1,0,0,1,0,0,1,0,1,1,0,0,1,1,1,1,1,0,1,1,0,0,1,1,1,1,0,1,0,0,1,1,1,1,1,0,1,0,1,1,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,0,1,0,0,1,1,1,0,0,0,1,0,0,1,0,0,1,0,1,0,0,0,1,1,1,1,1,0,0,1,1,0,1,0,0,1,0,0,1,0,0,1,1,0,0,0,0,0,1,0,1,1,0,0,1,0,0,0,0,1,1,0,0,1,1,1,1,1,1,0,1,0,0,0,1,0,1,0,1,1,1,1,0,1,1,0,0,0,1,0,1,0,0,1,1,0,0,1,1,0,0,1,0,1,1,1,1,0,0,1,1,1,1,1,0,0,0,1,0,1,0,0,0,0,0,1,1,1,1,0,1,0,0,0,0,1,0,0,1,1,0,1,0,1,0,0,0,1,0,1,1,1,0,0,1,0,1,0,0,0,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,0,1,1,0,1,0,1,1,0,0,1,1,1,0,0,0,0,1,0,0,1,0,0,1,0,0,0,1,1,1,0,1,1,0,0,0,1,1,1,0,1,1,0,1,0,0,0,0,1,0,0,1,1,1,0,1,1,1,1,1,1,0,0,0,0,0,1,0,0,1,0,1,1,0,1,1,1,1,0,1,0,0,1,1,0,0,0,0,0,1,0,0,1,1,0,0,0,1,0,1,0,0,0,1,0,0,1,0,1,0,0,0,1,1,1,0,0,1,1,0,1,0,1,0,1,0,0,0,1,0,0,0,0,0,0,1,1,0,1,1,1,0,0,0,0,1,0,1,1,1,0,0,0,0,1,0,0,0,1,0,1,1,1,1,1,1,1,0,1,1,0,0,1,1,1,1,0,0,1,1,0,1,0,1,1,1,1,0,0,1,1,1,0,0,1,1,0,0,1,1,1,1,0,1,0,0,1,0,0,1,0,1,1,0,1,0,0,0,0,0,1,1,0,1,0,1,1,0,0,1,0,0,0,1,0,0,1,1,1,1,1,1,1,0,1,1,0,1,0,1,1,1,0,1,1,1,1,1,1,0,1,0,1,1,0,0,0,1,1,1,1,1,1,0,1,0,1,0,0,1,1,0,1,0,0,1,1,1,0,0,0,1,1,1,0,1,0,0,0,1,0,1,0,1,1,1,1,0,0,1,0,1,1,1,1,1,0,0,1,0,0,0,1,0,0,1,1,1,1,1,1,0,0,1,1,1,0,0,1,0,1,0,1,1,0,1,0,0,1,0,0,0,0,0,1,1,1,0,0,0,1,1,0,0,1,0,1,1,0,1,0,1,0,0,1,0,1,1,0,0,0,0,1,1,0,1,0,1,0,1,1,1,1,0,0,0,0,1,0,1,0,0,0,1,1,0,1,0,1,1,1,1,1,1,0,0,0,1,1,1,1,0,1,1,0,1,1,1,1,1,1,0,1,1,0,1,0,1,0,1,1,1,0,0,1,1,0,0,1,1,0,1,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,1,0,1,0,0,0,1,1,1,0,1,0,1,1,1,1,0,1,0,0,0,1,0,0,0,1,1,0,1,1,0,0,0,0,1,1,1,0,0,1,1,0,0,1,1,0,0,0,0,0,0,1,1,0,1,0,1,1,0,0,0,0,1,0,1,1,1,1,1,0,0,0,0,0,1,0,1,0,1,1,1,1,0,0,0,0,0,0,0,1,0,0,1,1,0,1,1,0,1,1,0,0,1,1,1,0,1,1,0,0,1,1,0,1,1,1,1,0,1,1,0,0,0,0,0,0,1,0,1,1,1,0,0,0,1,0,1,1,1,1,0,0,0,1,0,0,0,1,1,1,0,0,1,0,0,1,1,0,0,0,1,0,0,1,1,0,0,0,1,1,0,1,1,0,1,0,0,1,1,1,0,0,1,1,0,1,0,1,0,0,1,0,1,1,0,0,0,1,0,0,1,1,1,1,0,0,1,0,1,1,0,0,1,0,1,0,1,1,0,1,0,1,0,1,1,0,1,0,0,0,1,0,1,0,0,1,1,0,0,1,0,1,1,0,0,0,1,0,0,1,0,0,1,1,1,0,0,1,1,0,1,0,0,0,0,1,0,0,1,1,0,0,1,0,1,1,0,0,0,1,1,1,1,1,0,1,0,0,0,1,0,1,1,1,0,0,1,1,0,0,1,0,1,0,0,1,1,0,0,0,0,0,1,1,1,1,1,1,0,1,0,0,1,0,1,0,1,1,1,0,1,1,0,0,1,1,0,0,0,0,0,0,0,0,1,0,0,1,1,0,0,0,0,1,1,0,1,1,0,0,0,0,1,0,0,0,0,1,1,0,1,0,1,1,0,1,0,0,1,0,1,0,0,1,1,1,1,0,0,0,1,0,0,1,1,0,1,0,0,1,0,1,0,0,1,0,0,0,0,0,0,1,0,0,1,0,1,1,1,0,1,0,0,1,0,0,1,0,1,0,0,0,0,1,0,0,1,0,1,0,1,1,0,1,0,0,1,0,1,1,1,0,1,1,0,1,0,0,1,1,0,0,1,0,1,1,0,0,0,1,1,1,0,1,0,1,1,0,0,1,0,1,0,1,0,1,0,0,1,1,1,0,1,0,0,1,1,0,0,0,1,1,1,1,0,0,1,0,1,1,1,0,1,0,1,1,0,0,0,1,0,0,0,1,1,1,0,1,0,0,0,1,1,0,0,1,1,1,1,1,0,1,0,1,0,0,1,0,0,1,1,0,0,1,0,0,0,1,0,1,0,0,0,0,0,0,0,1,1,1,0,0,0,1,1,1,1,1,0,0,0,0,1,0,1,0,0,0,1,0,1,1,1,0,1,0,0,0,0,1,0,0,0,0,0,1,1,0,0,1,0,1,0,1,0,1,0,1,0,0,0,1,0,0,0,1,1,0,0,0,0,1,1,0,0,1,1,1,1,1,1,0,1,0,0,0,1,1,1,0,0,1,0,0,1,0,1,1,1,0,1,0,1,0,0,1,1,0,1,0,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,0,0,1,0,0,1,1,0,1,0,1,1,0,1,1,1,0,1,0,1,1,0,1,1,1,1,1,0,1,0,1,1,0,1,1,1,1,0,1,1,1,0,1,1,1,1,1,1,1,0,0,1,0,0,0,0,0,1,1,1,1,0,1,1,0,1,1,0,1,1,1,1,1,0,1,0,1,1,1,1,0,1,1,1,1,0,1,0,0,1,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,1,0,1,1,0,1,0,0,0,1,0,0,0,0,0,1,1,0,0,1,0,1,0,1,1,0,0,0,0,1,0,0,1,0,0,0,0,0,0,1,1,1,0,0,1,0,1,0,0,1,0,0,1,1,1,0,0,0,0,1,1,1,0,0,0,1,1,1,0,1,0,0,1,1,0,0,0,0,0,0,1,1,0,0,0,0,0,1,0,0,0,0,1,1,0,1,0,1,1,1,0,1,0,1,1,1,1,1,1,0,0,1,0,1,1,1,1,0,1,1,0,1,0,0,0,0,1,0,1,1,0,1,0,0,1,0,0,1,0,1,0,1,1,1,0,1,0,1,0,0,1,0,1,0,1,0,1,0,1,0,0,0,1,0,0,1,0,1,1,0,0,1,0,1,0,0,1,0,0,0,1,0,1,0,0,0,1,1,0,1,0,0,1,0,0,0,0,0,0,1,0,1,1,1,0,1,1,1,1,1,0,1,1,0,1,1,1,1,0,1,1,1,0,0,1,1,1,0,1,1,1,0,1,1,1,0,0,0,1,1,1,1,0,1,0,0,1,0,0,1,0,0,0,0,1,1,0,1,0,0,1,0,1,1,0,0,1,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0,0,1,0,1,1,1,1,0,1,1,0,0,1,1,0,0,1,0,0,1,0,0,0,0,0,1,1,0,0,1,0,0,0,0,0,1,0,0,0,0,0,1,1,0,1,1,1,0,1,1,1,1,0,1,0,1,0,1,1,0,1,1,0,0,1,1,1,1,0,0,0,1,0,1,0,0,0,1,1,0,1,1,1,1,0,1,0,0,0,1,0,1,1,0,0,1,1,0,0,1,0,0,1,0,0,1,0,0,0,0,0,0,1,0,0,1,0,1,1,0,0,0,1,0,0,0,0,0,1,1,1,0,1,1,0,1,1,1,1,1,1,1,0,1,1,0,1,0,0,0,1,1,1,0,1,0,0,0,0,1,1,0,0,0,0,1,0,0,0,1,0,1,1,0,1,1,1,0,1,0,0,1,1,1,0,0,1,0,1,0,1,1,1,1,1,0,1,0,1,0,1,1,0,1,1,0,1,1,0,0,0,0,1,0,1,1,1,0,1,0,1,1,0,1,0,0,0,0,0,1,0,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,1,1,1,0,1,1,0,1,0,1,1,0,0,0,1,1,0,1,0,1,1,1,1,0,0,0,0,1,0,0,0,0,0,0,1,1,1,0,0,0,1,0,0,0,1,0,1,1,0,1,1,0,0,0,0,1,1,1,1,0,1,0,1,1,0,1,1,1,1,0,1,0,0,0,1,0,1,1,0,1,1,0,1,1,0,1,1,0,1,1,1,1,1,1,0,1,1,1,0,1,1,1,0,0,1,1,0,1,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,1,1,0,0,0,1,1,1,0,0,1,0,1,0,0,0,1,0,0,1,1,1,0,1,0,0,0,1,1,1,1,1,1,0,0,1,0,1,1,0,1,0,1,0,0,1,0,1,0,0,1,0,0,1,1,1,0,1,0,0,1,1,0,0,0,0,0,0,0,0,0,1,1,1,1,0,1,1,0,1,0,1,1,1,0,1,1,1,1,0,0,1,1,0,0,1,0,0,1,0,0,1,1,1,1,0,0,1,0,0,0,1,1,0,0,1,1,0,1,0,1,0,0,1,1,0,0,0,1,0,0,0,0,0,0,1,1,1,0,1,0,1,1,1,1,1,0,0,1,1,1,0,0,0,0,0,1,1,0,0,0,1,0,1,1,0,0,0,0,0,1,0,1,0,0,0,0,1,1,1,1,1,1,1,1,1,0,1,0,1,0,1,1,0,1,1,1,0,1,1,1,0,1,0,1,0,1,1,0,0,0,0,0,1,0,0,1,0,1,0,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1,0,0,1,1,0,0,1,1,0,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,1,1,1,1,1,0,1,1,1,1,1,0,1,0,0,0,1,0,1,0,0,1,1,1,0,0,1,0,0,1,1,0,1,0,0,0,0,1,1,1,0,0,0,0,1,0,0,0,1,1,1,1,0,0,1,1,0,1,0,0,1,0,0,0,0,1,1,0,1,1,1,0,0,0,0,0,0,0,0,0,0,1,0,1,0,1,0,1,0,1,0,1,0,1,1,0,0,0,0,1,0,0,1,1,0,1,1,0,0,1,0,1,1,0,1,0,0,0,1,1,1,0,1,1,1,0,0,0,0,1,0,0,1,0,1,1,1,1,1,0,0,0,0,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,0,1,1,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,1,0,1,0,1,0,0,1,0,0,1,1,1,1,1,0,0,0,1,0,0,1,1,0,0,1,0,1,1,1,1,1,0,1,0,0,1,1,0,0,0,1,1,0,1,0,1,1,1,1,1,1,0,1,0,0,1,0,1,1,0,0,1,1,1,0,1,1,0,1,1,0,0,0,0,1,0,0,1,0,0,1,1,1,0,0,0,0,0,1,1,1,1,1,1,1,0,1,0,0,1,1,0,0,1,1,1,1,0,1,0,1,1,0,0,1,1,1,0,0,0,1,0,1,1,0,0,1,1,0,1,1,1,1,0,0,1,0,0,0,1,0,1,0,1,0,0,1,0,1,1,1,1,1,0,1,0,1,1,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,1,0,0,1,1,0,0,0,0,0,1,0,1,0,0,1,1,1,0,1,1,1,1,0,1,0,1,0,0,1,1,1,1,0,1,0,0,0,1,0,0,1,0,0,0,0,0,1,0,0,1,0,1,1,0,0,0,1,0,1,0,1,0,0,1,0,1,0,0,0,0,1,0,1,0,1,1,0,0,0,0,1,0,0,0,1,0,0,0,1,0,0,1,1,1,1,1,1,0,1,0,0,1,0,1,1,1,1,0,0,1,0,0,1,0,0,0,0,1,0,0,1,1,0,1,0,0,0,0,0,1,1,1,0,0,0,1,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1,1,0,1,1,0,1,1,0,1,0,1,1,0,0,0,1,0,1,1,0,1,1,0,0,0,1,0,0,0,0,1,1,1,1,0,0,1,1,0,1,0,0,0,1,1,0,1,1,1,1,0,0,0,0,1,0,1,0,1,0,1,1,0,1,1,0,0,0,1,1,1,0,0,0,1,1,0,1,0,0,0,1,1,0,1,1,1,0,1,0,1,1,1,1,0,1,1,0,0,0,1,1,0,0,0,1,1,0,1,0,0,1,0,0,0,1,1,0,1,1,1,0,1,0,0,0,0,0,0,0,1,1,1,0,0,1,1,0,0,1,1,0,0,0,1,1,1,1,0,1,0,1,0,0,1,0,1,0,0,0,0,0,0,0,1,0,1,0,1,1,1,1,0,1,1,0,0,0,1,1,0,0,1,1,1,1,1,1,1,1,1,0,0,1,1,1,0,1,0,1,0,1,0,0,1,0,0,0,0,1,1,1,0,0,0,1,1,1,0,0,0,1,0,1,0,0,1,1,1,0,1,1,0,1,0,1,0,1,1,0,1,1,0,0,1,1,0,1,0,1,1,0,0,1,1,0,1,0,1,0,0,0,0,0,1,1,0,1,1,1,0,1,1,1,0,1,0,1,0,0,1,1,1,1,0,0,1,1,1,1,0,0,0,1,0,1,1,0,1,1,0,0,0,1,0,1,1,1,0,0,0,1,0,1,1,1,1,0,0,1,0,1,1,0,0,0,0,1,0,0,1,0,1,1,0,0,0,1,0,0,1,0,1,1,0,1,1,1,1,1,0,1,0,0,0,1,0,0,1,0,0,0,0,0,0,1,1,1,0,1,1,0,0,1,0,1,0,0,0,0,0,1,0,1,1,0,0,0,0,1,1,0,0,0,0,0,1,1,0,0,1,1,0,0,0,0,1,1,1,0,0,1,1,1,1,0,1,1,1,1,0,1,0,0,1,0,0,1,0,1,0,0,0,0,0,1,0,1,0,1,1,1,1,0,1,1,0,0,1,0,0,0,0,0,1,0,1,1,0,0,1,1,0,0,0,0,0,1,0,1,1,0,1,0,0,1,1,0,0,0,1,0,1,0,0,1,0,0,1,1,1,0,1,0,0,1,0,1,1,1,0,1,1,1,0,1,0,1,1,0,0,0,0,1,1,1,0,0,1,0,0,1,1,0,0,0,1,0,1,1,0,0,1,1,0,0,0,1,0,0,1,0,0,0,1,0,0,0,1,1,0,0,1,0,1,1,0,0,0,0,1,1,0,0,0,1,0,1,1,0,0,1,0,0,1,0,1,1,0,1,0,1,1,1,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,1,1,1,0,0,0,0,1,1,1,0,1,0,0,1,1,1,0,1,0,1,1,1,0,1,1,0,0,1,0,1,0,1,0,0,1,1,1,0,1,1,1,0,1,1,1,1,0,1,1,0,0,0,0,1,0,1,0,1,0,0,0,0,0,1,0,0,1,1,0,1,1,1,1,1,1,1,1,0,1,1,0,1,0,0,1,1,1,0,0,0,1,0,0,0,0,1,0,0,0,0,1,0,1,0,0,1,1,1,0,0,1,0,0,0,1,0,1,1,1,1,0,1,1,0,1,0,1,1,1,0,1,1,0,1,1,0,0,0,0,1,1,0,1,0,1,0,1,1,0,1,0,1,0,0,0,0,0,1,0,0,0,0,1,0,1,0,1,0,1,1,0,0,0,0,0,1,1,1,1,0,1,1,0,0,1,0,0,0,0,1,0,0,0,1,0,0,1,0,0,1,1,1,1,0,1,1,0,0,1,0,1,0,0,1,0,0,1,1,0,0,1,1,1,1,1,0,0,0,1,0,0,0,1,1,0,1,0,1,1,1,0,1,1,0,0,1,1,0,1,0,1,1,1,0,1,0,1,1,0,1,1,1,1,1,1,0,1,0,0,0,0,1,1,1,1,0,0,1,0,1,1,0,0,0,1,1,0,1,1,0,1,1,1,1,1,1,1,1,1,0,1,1,1,0,0,0,1,0,1,1,0,1,0,1,1,0,1,1,0,1,1,1,1,0,1,1,1,1,1,1,1,0,1,0,0,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,0,0,1,0,0,1,0,0,1,0,1,0,1,1,0,0,1,1,1,1,0,0,1,1,0,1,0,0,0,0,1,1,1,1,0,0,0,1,1,0,0,0,0,0,1,1,1,0,0,1,0,0,1,0,1,1,0,0,0,0,1,1,1,1,0,0,1,0,0,0,1,0,0,1,1,0,0,0,1,1,1,0,0,0,1,1,1,1,0,1,1,0,0,1,0,1,0,1,0,0,0,0,1,1,1,0,0,1,0,1,0,0,1,1,1,0,1,0,0,1,0,1,0,1,0,0,0,0,0,0,0,1,0,0,1,1,0,0,1,0,0,1,0,0,0,0,0,1,1,1,0,0,1,1,1,0,1,1,0,1,0,0,1,0,1,0,0,1,0,1,0,0,1,0,1,0,1,1,0,1,0,1,1,0,1,1,0,1,1,0,1,0,1,0,1,0,1,0,1,1,1,1,0,0,1,0,0,0,1,1,0,0,1,0,1,0,0,0,0,1,0,1,0,0,0,1,1,1,1,1,1,0,0,1,1,0,0,0,1,1,0,1,1,0,0,0,1,1,0,0,1,0,0,1,0,0,1,0,0,1,0,1,0,1,0,0,1,0,1,0,1,0,1,1,0,1,1,0,1,0,1,1,0,1,0,0,0,1,1,0,1,0,1,0,1,0,0,0,1,1,1,0,0,0,1,1,1,0,0,0,0,0,1,0,1,1,0,1,1,1,1,1,1,1,0,1,0,1,1,1,0,1,0,0,0,1,1,1,1,1,0,0,1,0,0,0,0,1,0,0,0,1,0,1,1,0,1,1,0,1,1,0,1,1,1,0,0,1,1,0,0,1,1,1,1,0,1,0,1,1,1,1,0,0,0,0,0,1,1,0,1,1,1,1,1,0,0,1,0,1,1,1,0,1,0,1,0,0,1,1,0,0,0,1,0,0,0,0,0,1,0,1,0,1,1,1,1,0,0,0,0,1,0,1,0,0,1,1,0,0,1,1,0,1,1,1,1,0,1,1,1,0,1,0,0,0,0,0,0,0,1,0,1,0,1,0,0,1,1,1,0,1,1,1,0,1,0,0,0,1,1,0,0,0,1,1,1,0,0,1,0,0,0,1,0,1,1,1,1,0,1,0,0,1,1,1,0,0,1,1,0,0,1,0,0,0,1,0,0,1,1,1,0,0,0,0,1,1,1,0,1,1,1,0,0,1,0,1,0,0,0,0,0,0,0,1,1,0,0,1,0,1,1,1,1,1,1,0,1,1,1,1,0,0,0,1,1,1,1,1,0,1,1,1,1,0,1,0,1,1,0,0,0,0,0,0,1,0,0,1,1,0,1,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,1,1,0,1,0,0,0,0,1,0,0,1,0,1,0,0,1,0,0,1,1,1,1,0,0,0,1,0,0,1,0,1,0,0,0,0,1,1,0,0,0,0,1,0,0,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,0,0,1,1,0,1,1,1,0,0,0,1,1,0,0,0,0,1,0,0,0,1,0,0,1,0,0,0,0,1,0,1,0,1,0,0,1,1,1,0,1,0,1,1,1,1,1,0,0,0,0,1,1,1,0,0,0,1,1,1,1,1,0,1,1,1,0,1,1,0,0,1,1,0,1,0,1,1,1,0,1,0,1,1,0,1,1,1,0,1,1,0,0,0,0,1,1,0,1,0,0,0,1,1,0,0,1,1,1,1,1,0,0,0,1,1,1,0,0,0,0,1,1,0,1,0,0,0,1,1,0,1,1,1,1,1,1,0,1,0,1,1,0,0,0,1,0,1,1,0,1,1,0,0,0,1,0,0,0,0,1,0,0,0,0,1,1,1,1,1,0,0,1,1,0,0,1,0,0,0,1,0,0,1,1,0,0,1,0,1,0,1,0,0,1,0,1,1,0,0,0,1,0,1,1,0,0,1,1,1,0,1,0,0,0,0,0,1,1,0,0,1,1,1,1,0,0,0,1,1,0,0,1,0,0,1,0,1,1,1,0,0,1,1,0,0,0,1,1,0,1,0,0,0,0,1,1,1,1,0,0,1,1,1,0,0,1,1,1,1,0,0,1,1,0,0,1,1,0,1,1,1,0,0,1,0,0,0,1,0,0,1,1,0,0,0,0,1,1,0,1,1,1,1,0,0,0,1,0,1,0,0,1,1,1,1,1,0,0,0,0,1,0,1,1,0,1,0,1,1,0,0,1,0,1,1,1,1,1,1,0,1,1,0,1,0,0,0,0,0,1,0,1,0,1,1,0,0,0,0,0,0,1,1,0,1,1,1,0,0,0,1,0,1,1,1,1,1,0,1,1,1,0,1,1,1,1,0,1,1,0,0,0,1,0,0,1,1,1,0,1,0,1,0,0,1,1,0,0,0,0,1,0,0,1,0,1,1,0,0,1,0,1,0,0,0,1,1,1,1,1,1,0,1,0,1,1,1,1,1,0,1,1,0,1,1,0,1,1,0,0,0,0,1,0,1,1,1,1,0,0,0,0,0,0,1,0,1,1,0,0,1,0,0,1,0,0,0,0,1,1,1,0,1,0,0,0,0,1,1,1,1,1,0,1,0,0,0,0,0,0,1,1,0,1,0,0,1,1,0,0,0,1,0,1,0,0,1,1,0,0,1,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,0,0,1,0,1,0,0,1,1,0,0,0,0,0,0,0,0,0,1,1,0,1,1,1,0,1,0,0,1,0,0,0,1,1,0,0,0,1,1,0,1,0,0,0,1,1,0,0,1,1,1,1,1,0,1,1,0,1,0,0,0,1,0,1,0,1,1,0,1,0,1,1,0,0,0,0,1,1,0,1,1,1,0,0,1,1,1,1,1,0,0,0,0,1,1,1};
        MaxConsecutiveOnes sol = new MaxConsecutiveOnes();
        System.out.println(sol.findMaxConsecutiveOnes(nums));
        
    }
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int[] counts = new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length; i++){
            if(nums[i]==1){
                counter++;
            }else{
            	counts[j]=counter;
            	j++;
                counter=0;
            }
        }
        if(counter>0){
        	counts[j]=counter;
        	counter =0;
        }
        
        for(int i=0;i<counts.length;i++){
        		if(counts[i]> counter){
        			counter = counts[i];
        	}
        }
        return counter;
    }
}
