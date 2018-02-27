package com.main.hackerrank.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author amruta.kajrekar
 */
public class FillJars {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] line = reader.readLine().split(" ");
            int max=0;
            String str = map.get("s");
            for(int i=0;i<Integer.parseInt(line[1]); i++){
                String[] op = reader.readLine().split(" ");
                max+=(( (Integer.parseInt(op[1])-1) - ( Integer.parseInt(op[0])-1) + 1)  * (Integer.parseInt(op[2])) );
           }
            System.out.println(max/Integer.parseInt(line[0]));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
