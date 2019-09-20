package sorting.hw;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author amruta.kajrekar on 7/23/19.
 *
 */
public class MergeKArrays {

  private static final Scanner scan = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int arrRows = Integer.parseInt(scan.nextLine().trim());
    int arrColumns = Integer.parseInt(scan.nextLine().trim());

    int[][] arr = new int[arrRows][arrColumns];

    for (int arrRowItr = 0; arrRowItr < arrRows; arrRowItr++) {
      String[] arrRowItems = scan.nextLine().split(" ");

      for (int arrColumnItr = 0; arrColumnItr < arrColumns; arrColumnItr++) {
        int arrItem = Integer.parseInt(arrRowItems[arrColumnItr].trim());
        arr[arrRowItr][arrColumnItr] = arrItem;
      }
    }

    int[] res = mergeArrays(arr);

    for (int resItr = 0; resItr < res.length; resItr++) {
      bw.write(String.valueOf(res[resItr]));

      if (resItr != res.length - 1) {
        bw.write("\n");
      }
    }

    bw.newLine();

    bw.close();
  }

  static int[] mergeArrays(int[][] arr) {
    PriorityQueue<Node> queue = null;
    if(arr.length==0) return null;
    int result[] = new int[]{arr.length*arr[0].length};
    for(int i=0;i<arr.length;i++){
      if(arr[i][0] < arr[i][arr[i].length-1]){
        queue = new PriorityQueue<Node>();

        break;
      }else if (arr[i][0] > arr[i][arr[i].length-1]){
        queue = new PriorityQueue<Node>(arr.length, Collections.reverseOrder());
        break;
      }
    }//else null;

    //
    //if(queue!=null) {

    //}
    return result;
    }
  }

  class Node implements Comparable<Node>{
    int val;
    int row;
    int col;

    public Node(int v, int r, int c){
      this.val=v;
      this.row=r;
      this.col=c;
    }

    @Override
    public int compareTo(Node n){
      return Long.compare(this.val, n.val);
    }
  }

