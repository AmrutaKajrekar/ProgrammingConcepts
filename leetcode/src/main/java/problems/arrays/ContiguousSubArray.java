package problems.arrays;

/**
 * @author amruta.kajrekar on 7/1/18.
 */
public class ContiguousSubArray {

    public static void main(String[] args){
        ContiguousSubArray sub = new ContiguousSubArray();
        int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};//{-3,-1,0,-6,-7,-3,-1,-1,-1,-1};
        sub.getMaxSumSubArray(arr);
        sub.getContiguousSubArray(arr);
        sub.getContiguousArray(arr);
    }


   public void getContiguousArray(int[] arr){
        System.out.print("\n");
        int max =arr[0], ret = arr[0];
        int start=0, end=0, begin=0;

        for(int i=1;i<arr.length;i++){
            max = max+arr[i];
            if(max<0){
                max = 0;
                begin=i+1;
            }
            if(max>ret){
                ret = max;
                start = begin;
                end =i;
            }
        }


        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+",");
        }
   }


    public int getMaxSumSubArray(int[] arr){
        int max = arr[0];
        int maxsub = arr[0];

        for(int i=1;i<arr.length;i++){
            maxsub = Math.max(arr[i], maxsub+arr[i]);
            max = Math.max(max, maxsub);
        }
        System.out.println(max);
        return max;
    }
//4,-1,2,1
    public void getContiguousSubArray(int[] arr){
        int ret = arr[0];
        int max = arr[0];
        int start =0, end = 0;
        int begin =0;

        for(int i=1;i<arr.length;i++){
            max = max+arr[i];
            if(max < 0){
                max = 0;
                begin = i+1;
            }
            if(max > ret ){//ret <max
                ret = max;
                start = begin;
                end = i;
            }
        }

        for(int i=start;i<=end;i++){
           System.out.print(arr[i]+ ",");
        }
    }
}
