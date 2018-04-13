package contest.c76;

/**
 * @author amruta.kajrekar on 3/17/18.
 * leetcode problem #800
 * In the following, every capital letter represents some hexadecimal digit from 0 to f.
 * The red-green-blue color "#AABBCC" can be written as "#ABC" in shorthand.  For example, "#15c" is shorthand for the color "#1155cc".
 * Now, say the similarity between two colors "#ABCDEF" and "#UVWXYZ" is -(AB - UV)^2 - (CD - WX)^2 - (EF - YZ)^2.
 * Given the color "#ABCDEF", return a shorthand color "#RGB" that is most similar to #ABCDEF.

Example 1:
Input: color = "#09f166"
Output: "#1e6"
Explanation:
The similarity is -(09 - 11)^2 -(f1 - ee)^2 - (66 - 66)^2 = -2^2 - 3^2 - 0^2 = -13.
This is the lowest among any shorthand color.
Note:
color is a string of length 7.
color is a valid RGB color: for i > 0, color[i] is a hexadecimal digit from 0 to f
Any answer which has the same similarity as the best answer will be accepted.
 */
public class SimilarRGB {

    public static void main(String[] args){
        SimilarRGB rgb = new SimilarRGB();
        System.out.println(rgb.similarRGB("#15c"));
    }

    public String similarRGB(String color) {
        String rgbColor = "#ABCDEF";
        if(!color.startsWith("#")) return "incorrect color";
        if(color.length()==7 && color.equalsIgnoreCase(rgbColor)) return "#RGB";

        if(color.startsWith("#") && color.length()==4){
            color= "#"+ color.substring(1,2)+ color.substring(1,2)+ color.substring(2,3) + color.substring(2,3)
                    + color.substring(3)+ color.substring(3);
        }

        return findSimilarity(color);
    }

    private String findSimilarity(String color) {
        //formula:
        //- (AB - UV)^2 - (CD-WX)^2 - (EF-YZ)^2

        int AB = Integer.parseInt("AB",16);
        int CD = Integer.parseInt("CD",16);
        int EF = Integer.parseInt("EF",16);

        int UV = Integer.parseInt(color.substring(1,3),16);
        int WX = Integer.parseInt(color.substring(3,5),16);
        int YZ = Integer.parseInt(color.substring(5),16);

//        int similarity = - (AB - UV)^2 - (CD-WX)^2 - (EF-YZ)^2;
        int similarity = (int) (0-(Math.pow((AB-UV),2)) - (Math.pow((CD-WX),2)) - (Math.pow((EF-YZ),2)));

        return "";
    }
}
