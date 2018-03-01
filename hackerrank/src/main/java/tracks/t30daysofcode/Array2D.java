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
        int[][] sample = new int[][]{{1,1,1,0,0,0},{0,1,0,0,0,0},{1,1,1,0,0,0},{0,0,2,4,4,0},{0,0,0,2,0,0},{0,0,1,2,4,0}};
        System.out.println("max value= " + matrix.getHourGlassValue(sample));

    }

    public int getHourGlassValue(int[][] arr){
        int max=0;
        for(int i=1; i<5; i=i+3){
            for(int j=1; j < 6; j++){
                if(arr[i-1][j-1]>0 &&  arr[i-1][j]>0 && arr[i-1][j+1]>0 && arr[i][j]>0
                        && arr[i+1][j-1]>0 && arr[i+1][j]>0 && arr[i+1][j+1]>0){
                    int val = arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1]
                            + arr[i][j]
                            + arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1];
                    if(val>max) max=val;
                }
            }
        }

        return max;
    }
}
