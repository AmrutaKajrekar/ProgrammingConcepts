package interviews;

import java.util.Arrays;

/**
 * @author amruta.kajrekar on 6/20/18.
 */
public class ReverseAString {
    public static void main(String[] args){
        ReverseAString obj = new ReverseAString();
        String input = "reverse a string";
        String output1 = obj.reverse(input);
        String output2 = obj.reverse(output1);

        System.out.println("is reverse = "+ input.equalsIgnoreCase(output2));
    }

    public String reverse(String str){
        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length/2;i++){
            char temp = arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        System.out.println(arr);
        return Arrays.toString(arr).replaceAll(", ", "")
                .replace("[","")
                .replace("]","")
                .trim();
    }
}
