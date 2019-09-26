package problems.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author amruta.kajrekar on 7/6/18.
 */
public class MergeInterval {

    class Interval{
        int start, end;
        public Interval(int start, int end){
            this.start = start;
            this.end = end;
        }
    }
    public static void main(String[] args){
        MergeInterval merge = new MergeInterval();
        List<Interval> list = new ArrayList<>();
        Interval i1 = merge.new Interval(1,4);
        Interval i2 = merge.new Interval(0,0);
//        [[1,4],[0,0]]
        list.add(i1);
        list.add(i2);
        merge.merge(list);
    }

    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval i1, Interval i2){
                return i1.start-i2.start;
            }
        });
        List<Interval> list = new ArrayList<>();
        for(Interval in:intervals){
            if(list.isEmpty() || list.get(list.size()-1).end < in.start){
                list.add(in);
            }else{
                Interval obj = list.get(list.size()-1);
                obj.end = Math.max(obj.end, in.end);
                obj.start = Math.min(obj.start, in.start);
            }
        }

        return list;
    }

}
