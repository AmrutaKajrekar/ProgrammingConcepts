package interviews;

// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class test4
{
  public static void main(String[] args){
    test4 t = new test4();
    List<List<Integer>> l1 = new ArrayList<List<Integer>>();
    List<Integer> l2 = new ArrayList<Integer>();
    l2.add(0);
    l2.add(0);
    l2.add(9);
    l2.add(0);
    l2.add(0);
    List<Integer> l3 = new ArrayList<Integer>();
    l3.add(0);
    l3.add(0);
    l3.add(0);
    l3.add(0);
    l3.add(0);
    l1.add(l2);
    l1.add(l3);
    System.out.print(t.removeObstacle(2,5,l1));
  }
  // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
  int removeObstacle(int numRows, int numColumns, List<List<Integer>> lot)
  {
    // WRITE YOUR CODE HERE
    int[][] dist = new int[numRows][numColumns];
    int[][] nums = new int[lot.size()][lot.get(0).size()];
    for(int[] row: dist){
      Arrays.fill(row, Integer.MAX_VALUE);
    }
    int i=0,j=0;
    for(List<Integer> row: lot){
      for(Integer col:row){
        nums[i][j] = col;
        j++;
      }
      i++;
      j=0;
    }
    //Integer[][] ori = lot.stream().map(l-> l.stream.toArray(Integer[]::new)).toArray(Integer[][]::new);
    return shortest(nums);
  }

  public int shortest(int[][] lot){
    int[][] visited = new int[lot.length][lot[0].length];
    for(int i=0;i<lot.length;i++) visited[i][0] = 1;
    for(int i=0;i<lot[0].length;i++) visited[0][i] = 1;

    for(int i=0;i<lot.length;i++){
      for(int j=0;j<lot[0].length;j++){
        if(i-1>=0 && i-1< lot.length && j-1>=0 && j-1<lot[0].length) {
          visited[i][j] = visited[i - 1][j] + visited[i][j - 1];
          if (lot[i][j] == 9)
            return visited[i][j];
        }
      }
    }

    return visited[visited.length-1][visited[0].length-1];
  }

  // METHOD SIGNATURE ENDS
}
