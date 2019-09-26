package problems.string;

/**
 * @author amruta.kajrekar
 */
public class ReverseString {

	public static void main(String[] args) {
		String s ="hello";
		ReverseString str = new ReverseString();
		System.out.println(str.reverseString(s));
	}

	public String reverseString(String s) {
        char[] str = s.toCharArray();
        String reverse = "";
        for (int i=str.length-1; i >=0; i--) {
			reverse+=str[i];
		}
        
        return (reverse);
    }
	
}
