package problems.arrays;
import java.util.Arrays;

/**
 * @author amruta.kajrekar on 9/19/19.
 */
public class Doordash {

// Given an 2-dimensional array of integers,
// find the size of the largest contiguous block
// (horizontally/vertically connected only) of numbers with the same value.

// 1)

// 1 1 1 2 4
// 5 1 5 3 1
// 3 4 2 1 1

// a total of 4 (1s)

// ------------

// 2)

// 3 3 3 3 3 1
// 3 4 4 4 3 4
// 2 4 3 3 3 4
// 2 4 4 4 4 4

// 11 (of 4s)
int[][] visited;
int max=0;

  public int[] contigous(int[][] arr){
    int[] ret = new int[2];
    if(arr==null || arr.length==0) return ret;

    visited = new int[arr.length][arr[0].length];
    for(int i=0;i<arr.length;i++)
      Arrays.fill(visited[i],0);

    for(int i=0;i<arr.length;i++){
      for(int j=0; j<arr[0].length;j++){
        //System.out.println(visited[i][j]);
        if(visited[i][j]==0) {
          max = 0;
          int k = dfs(arr, i, j);
          if (ret[0] < max) {
            ret[0] = max;
            ret[1] = k;
          }
        }
      }
    }

    System.out.println(ret[0]+"," + ret[1]);
    return ret;
  }

  private int dfs(int[][] arr, int i, int j) {
    if(i>=0 && i<arr.length && j>=0 && j<arr[0].length && visited[i][j]==0) {
      max++;
      visited[i][j]=1;
      if (i<arr.length-1 && arr[i][j] == arr[i + 1][j])
        dfs(arr, i + 1, j);
      if (j<arr[0].length-1 && arr[i][j] == arr[i][j + 1])
        dfs(arr, i, j + 1);
      if (i>0 && arr[i][j] == arr[i - 1][j])
        dfs(arr, i - 1, j);
      if (j>0 && arr[i][j] == arr[i][j - 1])
        dfs(arr, i, j - 1);
    }
    return arr[i][j];
  }

  public static void main(String[] args) {
    Doordash sol = new Doordash();
    int[][] arr = new int[][]{{3,3,3,3,3,1},{3,4,4,4,3,4}, {2,4,3,3,3,4},{2,4,4,4,4,4}};
    int[][] arr2 = new int[][]{{1,1,1,2,4},{5,1,5,3,1},{3,4,2,1,1}};

    sol.contigous(arr2);

  }
  }
