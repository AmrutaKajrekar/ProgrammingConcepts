package problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author amruta.kajrekar on 5/15/18.
 */
public class MyCalendarII {
    public static void main(String[] args){
        MyCalendarII two = new MyCalendarII();
        System.out.println(two.book(10,20));//true
        System.out.println(two.book(50,60));//true
        System.out.println(two.book(10,25));//true
        System.out.println(two.book(5,10));//true
        System.out.println(two.book(5,15));//false;
    }

    List<int[]> cal;
    HashMap<String, Integer> map = new HashMap();
    public MyCalendarII() {
        if(cal==null)
            cal = new ArrayList<>(Arrays.asList(new int[100000000]));
    }

    public boolean book(int start, int end) {
        for(int[] c:cal){
            if(c[0]<end && c[1]>start){
                if(map.containsKey(start+","+end)){
                    if(map.get(start+","+end)==2) return false;
                    map.put(start+","+end,map.get(start+","+end)+1);
                }
                else map.put(start+","+end,1);
            }
        }
        return true;
    }

}
