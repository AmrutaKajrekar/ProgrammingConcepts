package problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author amruta.kajrekar on 7/7/18.
 */
public class SubSets {

    public static void main(String[] args){
        SubSets sets = new SubSets();
        int[] nums = new int[]{1,2,3};
        sets.subsets(nums);
    }

    public List<List<Integer>> subsets2(int[] S) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<Integer>());

        Arrays.sort(S);
        for(int i : S) {
            List<List<Integer>> tmp = new ArrayList<>();
            for(List<Integer> sub : res) {
                List<Integer> a = new ArrayList<>(sub);
                a.add(i);
                tmp.add(a);
            }
            res.addAll(tmp);
        }
        return res;
    }


    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> setOfSets = new ArrayList<List<Integer>>();
        setOfSets.add(new ArrayList<Integer>());

        Arrays.sort(nums);
        for(int n: nums){
            List<List<Integer>> temp = new ArrayList<List<Integer>>();
            for(List<Integer> s: setOfSets){
                List<Integer> small = new ArrayList<>(s);
                small.add(n);
                temp.add(small);
            }
            setOfSets.addAll(temp);
        }
        return setOfSets;
    }
    public List<List<Integer>> subsets3(int[] S) {
        List<List<Integer>> result = new ArrayList<>();

        if(S.length == 0){
            return result;
        }

        Arrays.sort(S);
        dfs(S, 0, new ArrayList<Integer>(), result);
        return result;
    }

    public void dfs(int[] s, int index, List<Integer> path, List<List<Integer>> result){
        result.add(new ArrayList<Integer>(path));

        for(int i = index; i < s.length; i++){
            path.add(s[i]);
            dfs(s, i+1, path, result);
            path.remove(path.size()-1);
        }
    }

}
