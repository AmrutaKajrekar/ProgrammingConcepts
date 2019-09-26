package problems.arrays;

/**
 * @author amruta.kajrekar on 6/16/18.
 */
public class MaxIncreaseOfSkyline {

    public static void main(String[] args){
        MaxIncreaseOfSkyline skyline = new MaxIncreaseOfSkyline();
        System.out.println(skyline.maxIncreaseKeepingSkyline(new int[][]{{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}}));
    }

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[] row = new int[n];
        int[] col = new int[m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) {
                row[i]=Math.max(grid[i][j],row[i]);
                col[j]=Math.max(grid[i][j],col[j]);
            }
        }

        int inc=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) {
                inc += (Math.min(row[i], col[j])-grid[i][j]);
            }
        }
        return inc;
    }
}
