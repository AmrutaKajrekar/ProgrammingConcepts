/**
 * 
 */
package problems.arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author amruta.kajrekar
 * leetcode problem #448
 */
public class FindDisappearedNum {

	
	public static void main(String[] args) {
		int[] nums = {4,3,2,7,8,2,3,1};
		FindDisappearedNum find = new FindDisappearedNum();
		List<Integer> res= find.findDisappearedNumbers(nums);
		String str = "[";
		for (Iterator<Integer> iterator = res.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			str = str+integer+",";
		}
		System.out.print(str.substring(0,str.length()-1)+"]");
	}
	
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> res = new ArrayList<Integer>();
	
		for(int i=1; i<=nums.length; i++){
			res.add(i);
		}
		
		for(int i=0; i<nums.length; i++){
			res.remove(new Integer(nums[i]));
		}
		
		return res;
    }

}
