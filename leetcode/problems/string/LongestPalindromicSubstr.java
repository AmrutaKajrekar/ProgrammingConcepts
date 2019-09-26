package problems.string;

/**
 * @author amruta.kajrekar
 * leetcode problem #5
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example:
Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.

Example:
Input: "cbbd"
Output: "bb"
 */
public class LongestPalindromicSubstr {

    public static void main(String[] args){

        LongestPalindromicSubstr palindrome = new LongestPalindromicSubstr();
        System.out.println("longest Palindrome=" +palindrome.longestPalindrome("xyzsbassabss"));
//        System.out.println("isPalindrome=" + palindrome.isPalindrome("babad"));
    }

    private String longestPalindrome(String str) {
        String maxSubStr="";

        for (int i=0;i<=str.length()-1;i++){
            String s1=getPalindrome(str,i,i);
            String s2=getPalindrome(str,i,i+1);
            if(s1.length() > maxSubStr.length()) maxSubStr=s1;
            if(s2.length() > maxSubStr.length()) maxSubStr=s2;
        }
        return maxSubStr;
    }

    private String getPalindrome(String str, int i, int j) {
        for(; i>=0 && j<=str.length()-1; i--,j++){
            if(str.charAt(i)!=str.charAt(j)) break;
        }
        return str.substring(i+1, j);
    }

    public String longestPalindrome3(String s) {
        if(s.length()==0) return "";
        else if(s.length()==1) return s;
        else if(s.length()==2) {
            if(s.charAt(0)==s.charAt(1)) return s;
            else{ return s.substring(0,1);}
        }
        else {

            int max = 0;
            String maxStr = s.substring(0,1);

            boolean preInc = false, postInc = true;
            for (int i = 1; i <= s.length() - 1; i++) {
                int pre = i - 1, post = i;
                while (pre > 0 || post < s.length() - 1) {
                    if (isPalindrome(s.substring(pre, post + 1)) && (s.substring(pre, post + 1).length() > maxStr.length())) {
                        maxStr = s.substring(pre, post + 1);
                    }
                    if (postInc && (!preInc) && pre - 1 >= 0) {
                        pre--;
                        preInc = true;
                        postInc=false;
                    }
                    else if ((!postInc) && (preInc) && post + 1 <= s.length() - 1) {
                        post++;
                        postInc=true;
                        preInc=false;
                    }
                }

            }
            if (isPalindrome(s) && (s.length() > maxStr.length())) {
                maxStr = s;
            }
            return maxStr;
        }
    }

    private boolean isPalindrome(String substring) {
        int len = 0;
        if(substring.length()%2==0){
            len=substring.length()/2;
        }else{
            len=substring.length()/2+1;
        }
        for(int i=0, j=substring.length()-1; i<=len && j>=len; i++, j--){
            if(substring.charAt(i) != substring.charAt(j)){
                //                System.out.println(substring + " = false");
                return false;
            }
        }
        //        System.out.println(substring + " = true");
        return true;
    }

}
