package recursion.test;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * @author amruta.kajrekar on 7/21/19.
 */
public class Brackets {

  static String[] find_all_well_formed_brackets(int n) {
    String result[] = new String[]{""};
//    List<String> list = new ArrayList<>();
    return getBrackets(result,n, 0);
  }

  static String[] getBrackets(String[] list,int n, int i){
    if(i>=list.length) return list;
    if(n==1) {
      list[i] = "()";
    }
    else{
      /*StringBuilder str = new StringBuilder();
      str.append("(");
      str.append(")");*/

      list[i] = "(" + getBrackets(list,n-1,i+1) + ")";
      list[i] = "()" + getBrackets(list,n-1, 1+1);
      list[i] = getBrackets(list,n-1, 1+1) + "()";
    }
    return list;
  }

  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] res;
    int n;
    n = Integer.parseInt(in.nextLine().trim());

    res = find_all_well_formed_brackets(n);
    for(int res_i = 0; res_i < res.length; res_i++) {
      bw.write(String.valueOf(res[res_i]));
      bw.newLine();
    }

    bw.close();
  }
}
