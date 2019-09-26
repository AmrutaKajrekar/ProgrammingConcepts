package problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author amruta.kajrekar on 5/14/18.
 */
public class MyCalendar {

    public static void main(String[] args){
        MyCalendar cal = new MyCalendar();
        System.out.println(cal.book(20,30));
        System.out.println(cal.book(29,35));
    }

    List<Boolean> cal;

    public MyCalendar() {
        if(cal==null){
            // cal = new boolean[];
            cal = new ArrayList<Boolean>(Arrays.asList(new Boolean[1000000000]));
            Collections.fill(cal, Boolean.TRUE);
        }
    }

    public boolean book(int start, int end) {
        int i=start;
        //check if slot is empty
        while(i<end){
            if(cal.get(i)==false){
                return false;
            }
            i++;
        }
        i=start;
        while(i<end){
            cal.add(i,false);
            i++;
        }
        return true;
    }
}
