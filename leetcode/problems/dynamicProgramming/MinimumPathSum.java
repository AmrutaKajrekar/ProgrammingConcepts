package problems.dynamicProgramming;

/**
 * @author amruta.kajrekar on 3/14/18.
 * leetcode problem #64
 *
 * Given a m x n grid filled with non-negative numbers,
 * find a path from top left to bottom right which minimizes the sum of all numbers along its path.
 * Note: You can only move either down or right at any point in time.

Example 1:
[[1,3,1],
[1,5,1],
[4,2,1]]
Given the above grid map, return 7. Because the path 1→3→1→1→1 minimizes the sum.
 */
public class MinimumPathSum {

    public static void main(String[] args){
        MinimumPathSum min = new MinimumPathSum();
        System.out.println(min.minPathSum(new int[][]{{1,2},{5,6},{1,1}})); //{{1,3,1},{1,5,1},{4,2,1}}
    }

    public int minPathSum(int[][] grid) {
        int[][] visited = new int[grid.length][grid[0].length];

        visited[0][0]=grid[0][0];

        for(int i=1;i<grid.length;i++){
            visited[i][0] = visited[i-1][0] + grid[i][0];
        }
        for(int i=1;i<grid[0].length;i++){
            visited[0][i] = visited[0][i-1] + grid[0][i];
        }

        for(int i=1; i<grid.length;i++){
            for(int j=1;j<grid[0].length;j++){
               //Min of up and left goes to visited of [i][j]

                int up = visited[i-1][j] + grid[i][j];
                int left = visited[i][j-1] + grid[i][j];
                visited[i][j] = Math.min(up,left);
            }
        }

        return visited[grid.length-1][grid[0].length-1];
    }
}
