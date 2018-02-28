package com.main.hackerrank.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author amruta.kajrekar
 *
 */
public class PrintStrings {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        List<String> array = new ArrayList<String>();
        for(int i=0;i<size; i++){
            String str = scan.next();
            //System.out.println(str);
            array.add(str);
        }
        scan.close();

        for(int l =0;l<array.size();l++){
            char[] charArray = array.get(l).toCharArray();
            char[] str1 = new char[charArray.length/2 + (charArray.length%2)], str2 = new char[charArray.length/2];
            int k1 = 0, k2 = 0;
            for(int j=0;j<charArray.length;j++){
                if(j%2==0){
                    str1[k1]=charArray[j]; k1++;
                }else{
                    str2[k2]=charArray[j]; k2++;
                }
            }
            System.out.println(new String(str1) + " " + new String(str2));
        }
    }
}
