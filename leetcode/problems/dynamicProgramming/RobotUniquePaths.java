package problems.dynamicProgramming;


/**
 * @author amruta.kajrekar on 3/14/18.
 * leetcode problem # 64
 *
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 * The robot can only move either down or right at any point in time.
 * The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 * How many possible unique paths are there?
 * Note: m and n will be at most 100.
 */

public class RobotUniquePaths {

    public static void main(String[] args){
        RobotUniquePaths path = new RobotUniquePaths();
        System.out.println(path.uniquePaths(7,3));
    }

    public int uniquePaths(int m, int n) {
        int[][] visited = new int[m][n];

        for(int i=0;i<m;i++){
            visited[i][0]=1;
        }
        for(int i=0;i<n;i++){
            visited[0][i]=1;
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                visited[i][j]=visited[i-1][j]+visited[i][j-1];
            }
        }

        return visited[m-1][n-1];
    }
}
