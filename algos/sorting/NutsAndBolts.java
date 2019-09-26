package sorting;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * @author amruta.kajrekar on 7/13/19.
 */
public class NutsAndBolts {

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int nutsCount = Integer.parseInt(scan.nextLine().trim());

    int[] nuts = new int[nutsCount];

    for (int nutsItr = 0; nutsItr < nutsCount; nutsItr++) {
      int nutsItem = Integer.parseInt(scan.nextLine().trim());
      nuts[nutsItr] = nutsItem;
    }

    int boltsCount = Integer.parseInt(scan.nextLine().trim());

    int[] bolts = new int[boltsCount];

    for (int boltsItr = 0; boltsItr < boltsCount; boltsItr++) {
      int boltsItem = Integer.parseInt(scan.nextLine().trim());
      bolts[boltsItr] = boltsItem;
    }

    String[] res = solve(nuts, bolts);

    for (int resItr = 0; resItr < res.length; resItr++) {
      bw.write(res[resItr]);

      if (resItr != res.length - 1) {
        bw.write("\n");
      }
    }

    bw.newLine();

    bw.close();
  }

  static String[] solve(int[] nuts, int[] bolts) {
    String res[]= new String[nuts.length];
    String delimiter = " ";
    int ri = 0;
    if (nuts.length==1) {
      res[ri] = nuts[0] + delimiter + bolts[0];
    } else{
      //ni pointer for nuts array
      //bi & bj pointer for bolts array
      int ni = 0, bi = 0, bj = bolts.length-1;

      while(ni<nuts.length && (bj>=bi && bi<bolts.length)){
        if(nuts[ni]!=bolts[bi]){
          bi++;
        }else{
          res[ri++] = nuts[ni] + delimiter + bolts[bi];
          if(bi!=bj) {
            int temp = bolts[bi];
            bolts[bi]=bolts[bj];
            bolts[bj]=temp;
          }
          bj--;
          bi=0;
          ni++;
        }
      }
    }
    return res;
}

  private static final Scanner scan = new Scanner(System.in);

}
