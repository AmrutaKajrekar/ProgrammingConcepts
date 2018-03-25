package problems.string;

/**
 * @author amruta.kajrekar on 3/19/18.
 * leetcode problem #8 String to Integer (Atoi)
 */
public class StringToInteger {

    public static void main(String[] args){
        StringToInteger str = new StringToInteger();
        System.out.print(str.myAtoi("  -0012a42"));
    }

    public int myAtoi(String str) {
        str = str.replace(" ", "");
        if(str.length()==0) return 0;
        if(str.length()==1 && !((int)str.charAt(0)>='0' && (int)str.charAt(0)<='9')) return 0;
        boolean num = false;
        for (int i=1;i<str.length();i++){
            if((int)str.charAt(i)>='0' && (int)str.charAt(i)<='9'){
                num = true;
                continue;
            }else{
                if(num) return Integer.parseInt(str.substring(0,i));
                else return 0;
            }
        }
        int istr =0;
        try {
            istr = Integer.parseInt(str);
        }
        catch (NumberFormatException e){
            istr = Integer.MAX_VALUE;
            if(str.charAt(0)=='-') istr = Integer.MIN_VALUE;

        }

        return istr;
    }
}
