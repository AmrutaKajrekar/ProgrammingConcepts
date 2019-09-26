package problems.string;


/**
 * @author amruta.kajrekar on 3/19/18.
 * leetcode problem #8 String to Integer (Atoi)
 */
public class StringToInteger {

    public static void main(String[] args){
        StringToInteger str = new StringToInteger();
        System.out.print(str.myAtoi("   -4212323213sad21312"));//-2,147,483,648 //6*3
    }

    public int myAtoi(String str){
        str = str.trim();
        String[] s = str.split("([a-z]+|[A-Z]+|[.]|[\\W])");
        try {
            if(s.length==0) return 0;
            s[0]=s[0].trim();
            if(s[0].length()==0 || s[0].isEmpty()) return 0;
            return Integer.parseInt(s[0]);
        }catch (NumberFormatException e){
            if(Double.parseDouble(s[0])>=Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(Double.parseDouble(s[0])<=Integer.MIN_VALUE) return Integer.MIN_VALUE;
            else return 0;
        }
    }


    //([a-z]+|[A-Z]+|[^\w]) //[[-+]?[0-9]+]
    public int myAtoi3(String str){
        str = str.trim();
        String[] s = str.split("([a-z]+|[A-Z]+|[.]|[\\W])");
       try {
           if(s.length==0) return 0;
           s[0]=s[0].trim();
           if(s[0].length()==0 || s[0].isEmpty()) return 0;
           return Integer.parseInt(s[0]);
       }catch (NumberFormatException e){
           if(Double.parseDouble(s[0])>=Integer.MAX_VALUE) return Integer.MAX_VALUE;
           if(Double.parseDouble(s[0])<=Integer.MIN_VALUE) return Integer.MIN_VALUE;
           else return 0;
       }
    }

    public int myAtoi2(String str) {
        str = str.trim();
        if(str.length()==0) return 0;
        if(str.length()==1 && !((int)str.charAt(0)>='0' && (int)str.charAt(0)<='9')) return 0;
        boolean num = false; int start=0;
        while(start<str.length()){
            if(!Character.isDigit(str.charAt(start)))
                start++;
            else break;
        }
        for (int i=start;i<str.length();i++){
            if((int)str.charAt(i)>='0' && (int)str.charAt(i)<='9'){
                num = true;
                continue;
            }else{
                if(num) {
                    try {
                        if(start==1 && (str.charAt(0)=='-' || str.charAt(0)=='+'))
                            return Integer.parseInt(str.substring(0, i));
                        else return Integer.parseInt(str.substring(start, i));
                    }catch (NumberFormatException e){
                        int istr = Integer.MAX_VALUE;
                        str = str.trim();
                        if(str.charAt(0)=='-') istr = Integer.MIN_VALUE;
                        return istr;
                    }
                }
                else return 0;
            }
        }
        int istr =0;
        try {
            if(start>=2) return 0;
            else istr = Integer.parseInt(str);
        }
        catch (NumberFormatException e){
            istr = Integer.MAX_VALUE;
            str = str.trim();
            if(str.charAt(0)=='-') istr = Integer.MIN_VALUE;

        }

        return istr;
    }
}
