package problems.arrays;

import java.util.Arrays;

/**
 * @author amruta.kajrekar on 7/24/18.
 */
public class Merge {

  public static void main(String[] args) {
    Merge m = new Merge();
    System.out.print(m.merge(new String[]{"mn", "ab", "ablkrew", "rwytytoz"}));
  }

  public String merge(String[] strings) {
    StringBuilder str = new StringBuilder();
    for (int i = 0; i < strings.length; i++) {
      str.append(strings[i]);
    }
    char[] c = str.toString().toCharArray();
    Arrays.sort(c);
    return String.valueOf(c);
  }


}

//    System.out.println(Character.getNumericValue('a')-10);
//    System.out.println(Character.getNumericValue('b')-10);
//    System.out.println(Character.getNumericValue('c')-10);
//    System.out.println(Character.getNumericValue('d')-10);
//    System.out.println(Character.getNumericValue('e'));
//    System.out.println(Character.getNumericValue('f'));
//    System.out.println(Character.getNumericValue('g'));
//    System.out.println(Character.getNumericValue('h'));
//    System.out.println(Character.getNumericValue('i'));
//    System.out.println(Character.getNumericValue('j'));
//    System.out.println(Character.getNumericValue('k'));
//    System.out.println(Character.getNumericValue('l'));
//    System.out.println(Character.getNumericValue('m'));
//    System.out.println(Character.getNumericValue('n'));
//    System.out.println(Character.getNumericValue('o'));
//    System.out.println(Character.getNumericValue('p'));
//    System.out.println(Character.getNumericValue('q'));
//    System.out.println(Character.getNumericValue('r'));
//    System.out.println(Character.getNumericValue('s'));
//    System.out.println(Character.getNumericValue('t'));
//    System.out.println(Character.getNumericValue('u'));
//    System.out.println(Character.getNumericValue('v'));
//    System.out.println(Character.getNumericValue('x'));
//    System.out.println(Character.getNumericValue('y'));
//    System.out.println(Character.getNumericValue('z'));
