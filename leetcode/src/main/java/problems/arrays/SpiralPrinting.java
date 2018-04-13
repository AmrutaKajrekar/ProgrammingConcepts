package problems.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author amruta.kajrekar on 3/3/18.
 * leetcode problem #54
 *
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

For example,
Given the following matrix:

[
[ 1, 2, 3 ],
[ 4, 5, 6 ],
[ 7, 8, 9 ]
]
You should return [1,2,3,6,9,8,7,4,5].
 */
public class SpiralPrinting {
    public static void main(String[] args){

        SpiralPrinting print = new SpiralPrinting();
        int[][] array = new int[][]{{2,3}};
//                {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        print.spiralOrder(array);
    }


    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length==0) return null;

        ArrayList list = new ArrayList();

        int r0=0, c0=0;
        int rn=matrix.length;
        int cn=matrix[0].length;


        while(r0<rn && c0<cn){
            //going right
            for(int i=c0;i<cn;++i){
                list.add(matrix[r0][i]);
                System.out.print(matrix[r0][i]+" ");
            }
            r0++;
            //going down
            for(int i=r0;i<rn;++i){
                list.add(matrix[i][cn-1]);
                System.out.print(matrix[i][cn-1]+" ");
            }
            cn--;
            //going left
            if(r0<rn){
                for (int i=cn-1; i>=c0;--i){
                    list.add(matrix[rn-1][i]);
                    System.out.print(matrix[rn-1][i]+" ");
                }
                rn--;
            }
            //going up
            if(c0<cn){
                for (int i=rn-1; i>=r0;--i){
                    list.add(matrix[i][c0]);
                    System.out.print(matrix[i][c0]+" ");
                }
                c0++;
            }
        }
        return list;
    }

}
