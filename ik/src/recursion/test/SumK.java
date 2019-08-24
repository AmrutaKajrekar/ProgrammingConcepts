package recursion.test;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * @author amruta.kajrekar on 7/21/19.
 */
public class SumK {

  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    boolean res;
    int arr_size = 0;
    arr_size = Integer.parseInt(in.nextLine().trim());

    long[] arr = new long[arr_size];
    for(int i = 0; i < arr_size; i++) {
      long arr_item;
      arr_item = Long.parseLong(in.nextLine().trim());
      arr[i] = arr_item;
    }

    long k;
    k = Long.parseLong(in.nextLine().trim());

    res = check_if_sum_possible(arr, k);
    bw.write(String.valueOf(res ? 1 : 0));
    bw.newLine();

    bw.close();
  }

  static boolean check_if_sum_possible(long[] arr, long k) {
    if(arr.length==0) return false;
    if(k==0 && arr.length==1) {
      if(arr[0]==0) return true;
      else return false;
    }
    System.out.println("arr[0] = "+arr[0]);
    return sumExists(arr, arr[0], 1, k, 0);
  }

  static boolean sumExists(long[] arr, long sum, int i, long tsum, int elems){
    //System.out.println("sum = "+sum);
    if(sum==0 && elems>0) {
      return true;
    }
    if(i==arr.length) //reached to last elem
      return false;

    return sumExists(arr, (sum-arr[i]), i+1,tsum, elems+1)
        || sumExists(arr, sum, i+1,tsum, elems);
  }
}

/*
7

-1
-1
-8
-3
-18
11
6
sum=-9
*/

/*
18
3
-4
-2
4
-1
-4
3
3
2
-4
1
4
0
-1
4
2
1
2
-14
 */
