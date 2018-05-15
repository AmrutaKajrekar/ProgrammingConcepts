package uber;

import java.util.Arrays;

/**
 * @author amruta.kajrekar on 5/13/18.
 */
public class LongestConsequetive {

    public static void main(String[] args){
        LongestConsequetive longest = new LongestConsequetive();
        System.out.println(longest.longest(new int[] {1,2,0,1}));
    }

    public int longest(int[] arr){
        Arrays.sort(arr);

        int max = 1;
        int temp = 1;
        for (int i=0;i<arr.length-1;i++){
            if(arr[i]+1 == arr[i+1] || arr[i]-1 == arr[i+1]){
                temp++;
            } else{
                max = Math.max(max,temp);
                temp = 1;
            }

        }
        max = Math.max(max,temp);
        return max;
    }
}
