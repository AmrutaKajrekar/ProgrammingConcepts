package com.main.matrix;

/**
 * Created by 212431401 on 1/26/18.
 */
public class PrintMatrixDiagonally {
        /**
         * @param args
         */
        public static void main(String[] args) {
            // TODO Auto-generated method stub

            int[][] mat = { {1,2,3,4,5},
                    {6,7,8,9,10},
                    {11,12,13,14,15},
                    {16,17,18,19,20}
            };
            printMatrixDiagonally(mat);

        }

        private static void printMatrixDiagonally(int[][] mat) {

            //Down side
            int col = 0;
            for(int row = 0; row < mat.length; row++){
                diagonally(mat, row, col);
                System.out.print("\n");
            }
            //Right side
            int row = mat.length - 1;
            for(col = 1; col < mat[row].length; col++){
                diagonally(mat, row, col);
                System.out.print("\n");
            }

        }
        //using recursion printing matrix diagonally
        private static void diagonally(int[][] mat, int row, int col) {

            //Bundary check
            if(row < 0 || col < 0 || row >= mat.length || col >= mat[0].length){
                return;
            }
            System.out.print(mat[row][col]+" ");
            diagonally(mat, --row, ++col);

        }
}
