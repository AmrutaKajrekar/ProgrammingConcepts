package interviews;

/**
 * @author amruta.kajrekar on 5/24/18.
 */
/* this board is valid and does not have zeroes
{
    { 1,2,3,4,5,6,7,8,9 },
    { 4,5,6,7,8,9,1,2,3 },
    { 7,8,9,1,2,3,4,5,6 },
    { 8,9,1,2,3,4,5,6,7 },
    { 2,3,4,5,6,7,8,9,1 },
    { 5,6,7,8,9,1,2,3,4 },
    { 6,7,8,9,1,2,3,4,5 },
    { 9,1,2,3,4,5,6,7,8 },
    { 3,4,5,6,7,8,9,1,2 }
};
*/


import java.util.HashMap;

public class SudokuValidator {
  public static void main(String args[] ) throws Exception {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int[][] board = new int[][]{
        { 0,0,0,4,5,1,0,0,0 },
        { 0,0,0,7,8,9,0,0,0 },
        { 0,0,0,6,2,3,0,0,0 },
        { 0,0,0,0,0,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,0 },
        { 0,0,0,0,0,1,0,0,0 },
        { 0,0,0,0,0,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,0 }
    };

    SudokuValidator sol = new SudokuValidator();
    System.out.println(sol.isValidBoard(board));
  }

  boolean isValidBoard(int[][] board) {
    //checkRow()
    //checkColumn()
    //checkSubGrid()
    return checkRow(board) && checkColumn(board) && checkSubGrid(board);
  }

  private boolean isValid(int[][] board, int i, int m, int j, int n){
    HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
    for(;i<m;i++){
      for(int k=j;k<n;k++){
//        System.out.println(board[i][k]);
        if(board[i][k]!=0){
          if(!map.containsKey(board[i][k]))
            map.put(board[i][k],1);
          else return false;
        }
      }
    }
    return true;
  }

  private boolean checkSubGrid(int[][] board){
    boolean isValid = true;
    for(int i=0; i<9;i=i+3){
      for(int j=0;j<9;j=j+3){
        isValid = isValid && isValid(board, i,i+3,j,j+3);
      }
    }
    return isValid;
  }
  private boolean checkRow(int[][] board){
    for(int i=0;i<board.length;i++){
      //System.out.println(board[i]);
      boolean val = areElementsUnique(board[i]);
      //System.out.println(val);
      if(val==false) return false;
    }
    return true;
  }

  private boolean areElementsUnique(int[] board){
    HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();

    for(int i=0;i<board.length-1;i++){
      if(board[i]!=0){
        if(!map.containsKey(board[i]))
          map.put(board[i],1);
        else return false;
      }
    }

    return true;
  }

  private boolean checkColumn(int[][] board){
//    int col = 0;
    for(int j=0;j<board.length;j++){
      int[] column = new int[board[0].length];
      for(int i=0;i<board.length;i++){
        // System.out.println("board[i][col] = " + board[i][col]);
        column[i]=board[i][j];
      }
      if(areElementsUnique(column)==false) return false;
    }
    return true;
  }

  private boolean checkSubGrid2(int[][] board){
    HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        System.out.println(board[i][j]);
        if(board[i][j]!=0){
          if(!map.containsKey(board[i][j]))
            map.put(board[i][j],1);
          else return false;
        }
      }
    }
    map = new HashMap<Integer, Integer>();
    for(int i=0;i<3;i++){
      for(int j=3;j<6;j++){
        System.out.println(board[i][j]);
        if(board[i][j]!=0){
          if(!map.containsKey(board[i][j]))
            map.put(board[i][j],1);
          else return false;
        }
      }
    }
    map = new HashMap<Integer, Integer>();
    for(int i=0;i<3;i++){
      for(int j=6;j<9;j++){
        if(board[i][j]!=0){
          if(!map.containsKey(board[i][j]))
            map.put(board[i][j],1);
          else return false;
        }
      }
    }
    map = new HashMap<Integer, Integer>();
    for(int i=3;i<6;i++){
      for(int j=0;j<3;j++){
        System.out.println(board[i][j]);
        if(board[i][j]!=0){
          if(!map.containsKey(board[i][j]))
            map.put(board[i][j],1);
          else return false;
        }
      }
    }
    map = new HashMap<Integer, Integer>();
    for(int i=3;i<6;i++){
      for(int j=3;j<6;j++){
        System.out.println(board[i][j]);
        if(board[i][j]!=0){
          if(!map.containsKey(board[i][j]))
            map.put(board[i][j],1);
          else return false;
        }
      }
    }
    map = new HashMap<Integer, Integer>();
    for(int i=3;i<6;i++){
      for(int j=6;j<9;j++){
        System.out.println(board[i][j]);
        if(board[i][j]!=0){
          if(!map.containsKey(board[i][j]))
            map.put(board[i][j],1);
          else return false;
        }
      }
    }
    map = new HashMap<Integer, Integer>();
    for(int i=6;i<9;i++){
      for(int j=0;j<3;j++){
        System.out.println(board[i][j]);
        if(board[i][j]!=0){
          if(!map.containsKey(board[i][j]))
            map.put(board[i][j],1);
          else return false;
        }
      }
    }
    map = new HashMap<Integer, Integer>();
    for(int i=6;i<9;i++){
      for(int j=3;j<6;j++){
        System.out.println(board[i][j]);
        if(board[i][j]!=0){
          if(!map.containsKey(board[i][j]))
            map.put(board[i][j],1);
          else return false;
        }
      }
    }
    map = new HashMap<Integer, Integer>();
    for(int i=6;i<9;i++){
      for(int j=6;j<9;j++){
        System.out.println(board[i][j]);
        if(board[i][j]!=0){
          if(!map.containsKey(board[i][j]))
            map.put(board[i][j],1);
          else return false;
        }
      }
    }
    return true;
  }

}

//2d array
//every row, col, and check for duplicates - return false;

/*
 * Sudoku is a game played on a 9x9 grid.
 * A description of Sudoku is here: https://en.wikipedia.org/wiki/Sudoku
 *
 * In short, the object of the game is to fill in every square on the grid
 * with a number, 1-9, so that:
 *
 *   Every row contains the numbers 1-9
 *   Every column contains the numbers 1-9
 *   Each of the 9 3x3 sub-grids contains the numbers 1-9
 *
 * Write a validator for a Sudoku board. We will also use the integer 0 to
 * indicate empty spaces that have not been filled in yet. Duplicate 0 entries
 * in rows, columns, and 3x3 sub-grids are valid.
 *
 *
 * // isValidBoard should return false if board has any non-zero duplicates in its
 * // rows, in its columns, or in its 3x3 subgrids. Otherwise isValidBoard should
 * // return true.
 *
 * boolean isValidBoard(int[][] board) {
 *  // TODO: fill this in
 *  return false;
 * }
 *
 */
