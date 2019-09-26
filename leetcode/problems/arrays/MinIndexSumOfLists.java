package problems.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author amruta.kajrekar
 * leetcode problem #599
 */
public class MinIndexSumOfLists {

    public static void main(String[] args){
        MinIndexSumOfLists sum = new MinIndexSumOfLists();
        String[] result = sum.findRestaurant(new String[] {"Shogun", "Tapioca Express", "Burger King", "KFC"},
                new String[]{"KFC", "Shogun", "Burger King"});
//                        { "Shogun", "Tapioca Express", "Burger King", "KFC" },
//                new String[] { "Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun" });
        for (String s:result) {
            System.out.println(s);
        }

    }

    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        List<String> list = new ArrayList<String>();
        for(int i=0;i<list1.length;i++){map.put(list1[i],i);}
        int sum=Integer.MAX_VALUE;
        for(int j=0;j<list2.length;j++){
            if(map.containsKey(list2[j])){
                int cnt=map.get(list2[j]);
                if(cnt+j<sum){
                    sum=cnt+j;
                    list.clear();
                    list.add(list2[j]);
                }else if(cnt+j==sum){
                    list.add(list2[j]);
                }
            }
        }
        return list.toArray(new String[list.size()]);
    }
}
