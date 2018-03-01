package virtualcontest;

/**
 * @author amruta.kajrekar
 * leetcode problem #598
 */
public class RangeAddition {

    public static void main(String[] args){
        int[][] ops = new int[][]{};
        RangeAddition range= new RangeAddition();
        System.out.println(range.maxCount(3,3,ops));
    }

    public int maxCount(int m, int n, int[][] ops) {
        if(ops.length==0) return m*n;

        int row= Integer.MAX_VALUE;
        int col= Integer.MAX_VALUE;

        for (int[] i:ops){
            row=Math.min(row, i[0]);
            col=Math.min(col, i[1]);
        }
        return row*col;
    }
    public int maxCount2(int m, int n, int[][] ops) {

        if((m<1 || m>40000) && (n<1 || n>40000)) return -1;

        int[][] matrix = new int[m][n];
        int max=Integer.MIN_VALUE;
        int max_cnt = 0;
        for (int i=0; i<ops.length; i++){//for each row
            //traverse matrix and add 1 to each until a and b

            for (int j=0;j<ops[i][0] ;j++){
                for (int k=0;k<ops[i][1]; k++){
                    matrix[j][k]+=1;
                    if(matrix[j][k]>max){
                        max = matrix[j][k];
                        max_cnt=1;
                    }
                    else if(matrix[j][k]==max){
                        max_cnt++;
                    }
                }
            }
        }
        return max_cnt;
    }
}
