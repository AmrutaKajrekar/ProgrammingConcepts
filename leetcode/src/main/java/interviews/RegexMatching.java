package interviews;

/**
 * @author amruta.kajrekar on 6/18/18.
 */
public class RegexMatching {

    public static void main(String[] args){
        RegexMatching reg = new RegexMatching();
        System.out.println(reg.ismatching("(\\d+)","345"));
        System.out.println(reg.ismatching("(\\w+)","abc"));
    }

    public boolean ismatching(String regex, String str){
        return str.matches(regex);
    }
}
