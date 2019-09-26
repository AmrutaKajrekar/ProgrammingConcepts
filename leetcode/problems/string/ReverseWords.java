package problems.string;

/**
 * @author amruta.kajrekar
 */
public class ReverseWords {

	public static void main(String[] args) {
		ReverseWords w = new ReverseWords();
		System.out.println(w.reverseWords("   a   b "));//b a
	}

	public String reverseWords(String s) {
		String reverse="";
        String[] words = s.trim().split(" ");
       
        for (int k=words.length-1;k>=0;k--) {
			if(words[k].trim().length()>=1){
				reverse+=words[k]+" ";
			}
		}
        
       return reverse.trim(); 
    }
}
