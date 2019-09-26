package problems.arrays;

/**
 * @author amruta.kajrekar on 3/7/18.
 *leetcode problem # 200
 *
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands.
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
 * You may assume all four edges of the grid are all surrounded by water.
 *
 * Example 1:

11110
11010
11000
00000
Answer: 1

Example 2:

11000
11000
00100
00011
Answer: 3
 */
public class NumberOfIslands {

    public static void main(String[] args){
        NumberOfIslands islands = new NumberOfIslands();
        char[][] grid = new char[][]{{1,1,1,1,0},{1,1,0,1,0},{1,1,0,0,0},{0,0,0,0,0}};
//                {{1,1,0,0,0},{1,1,0,0,0},{0,0,1,0,0},{0,0,0,1,1}};
//                {{1, 1, 0, 0, 0}, {0, 1, 0, 0, 1}, {1, 0, 0, 1, 1}, {0, 0, 0, 0, 0}, {1, 0, 1, 0, 1}};
//                {{1,1,0,0,0},{1,1,0,0,0},{0,0,1,0,0},{0,0,0,1,1}};
        System.out.println(islands.numIslands(grid));
    }
//     ROW = 0, COL=0;
    public int numIslands(char[][] grid) {
        if(grid.length==0) return 0;
        int count=0;
        int ROW=grid.length;
        int COL=grid[0].length;
        boolean[][] visited = new boolean[ROW][COL];

        for(int i=0;i<ROW;i++){
            for(int j=0;j<COL;j++){
                if(grid[i][j]==1 && !visited[i][j]){
                    dfs(grid, i, j, visited);
                    count++;
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int i, int j, boolean[][] visited) {
        int[] rowN={-1,0,0,1};
        int[] colN={0,-1,1,0};

        visited[i][j]=true;

        for(int k=0;k<4; k++){
            if(isSafe(grid,i+rowN[k], j+colN[k], visited)) {
                dfs(grid, i + rowN[k], j + colN[k], visited);
            }
        }
    }

    private boolean isSafe(char[][] grid, int m, int n, boolean[][] visited) {
        return (m>=0 && m<grid.length && n>=0 && n<grid[0].length && grid[m][n]==1 && !visited[m][n]);
    }
}
