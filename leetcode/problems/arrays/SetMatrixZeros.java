package problems.arrays;

/**
 * @author amruta.kajrekar on 7/25/18.
 * problem:
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.

Example 1:

Input:
[
[1,1,1],
[1,0,1],
[1,1,1]
]
Output:
[
[1,0,1],
[0,0,0],
[1,0,1]
]
Example 2:

Input:
[
[0,1,2,0],
[3,4,5,2],
[1,3,1,5]
]
Output:
[
[0,0,0,0],
[0,4,5,0],
[0,3,1,0]
]
Follow up:

A straight forward solution using O(mn) space is probably a bad idea.
A simple improvement uses O(m + n) space, but still not the best solution.
Could you devise a constant space solution?
 */
public class SetMatrixZeros {

  public static void main(String[] args){
    SetMatrixZeros set = new SetMatrixZeros();
    set.setZeroes(new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}});
  }

  public void setZeroes(int[][] matrix) {
    int i=0, j=0;
    boolean firstRowHasZero= false, firstColHasZero = false;
    for(j=0; j<matrix[0].length;j++) {
      if(matrix[0][j]==0) {
        firstRowHasZero = true;
      }
    }

    for(j=0; j<matrix.length;j++) {
      if(matrix[j][0]==0) {
        firstColHasZero = true;
      }
    }

    for(i=0; i<matrix.length; i++) {
      for(j=0; j<matrix[i].length;j++) {
        if(matrix[i][j]==0) {
          matrix[i][0] = 0;
          matrix[0][j] = 0;
        }
      }
    }



    for(i=1; i<matrix.length;i++) {
      if(matrix[i][0] == 0) {
        nullifyRow(i, matrix);

      }
    }

    for(i=1; i<matrix[0].length;i++) {
      if(matrix[0][i] == 0) {

        nullifyCol(i, matrix);
      }
    }

    if(firstRowHasZero) {
      nullifyRow(0, matrix);
    }
    if(firstColHasZero){
      nullifyCol(0,matrix);
    }
  }


  public  void nullifyRow(int row, int[][] matrix) {
    for(int i=0; i<matrix[0].length;i++) {
      matrix[row][i]= 0;
    }
  }

  public  void nullifyCol(int col, int[][] matrix) {
    for(int i=0; i<matrix.length;i++) {
      matrix[i][col]= 0;
    }
  }


  public void setZeroes2(int[][] matrix) {
    for(int i=0;i<matrix.length;i++){
      for(int j=0;j<matrix[0].length;j++){
        if(matrix[i][j]==0){
          setRowColZero(i,j, matrix);
        }
      }
    }

    for(int i=0;i<matrix.length;i++){
      for(int j=0;j<matrix[0].length;j++){
        if(matrix[i][j]==-1) matrix[i][j]=0;
      }
    }

  }


  private void setRowColZero(int i, int j, int[][] matrix) {
    for(int k=0;k<matrix[i].length;k++){
      if(matrix[i][k]!=0)
      matrix[i][k] = -1;
    }
    for(int k=0;k<matrix.length;k++){
      if(matrix[k][j]!=0)
      matrix[k][j] = -1;
    }
  }

}
