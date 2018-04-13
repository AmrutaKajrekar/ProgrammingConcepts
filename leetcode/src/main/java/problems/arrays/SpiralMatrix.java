package problems.arrays;

/**
 * @author amruta.kajrekar on 3/3/18.
 * leetcode problem #
 *
 * Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

For example,
Given n = 3,

You should return the following matrix:
[
[ 1, 2, 3 ],
[ 8, 9, 4 ],
[ 7, 6, 5 ]
]
 */
public class SpiralMatrix {

    public static void main(String[] args){
        SpiralMatrix print = new SpiralMatrix();
        print.generateMatrix(3);
    }

    public int[][] generateMatrix(int n) {
        int printNum = 1;
        int[][] matrix = new int[n][n];

        int c0=0, r0=0;
        int cn=n, rn=n;

        while(c0<cn && r0<rn){
            //going right
            for(int i=c0; i<=cn-1;++i){
                matrix[r0][i]=printNum;
                System.out.print(printNum+" ");
                printNum++;
            }
            r0++;
            //going down
            for(int i=r0; i<=rn-1;++i){
                matrix[i][cn-1]=printNum;
                System.out.print(printNum+" ");
                printNum++;
            }cn--;
            //going left
            if(r0<rn){
                for(int i=cn-1; i>=c0;--i){
                    matrix[rn-1][i]=printNum;
                    System.out.print(printNum+" ");
                    printNum++;
                }rn--;
            }
            //going up
            if(c0<cn){
                for(int i=rn-1; i>=r0;--i){
                    matrix[i][c0]=printNum;
                    System.out.print(printNum+" ");
                    printNum++;
                }c0++;
            }
        }
        return matrix;
    }
}
