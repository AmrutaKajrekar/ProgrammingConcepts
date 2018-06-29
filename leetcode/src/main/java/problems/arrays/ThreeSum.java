package problems.arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author amruta.kajrekar on 5/4/18.
 * leetcode problem #15
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
[-1, 0, 1],
[-1, -1, 2]
]
 */
public class ThreeSum {

    public static void main(String[] args){
        ThreeSum sum = new ThreeSum();
//        System.out.println(sum.uniqueMorseRepresentations(new String[]{"vtpke","vngc","vnqr","gbzx","qvdx"}));

//        System.out.println(sum.superPow(2, new int[]{3,5,6}));
//        System.out.println(sum.validPalindrome(
//"aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));


        System.out.print(sum.threeSum(new int[]{-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6}));
        //[[-4,-2,6],[-4,0,4],[-4,1,3],[-4,2,2],[-2,-2,4],[-2,0,2]]
    }


    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Set<String> set = new HashSet<>();

        int l=0;
        int r=nums.length-1;
        int temp=-999; int count=1;

        while(l<r && l>=0 && r>=0){
            for(int i=l+1;i<nums.length-1;i++){
                System.out.println("l,i,r:"+ l+","+i+","+ r+"=="+nums[l]+","+nums[i]+","+nums[r]);
                temp = nums[l]+nums[r]+nums[i];
                if(temp==0 && l!=r && r!=i && l!=i){
                    List<Integer> nl = new ArrayList<>();
                    nl.add(nums[l]);
                    nl.add(nums[i]);
                    nl.add(nums[r]);
                    Collections.sort(nl);
                    if(set.add(nl.get(0)+","+nl.get(1)+","+nl.get(2))) {
                        list.add(nl);
                    }
                }
            }
            if(count%2==0) r--;
            else l++;
            count++;
        }

        return list;
    }

//    private boolean doesExist(List<List<Integer>> list, List<Integer> nl) {
//        for(List<Integer> l:list){
//            HashMap map = new HashMap();
//            for (Integer sub:l) {
//                map.put(sub,);
//            }
//        }
//    }

    private void printArray(int[] nums) {
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+",");
        }
    }

    //    public List<List<Integer>> threeSum(int[] nums) {
//
//    }
    public double myPow(double x, int n) {

        return Math.pow(x,new Double(n));
    }


    public int superPow(int a, int[] b) {
        System.out.println(Arrays.toString(b).replaceAll("[^0-9]+", ""));
        int power = (int) Math
                .pow(new Double(a), new Double(Integer.parseInt(Arrays.toString(b).replaceAll("[^0-9]+", ""))));
        return power % 1337;
    }

    public int sqrt(int x){
        return (int)Math.sqrt(x);
    }
    public int uniqueMorseRepresentations(String[] words) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("a",".-"); map.put("b","-..."); map.put("c","-.-."); map.put("d","-.-."); map.put("e","."); map.put("f","..-.");
        map.put("g","--."); map.put("h","...."); map.put("i",".."); map.put("j",".---"); map.put("k","-.-"); map.put("l",".-..");
        map.put("m","--"); map.put("n","-."); map.put("o","---"); map.put("p",".--."); map.put("q","--.-"); map.put("r",".-.");
        map.put("s","..."); map.put("t","-"); map.put("u","..-"); map.put("v","...-"); map.put("w",".--"); map.put("x","-..-");
        map.put("y","-.--"); map.put("z","--..");


        Set<String> returnSet = new HashSet<String>();

        for(int i=0;i<words.length;i++){
            StringBuilder str = new StringBuilder();

            for(int j=0;j<words[i].length();j++){
                System.out.println(words[i].charAt(j) + " >>> " + map.get(Character.toString(words[i].charAt(j))));
                str.append(map.get(Character.toString(words[i].charAt(j))));
            }

            System.out.println(str.toString());
            returnSet.add(str.toString());
        }
        return returnSet.size();
    }

    public boolean validPalindrome(String s) {
        int front =0, end = s.length()-1;

        while(front<=end){
            if(s.charAt(front)!=s.charAt(end)){
                return (isPal(s,front+1,end) || isPal(s,front,end-1));
            }
            front++;
            end--;
        }
        return true;
    }

    private boolean isPal(String s, int front, int end) {
        while(front<end){
            if(s.charAt(front)!=s.charAt(end)) return false;
            front++;end--;
        }
        return true;
    }

    public boolean validPalindrome2(String s) {
        int front =0, end = s.length()-1;
        int count =0;

        while(front<=end){
            if(front==end && count==1) return false;
            if(s.charAt(front)!=s.charAt(end)){
                System.out.println(s.charAt(front) + " >>> " + s.charAt(end));
                count++;
                if(s.charAt(front+1) == s.charAt(end)){
                    if(count>1) {
                        System.out.println("s.charAt(front+1) == s.charAt(end)");
                        return false;
                    }
                    front++;
                }else if(s.charAt(front) == s.charAt(end-1)){
                    if(count>1) {
                        System.out.println("s.charAt(front) == s.charAt(end-1)");
                        return false;
                    }
                    end--;
                }else{
                    System.out.println("front = " + front + "end = "+end);
                    System.out.println(s.charAt(front) + " >>> " +  s.charAt(end));
                    if(count>1) return false;
                }
            }
            front++;
            end--;
        }

        if(count>1) return false;
        else return true;
    }

}
