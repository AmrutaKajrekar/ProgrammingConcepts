package problems.string;

/**
 * @author amruta.kajrekar on 4/19/18.
 */
public class NumberAndPrint {

    public static void main(String[] args){
        NumberAndPrint num = new NumberAndPrint();
        num.printNumbers("6bc100d100");
    }

    int i=0;
    public void printNumbers(String s){
        for(;i<s.length();){
            char c = '~';
            int num=0;
            if(Character.isLetter(s.charAt(i))) {
                c = s.charAt(i);
                i++;
                num = getNum(s);
            }else{
                num = getNum(s);
                c = s.charAt(i);
                i++;
            }
            for(int j=0;j<num;j++)
            System.out.print(c);
        }
    }

    private int getNum(String s) {
        StringBuilder str = new StringBuilder();
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            str.append(s.charAt(i));
            i++;
        }
        int num = Integer.parseInt(str.toString());
        return num;
    }
}
