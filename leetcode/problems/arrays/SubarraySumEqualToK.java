package problems.arrays;

/**
 * @author amruta.kajrekar on 8/29/18.
 */
public class SubarraySumEqualToK {

  public static void main(String[] args){
    SubarraySumEqualToK sub = new SubarraySumEqualToK();
    System.out.print(sub.subarraySum(new int[]{-19,-82,-70,-46,-29,7,15,-72,-7,100,303}, 100));
  }
  int start =0, end =0 ;
  int total=0;

  public int subarraySum(int[] nums, int k) {
    if(nums.length==1){
      if(nums[0]==k) return 1;
      else return 0;
    }
    int count = nums[start];
    while(start<=end && end<nums.length && start<nums.length) {
      if (count == k) {
        total++;
        start = start + 1;
        end = start;
        if (start < nums.length)
          count = nums[start];
      } else if (count < k) {
        count = incrementEnd(nums,count);
      } else {
        //if next element is negative, try adding
        if (end < nums.length && end+1<nums.length && nums[end + 1] < 0) {
          count = incrementEnd(nums, count);
        } else {
          count = incrementStart(nums, count);
        }
      }
    }
    return total;
    }

  private int incrementStart(int[] nums, int count) {
    if (start < end) {
      count -= nums[start];
      start++;
    } else if (start == end) {
      start = end + 1;
      end = start;
      if (start < nums.length)
        count = nums[start];
    }
    return count;
  }

  private int incrementEnd(int[] nums, int count) {
    end++;
    if(end<nums.length)
      count += nums[end];
    else{
      end=nums.length-1;
      count -= nums[start];
      start++;
    }
    return count;
  }



  public int subarraySum2(int[] nums, int k) {
    if(nums.length==1){
      if(nums[0]==k) return 1;
      else return 0;
    }
    int start =0, end =0, count=nums[start];
    int total=0;
    while(start<=end && end<nums.length && start<nums.length){
      if(count==k) {
        total++;
        start = start+1;
        end=start;
        if(start<nums.length)
          count = nums[start];
      }
      else if(count<k){
        end++;
        if(end<nums.length)
          count += nums[end];
        else{
          end=nums.length-1;
          count -= nums[start];
          start++;
        }
      }else{
        if(start<end) {
          count -= nums[start];
          start++;
        }else if (start==end){
          start = start+1;
          end=start;
          if(start<nums.length)
            count = nums[start];
        }
      }

    }

    return total;
  }

}
