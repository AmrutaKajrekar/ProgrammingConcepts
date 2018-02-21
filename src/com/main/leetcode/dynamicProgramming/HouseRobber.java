package com.main.leetcode.dynamicProgramming;

/**
 * @author amruta.kajrekar
 * leetcode problem #198
 *
 * You are a professional robber planning to rob houses along a street.
 * Each house has a certain amount of money stashed,
 * the only constraint stopping you from robbing each of them is that adjacent houses have security system connected
 * and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house,
determine the maximum amount of money you can rob tonight without alerting the police.
input_try this:
[856,114,485,553,123,340,108,605,747,790,439,778,842,515,350,696,885,489,392,394,893,946,886,612,704,160,999,312,591,401,170,991,711,418,714,992,890,651,221,140,827,372,717,960,125,272,113,526,267,495,947,305,327,564,731,729,623,613,9,75,104,397,952,228,120,994,667,652,523,159,623,749,450,365,786,657,66,557,747,419,888,317,686,363,385,792,41,211,360,328,130,12,45,558,107,173,114,36,157,631]
 expected output: 27971
 *
 */

public class HouseRobber {

    public static void main(String[] args){
        HouseRobber plan = new HouseRobber();
        int[] nums = new int[]{856,114,485,553,123,340,108,605,747,790,439,778,842,515,350,696,885,489,392,394,893,946,886,612,704,160,999,312,591,401,170,991,711,418,714,992,890,651,221,140,827,372,717,960,125,272,113,526,267,495,947,305,327,564,731,729,623,613,9,75,104,397,952,228,120,994,667,652,523,159,623,749,450,365,786,657,66,557,747,419,888,317,686,363,385,792,41,211,360,328,130,12,45,558,107,173,114,36,157,631};

//        nums = plan.parseJsonFile("/input.json");
        System.out.println("\ntotal robbed money="+plan.rob(nums));
    }

    /*private int[] parseJsonFile(String s) {
        System.out.println(this.getClass().getResource(s));
        JSONParser parser = null;
        ArrayList<Integer> list = new ArrayList<Integer>();
        try {
            parser = new JSONParser();

            JSONArray array = (JSONArray) parser.parse(new FileReader(getClass().getResource(s).getFile()));
            for(int i=0;i<array.size();i++){
                list.add(Integer.parseInt((((JSONObject)array.get(i)).get("value")).toString()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int[] nums = new int[list.size()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
            System.out.print(nums[i]+",");
        }
        return nums;
    }*/



    public int rob(int[] num) {

        if (num.length == 0)
            return 0;
        if (num.length == 1)
            return num[0];
        if (num.length == 2)
            return Math.max(num[0], num[1]);

        if (num.length > 2) {
            //calculate how much we robbed until i th index.
            int[] robbed = new int[num.length + 1];
            robbed[0] = num[0];
            robbed[1] = Math.max(num[0], num[1]);

            //compare with last 2, whichever is max, add to the robbed index
            for (int i = 2; i < num.length; i++) {
                robbed[i] = Math.max(robbed[i - 2] + num[i], robbed[i - 1]);

            }
            //return the last robbed index which will be the total robbed amount
            return robbed[robbed.length - 2];
        }
        return -1;
    }


    public int rob2(int[] nums) {

        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        if (nums.length == 2)
            return Math.max(nums[0], nums[1]);

        if (nums.length > 2) {
            int a = nums[0];
            int b = nums[1];

            for (int i = 2; i < nums.length; i++) {
                if (i % 2 == 0) {
                    a = Math.max(a + nums[i], b);
                } else {
                    b = Math.max(b + nums[i], a);
                }
            }
            return Math.max(a, b);
        }
        return 0;
    }

    public int rob3(int[] num) {
        int[][] dp = new int[num.length + 1][2];
        for (int i = 1; i <= num.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
            dp[i][1] = num[i - 1] + dp[i - 1][0];
        }
        return Math.max(dp[num.length][0], dp[num.length][1]);
    }
}
