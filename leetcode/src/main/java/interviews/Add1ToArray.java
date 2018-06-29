package interviews;

import java.util.Arrays;

/**
 * @author amruta.kajrekar on 6/18/18.
 */
public class Add1ToArray {

    public static void main(String[] args){
        Add1ToArray one = new Add1ToArray();
        int[] arr = new int[]{0,9,9,9,9};
        arr = one.sum(arr,arr.length-1);
        for (int i = 0; i <= arr.length-1; i++) {
            System.out.print(arr[i]+",");
        }
    }

    public int[] sum(int[] arr, int n){
        int i=n;

        if(arr[i]<9) {
         arr[i]++;
         return arr;
        }

        int temp = arr[i]+1;
        arr[i] = temp %10;
        i--;

        if(i<0){
            arr = Arrays.copyOf(arr, arr.length+1);
            i++;
        }
        arr = sum(arr,i);

        return arr;
    }
}
