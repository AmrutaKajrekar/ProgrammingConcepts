package tracks.t30daysofcode;

/**
 * @author amruta.kajrekar on 2/28/18.
 * Day11
 */
public class Array2D {

    public static void main(String[] args) {
        Array2D matrix = new Array2D();
//        Scanner in = new Scanner(System.in);
//        int arr[][] = new int[6][6];
//        for(int i=0; i < 6; i++){
//            for(int j=0; j < 6; j++){
//                arr[i][j] = in.nextInt();
//            }
//        }
        int[][] sample = new int[][]{{1,1,1,0,0,0},{0,1,0,0,0,0},{1,1,1,0,0,0},{0,9,2,-4,-4,0},{0,0,0,-2,0,0},{0,0,-1,-2,-4,0}};
        int[][] test11 = new int[][]{{3,7,-3,0,1,8},{1,-4,-7,-8,-6,5},{-8,1,3,3,5,7},{-2,4,3,1,2,7},{2,4,-5,1,8,4},{5,-7,6,5,2,8}};
        System.out.println("max value= " + matrix.getHourGlassValue(test11));

    }

    /**
     * -1 -1 0 -9 -2 -2
     -2 -1 -6 -8 -2 -5
     -1 -1 -1 -2 -3 -4
     -1 -9 -2 -4 -4 -5
     -7 -3 -3 -2 -9 -9
     -1 -3 -1 -2 -4 -5 ======-6

     1 1 1 0 0 0
     0 1 0 0 0 0
     1 1 1 0 0 0
     0 9 2 -4 -4 0
     0 0 0 -2 0 0
     0 0 -1 -2 -4 0 =========13


     7 6 8 2 4 3
     7 3 3 0 6 1
     3 8 7 7 2 2
     0 8 6 8 6 1
     7 1 6 0 2 4
     2 7 8 1 7 4 ====== 44

     * @param mat
     * @return
     */
    public int getHourGlassValue(int[][] mat){
        int max=0;
        for(int i=1; i<5; i++){
            for(int j=1; j < 5; j++){
                if(mat[i-1][j-1]!=0 &&  mat[i-1][j]!=0 && mat[i-1][j+1]!=0 && mat[i][j]!=0
                        && mat[i+1][j-1]!=0 && mat[i+1][j]!=0 && mat[i+1][j+1]!=0){
                    int val = mat[i-1][j-1] + mat[i-1][j] + mat[i-1][j+1]
                            + mat[i][j]
                            + mat[i+1][j-1] + mat[i+1][j] + mat[i+1][j+1];
                    if(val>max) max=val;
                }
            }
        }

        return max;
    }
}
