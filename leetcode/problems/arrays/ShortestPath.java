package problems.arrays;

/**
 * @author amruta.kajrekar on 7/23/18.
 */
public class ShortestPath {
  public static void main(String[] args){
    ShortestPath path = new ShortestPath();
    int[][] result = path.minPathSum(new int[][]{{1,3,1},{1,5,1},{4,2,1}});

  }

  public int[][] minPathSum(int[][] grid) {
    int[][] visited = new int[grid.length][grid[0].length];

    visited[0][0]=grid[0][0];

    for(int i=0; i<grid.length;i++){
      for(int j=0;j<grid[0].length;j++){
          if(!(i==0 && j==0)) {
            int top = (i > 0) ? visited[i - 1][j] : Integer.MAX_VALUE;
            int left = (j > 0) ? visited[i][j - 1] : Integer.MAX_VALUE;
            visited[i][j] = Math.min(top, left) + grid[i][j];
            System.out.print(visited[i][j]);
          }
        }
      }

    return visited;
  }
}
