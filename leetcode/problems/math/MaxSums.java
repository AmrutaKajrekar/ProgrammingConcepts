package problems.math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author amruta.kajrekar on 5/10/18.
 */
public class MaxSums {

    public static void main(String[] args){
        MaxSums sum = new MaxSums();
//        System.out.println(sum.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
        List list = new ArrayList<>();
        list.add("are");
        list.add("the");
        list.add("in");
        list.add("an");
        System.out.println();sum.retrieveMostFrequentlyUsedWords("flower red rose, red rose flower are the in an", list);
    }

    List<String> retrieveMostFrequentlyUsedWords(String literatureText,
            List<String> wordsToExclude)
    {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        List<String> list = new ArrayList<String>();

        String[] freq = literatureText.split(" ");

        for (int i=0;i<freq.length;i++){
            if(!map.containsKey(freq[i])) map.put(freq[i],1);
            else{
                map.put(freq[i],map.get(freq[i]) +1);
            }
        }

        Map<String, Integer> sortedMapDesc = sortByComparator(map, false);

        int max = 0;
        for (Entry<String, Integer> entry : sortedMapDesc.entrySet())
        {
            //System.out.println("Key : " + entry.getKey() + " Value : "+ entry.getValue());
            max = Math.max(max,entry.getValue());
        }

        for (Entry<String, Integer> entry : sortedMapDesc.entrySet()) {
            if (!wordsToExclude.contains(entry.getKey()) && entry.getValue() == max)
                list.add(entry.getKey());
        }
        return list;
    }

    private static Map<String, Integer> sortByComparator(Map<String, Integer> unsortMap, final boolean order)
    {

        List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(unsortMap.entrySet());

        // Sorting the list based on values
        Collections.sort(list, new Comparator<Entry<String, Integer>>()
        {
            public int compare(Entry<String, Integer> o1,
                    Entry<String, Integer> o2)
            {
                if (order)
                {
                    return o1.getValue().compareTo(o2.getValue());
                }
                else
                {
                    return o2.getValue().compareTo(o1.getValue());

                }
            }
        });

        // Maintaining insertion order with the help of LinkedList
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Entry<String, Integer> entry : list)
        {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }


    public int maxSubArray(int[] nums) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        List<String> list = new ArrayList<>();

        int max = Integer.MIN_VALUE;

        for(int i=0;i<=nums.length-1;i++){
            int sum1 = getSum(nums,i,i);
            int sum2 = getSum(nums,i,i+1);
            max = Math.max(sum1,sum2);
        }
        return max;
    }

    public int getSum(int[] nums, int s, int e){
        int sum = 0;
        System.out.print("\n");
        if(s>=0 && e<nums.length && s<=e){
            // for(; s>=0 && e<=nums.length-1; s--,e++){
            for(int i=s;i<=e; i++){
                sum+=nums[i];
                System.out.print(nums[i]);
            }
        }
        return sum;
    }

}
