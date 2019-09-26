package problems.dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author amruta.kajrekar on 3/4/18.
 * leetcode problem #120
 *
 * Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.

For example, given the following triangle
[
[2],
[3,4],
[6,5,7],
[4,1,8,3]
]
The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).

Note:
Bonus point if you are able to do this using only O(n) extra space, where n is the total number of rows in the triangle.

List<List<Integer>> list = new ArrayList<List<Integer>>();
List<Integer> sub1 = new ArrayList<Integer>(); sub1.add(2);
List<Integer> sub2 = new ArrayList<Integer>(); sub2.add(3); sub2.add(4);
List<Integer> sub3 = new ArrayList<Integer>(); sub3.add(6);sub3.add(5);sub3.add(7);
List<Integer> sub4 = new ArrayList<Integer>(); sub4.add(4);sub4.add(1);sub4.add(8);sub4.add(3);
list.add(sub1);
list.add(sub2);
list.add(sub3);
list.add(sub4);

 */
public class Triangle {

    public static void main(String[] args){
        Triangle tri = new Triangle();
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> sub1 = new ArrayList<Integer>(); sub1.add(-1);
        List<Integer> sub2 = new ArrayList<Integer>(); sub2.add(-2); sub2.add(-3);
//        List<Integer> sub3 = new ArrayList<Integer>(); sub3.add(1);sub3.add(-1);sub3.add(-3);
//        List<Integer> sub4 = new ArrayList<Integer>(); sub4.add(4);sub4.add(1);sub4.add(8);sub4.add(3);
        list.add(sub1);
        list.add(sub2);
//        list.add(sub3);
//        list.add(sub4);
        System.out.print(tri.minimumTotal(list));
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size()<1) return 0;
        if(triangle.size()==1) return triangle.get(0).get(0);

        List<List<Integer>> path = new ArrayList<List<Integer>>(triangle.size());
        path.add(0, triangle.get(0));

        //update list items:
        Integer item0 = triangle.get(0).get(0);
        List<Integer> temp = new ArrayList<Integer>();
        temp.add((Integer)triangle.get(1).get(0)+ item0);
        temp.add((Integer)triangle.get(1).get(1)+ item0);
        path.add(1, temp);

        for (int i=2; i<triangle.size();i++){
            // for each row, calculate min of prev top 2  elements
            // update the list
            temp = new ArrayList<Integer>();
            temp.add((Integer) triangle.get(i).get(0) + (Integer) path.get(i-1).get(0));
            for (int j=1; j<triangle.get(i).size()-1;j++) {
                Integer upper1 = path.get(i-1).get(j-1);
                Integer upper2 = path.get(i-1).get(j);
                temp.add (Math.min((Integer) triangle.get(i).get(j) + upper1 , (Integer) triangle.get(i).get(j) + upper2));

            }
            temp.add((Integer) triangle.get(i).get(triangle.get(i).size()-1)
                    + (Integer) path.get(i-1).get(path.get(i-1).size()-1));
            path.add(i, temp);
        }

        int size = path.size();
        int innerSize = path.get(size-1).size();
        Object[] array = (path.get(size-1).toArray());
        Arrays.sort(array);

        return (int) array[0];
    }

}


//        int[] path = new int[triangle.size()];
//        int prevIndex = -1;
//        path[0]= triangle.get(0).get(0);
//        path[1]= Math.min(path[0]+ triangle.get(1).get(0),path[0]+ triangle.get(1).get(1));
//        prevIndex = ((triangle.get(1).get(0)) <(triangle.get(1).get(1)) ? 0 : 1);


//            path[i]=Math.min(path[i-1]+triangle.get(i).get(prevIndex), path[i-1]+triangle.get(i).get(prevIndex+1));
//            prevIndex = ((triangle.get(i).get(prevIndex)) < (triangle.get(i).get(prevIndex+1)) ? prevIndex : prevIndex+1 );
