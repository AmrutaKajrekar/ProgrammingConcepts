package problems.arrays;

/**
 * @author amruta.kajrekar on 6/17/18.
 */
public class ReverseAString {

    public static void main(String[] args){
        ReverseAString rev = new ReverseAString();
        System.out.println(rev.reverse("reversing this string"));
    }

    public String reverse(String str){
        StringBuilder s = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            s.append(str.charAt(i));
        }
        return s.toString();
    }
}
