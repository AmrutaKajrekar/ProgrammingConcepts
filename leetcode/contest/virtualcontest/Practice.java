package contest.virtualcontest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author amruta.kajrekar on 5/20/18.
 */
public class Practice {

  public static void main(String[] args){
    Practice pr = new Practice();
//    System.out.println(pr.areSimilar(new int[]{0, 0, 0, 1, 1, 0, 0, 0, 0, -3, -3, 0}));
    System.out.println(pr.kNearestNeighbors(5,5,2,new int[][]{{2, 5, 1},{8, 5, 2},{5, 8, 3},{5, 2, 4}}));
  }

  boolean areTrianglesSimilar(int[] coordinates) {
    int[] a= new int[6];
    int[] b= new int[6];

    for (int i=0;i<6;i++){
      a[i]=coordinates[i];
    }
    int k=0;
    for (int i=6;i<coordinates.length;i++){
      b[k]=coordinates[i];
      k++;
    }

    List<Integer> diff = new ArrayList<>();
    for(int i = 0; i < a.length; ++i) {
      if(a[i] != b[i]) diff.add(i);
    }
    int diffCount = diff.size();
    if(diffCount == 0) return true;
    if(diffCount == 2) {
      int index1 = diff.get(0);
      int index2 = diff.get(1);
      if(a[index1] == b[index2] && a[index2] == b[index1]) return true;
    }
    return false;
  }


  boolean areSimilar(int[] coordinates){
    double t1side1 = Math.sqrt(Math.pow(coordinates[2]-coordinates[0],2) + Math.pow(coordinates[3]-coordinates[1],2));
    double t1side2 = Math.sqrt(Math.pow(coordinates[4]-coordinates[0],2) + Math.pow(coordinates[5]-coordinates[1],2));
    double t1side3 = Math.sqrt(Math.pow(coordinates[4]-coordinates[2],2) + Math.pow(coordinates[5]-coordinates[3],2));

    double t2side1 = Math.sqrt(Math.pow(coordinates[8]-coordinates[6],2) + Math.pow(coordinates[9]-coordinates[7],2));
    double t2side2 = Math.sqrt(Math.pow(coordinates[10]-coordinates[6],2) + Math.pow(coordinates[11]-coordinates[7],2));
    double t2side3 = Math.sqrt(Math.pow(coordinates[10]-coordinates[8],2) + Math.pow(coordinates[11]-coordinates[9],2));

    return (Math.toDegrees(Math.atan(t1side1/(t1side2))) == Math.toDegrees(Math.atan(t2side1/(t2side2))) &&
        Math.toDegrees(Math.atan(t1side2/(t1side3))) == Math.toDegrees(Math.atan(t2side2/(t2side3))));
  }


  int kNearestNeighbors(int x, int y, int k, int[][] data) {
    Queue<int[]> pq = new PriorityQueue<int[]>(k, new Comparator<int[]>(){
      public int compare(int[] p1, int[] p2) {
        int d1 = (p1[0] - x) * (p1[0] - x) + (p1[1] - y) * (p1[1] - y);
        int d2 = (p2[0] - x) * (p2[0] - x) + (p2[1] - y) * (p2[1] - y);
        return d2 - d1;
      }
    });
    for (int[] d : data) {
      pq.offer(d);
      if (pq.size() > k)
        pq.poll();
    }
    int[] res = new int[k];
      res = pq.poll();

      Arrays.sort(res);
    return res[0];

  }


  int kNearestNeighbors2(int x, int y, int k, int[][] data) {
    Queue<int[]> pq = new PriorityQueue<int[]>(k, new Comparator<int[]>(){
      public int compare(int[] p1, int[] p2) {
        int d1 = (p1[0] - x) + (p1[1] - y);
        int d2 = (p2[0] - x) + (p2[1] - y);
        return Math.min(d1,d2);
      }
    });
    for (int[] d : data) {
      pq.offer(d);
      if (pq.size() > k)
        pq.poll();
    }
    int[] res = new int[k];
    res = pq.poll();

    Arrays.sort(res);
    return res[0];

  }
}
