package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author amruta.kajrekar on 5/11/18.
 * interview question for Uber
 */
public class KthFrequentNumbers {

    public static void main(String[] args){
        KthFrequentNumbers fre = new KthFrequentNumbers();
        System.out.println(fre.getFrequentNumbers(new int[] {3,4,1,3,6,2,2,2,2,2,2},1));
    }

    private int getFrequentNumbers(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])) map.put(arr[i],1);
            else{
                map.put(arr[i],map.get(arr[i]) +1);
            }
        }

        Map<Integer, Integer> sortedMapDesc = sortByComparator(map, false);
        List<Integer> val = new ArrayList<Integer>(sortedMapDesc.values());

        return val.get(k-1);
    }

    private static Map<Integer, Integer> sortByComparator(Map<Integer, Integer> unsortMap, final boolean order)
    {

        List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(unsortMap.entrySet());

        // Sorting the list based on values
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>()
        {
            public int compare(Map.Entry<Integer, Integer> o1,
                    Map.Entry<Integer, Integer> o2)
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
        Map<Integer, Integer> sortedMap = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> entry : list)
        {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
}
