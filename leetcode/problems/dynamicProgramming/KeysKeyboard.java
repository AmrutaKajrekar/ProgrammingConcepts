package problems.dynamicProgramming;

/**
 * @author amruta.kajrekar on 4/15/18.
 * leetcode problem # 650
 * Initially on a notepad only one character 'A' is present. You can perform two operations on this notepad for each step:

Copy All: You can copy all the characters present on the notepad (partial copy is not allowed).
Paste: You can paste the characters which are copied last time.
Given a number n. You have to get exactly n 'A' on the notepad by performing the minimum number of steps permitted. Output the minimum number of steps to get n 'A'.

Example 1:
Input: 3
Output: 3
Explanation:
Intitally, we have one character 'A'.
In step 1, we use Copy All operation.
In step 2, we use Paste operation to get 'AA'.
In step 3, we use Paste operation to get 'AAA'.
Note:
The n will be in the range [1, 1000].

 */
public class KeysKeyboard {

    public static void main(String[] args){
        KeysKeyboard key = new KeysKeyboard();
        System.out.print(key.minSteps(754));
    }

    public int minSteps(int n) {
        int steps = 0; int i=2;
        while(i<=n){
            while(n%i==0){
                steps= steps+i;
                n=n/i;
            }
            i++;
        }
        return steps;
    }



}
