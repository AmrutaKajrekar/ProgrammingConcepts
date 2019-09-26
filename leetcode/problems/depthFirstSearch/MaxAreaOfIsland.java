package problems.depthFirstSearch;

/**
 * @author amruta.kajrekar on 4/30/18.
 * leetcode problem #695
 * Given a non-empty 2D array grid of 0's and 1's, an island is a group of 1's (representing land)
 * connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.

Find the maximum area of an island in the given 2D array. (If there is no island, the maximum area is 0.)

Example 1:
[[0,0,1,0,0,0,0,1,0,0,0,0,0],
[0,0,0,0,0,0,0,1,1,1,0,0,0],
[0,1,1,0,1,0,0,0,0,0,0,0,0],
[0,1,0,0,1,1,0,0,1,0,1,0,0],
[0,1,0,0,1,1,0,0,1,1,1,0,0],
[0,0,0,0,0,0,0,0,0,0,1,0,0],
[0,0,0,0,0,0,0,1,1,1,0,0,0],
[0,0,0,0,0,0,0,1,1,0,0,0,0]]
Given the above grid, return 6. Note the answer is not 11, because the island must be connected 4-directionally.
Example 2:
[[0,0,0,0,0,0,0,0]]
Given the above grid, return 0.
Note: The length of each dimension in the given grid does not exceed 50.


 11000
 11010
 11100
 01000
 */
public class MaxAreaOfIsland {

    int countIsland=0;
    public static void main(String[] args){
        MaxAreaOfIsland area = new MaxAreaOfIsland();
        int[][] island = new int [][]{{1,1,0,0,0},{1,1,0,0,0},{0,0,0,1,1},{0,0,0,1,1}};
//                {{0,0,0,0,0},{0,1,0,1,0},{0,0,0,0,0},{0,0,0,0,0}};
                //{{0,0,1},{0,0,1},{0,0,1}};
//        area.maxAreaOfIsland(island);
        System.out.print(area.maxAreaOfIsland(island));
    }

    public int maxAreaOfIsland(int[][] grid) {
        if(grid.length==0) return 0;
        int count =Integer.MIN_VALUE;
        int ROW = grid.length;
        int COL = grid[0].length;

        boolean[][] visited = new boolean[ROW][COL];

        for(int i=0;i<ROW;i++){//each row
            for(int j=0;j<COL;j++) {//each col
                if(grid[i][j]==1 && !visited[i][j]){
                    int area = dfs(grid, i, j, visited);
                    count= Math.max(count, 1+ countIsland);
                }
            }
        }

        return count;
    }

    private int dfs(int[][] grid, int i, int j, boolean[][] visited) {
        int[] rowN={-1,-1,-1,0,0,1,1,1};
        int[] colN={-1,0,1,-1,1,-1,0,1};

        visited[i][j] =true;

        for (int k=0;k<8;k++){
            if(isSafe(grid,i+rowN[k], j+colN[k], visited)){
                countIsland=dfs(grid,i+rowN[k], j+colN[k], visited);
                countIsland++;
                System.out.println("countIsland="+countIsland+ "for position="+i+","+j);
            }
        }
        return countIsland;
    }

    private boolean isSafe(int[][] grid, int m, int n, boolean[][] visited) {
        return (m>=0 && m<grid.length && n>=0 && n<grid[0].length && grid[m][n]==1 && !visited[m][n]);
    }

}
