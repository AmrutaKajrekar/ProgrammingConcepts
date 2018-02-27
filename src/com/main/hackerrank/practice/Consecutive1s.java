package com.main.hackerrank.practice;

import java.util.Scanner;

/**
 * @author amruta.kajrekar
 */
public class Consecutive1s {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        // while(scan.hasNext()){
        int num = scan.nextInt();
        System.out.println();
        String str = Integer.toBinaryString(num);
        int max = 0, counter = 0;
        for(int i=0;i<str.length();i++){
            if(Character.getNumericValue(str.charAt(i))==1) counter++;
            else {
                if(counter >max){
                    max = counter;
                }
                counter =0;
            }
        }
        if(counter >max){
            max = counter;
        }
        System.out.print(max);
    }

}
