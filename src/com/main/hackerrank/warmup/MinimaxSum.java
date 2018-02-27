package com.main.hackerrank.warmup;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author amruta.kajrekar
 */
public class MinimaxSum {
    static void miniMaxSum(int[] arr) {
        // Complete this function
        Arrays.sort(arr);
        long min=0,max=0;
        for(int i=0;i<4;i++){
            min+=arr[i];
        }
        for(int i=arr.length-1;i>0;i--){
            max+=arr[i];
        }
        System.out.println(min + " " + max);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
