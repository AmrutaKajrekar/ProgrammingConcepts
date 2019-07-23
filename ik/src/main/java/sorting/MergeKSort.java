package main.java.sorting;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author amruta.kajrekar on 7/14/19.
 */
public class MergeKSort {

  static int[] mergeArrays(int[][] arr) {
    if(arr==null) return null;
    if(arr.length==0) return new int[0];

    int result[] = new int[arr.length*arr[0].length];
    PriorityQueue heap = new PriorityQueue();
    //1. read through the array's 0th elements
    //insert all elements in the min heap
    for(int i=0;i<arr.length;i++) {
      heap.add(arr[i][0]);
    }

    //while heap has elements, get the min element and add another one
    while(!heap.isEmpty()) {

    }
    return result;
  }

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

}
