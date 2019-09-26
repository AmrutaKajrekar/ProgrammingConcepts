package problems.arrays;

/**
 * @author amruta.kajrekar
 * leetcode problem #532
 */
public class KDiffPairs {

	public static void main(String[] args) {
		KDiffPairs diff = new KDiffPairs();
		int[] nums= {3,1,-3,-9,-8,-7,2,7,8,9};
		System.out.print(diff.findPairs(nums, 2));
	}

	public int findPairs(int[] nums, int k) {
		int count = 0;
		if(nums.length>=2){
		String[] res = new String[nums.length-1];
		for(int i=0;i<nums.length-1;i++){
			for(int j=i+1;j<nums.length;j++){
				if(Math.abs(nums[i]-nums[j]) == k){
					String str = "("+nums[i]+","+nums[j]+")";
					String strReverse = "("+nums[j]+","+nums[i]+")";
					
					if(res!=null && res[0]==null){
						res[count] = str;
						count++;
					}else{
						boolean itemFound = false;
					for (int j2 = 0; j2 < res.length; j2++) {
						if(res!=null && (res[j2]!=null && (res[j2].contains(str) || res[j2].contains(strReverse)))){
						itemFound = true;	
						}
					}
					if(!itemFound){
						res[count] = str;
						count++;
					}
					}
				}
			}
		}
		count =0;
		for (int i = 0; i < res.length; i++) {
			if(res[i]!=null){
			System.out.print(res[i]);
			count++;
			}
		}
		}
        return count;
    }
}
