package problems.hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author amruta.kajrekar on 5/25/18.
 */
public class ValidSudokuChar {

  /**
   *
   [['.','.','4','.','.','.','6','3','.'],['.','.','.','.','.','.','.','.','.'],['5','.','.','.','.','.','.','9','.'],
   ['.','.','.','5','6','.','.','.','.'],['4','.','3','.','.','.','.','.','1'],['.','.','.','7','.','.','.','.','.'],
   ['.','.','.','5','.','.','.','.','.'],['.','.','.','.','.','.','.','.','.'],['.','.','.','.','.','.','.','.','.']]

   [[".",".",".",".",".",".",".",".","."],
   ["6",".","9",".",".","8",".",".","."],
   [".",".",".","4",".","6",".",".","."],
   [".",".",".",".",".",".",".","1","."],
   [".",".",".",".","2",".",".","3","."],
   [".","4",".",".",".",".",".",".","4"],
   ["5",".",".","6",".",".",".",".","."],
   [".",".",".",".",".",".",".",".","."],
   [".",".",".",".","7",".","6",".","."]]

   * @param args
   * @throws Exception
   */
  public static void main(String args[] ) throws Exception {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    char[][] boardTrue = new char[][]{
        {'5','3','.','.','7','.','.','.','.'},
        {'6','.','.','1','9','5','.','.','.'},
        {'.','9','8','.','.','.','.','6','.'},
        {'8','.','.','.','6','.','.','.','3'},
        {'4','.','.','8','.','3','.','.','1'},
        {'7','.','.','.','2','.','.','.','6'},
        {'.','6','.','.','.','.','2','8','.'},
        {'.','.','.','4','1','9','.','.','5'},
        {'.','.','.','.','8','.','.','7','9'}
    };

    char[][] boardFalse = new char[][]{
        {'.','.','4','.','.','.','6','3','.'},
        {'.','.','.','.','.','.','.','.','.'},
        {'5','.','.','.','.','.','.','9','.'},
        {'.','.','.','5','6','.','.','.','.'},
        {'4','.','3','.','.','.','.','.','1'},
        {'.','.','.','7','.','.','.','.','.'},
        {'.','.','.','5','.','.','.','.','.'},
        {'.','.','.','.','.','.','.','.','.'},
        {'.','.','.','.','.','.','.','.','.'}
    };


    char[][] out = new char[][] {
        {'.','.','4','.','.','.','6','3','.'},
    {'.','.','.','.','.','.','.','.','.'},
    {'5','.','.','.','.','.','.','9','.'},
    {'.','.','.','5','6','.','.','.','.'},
    {'4','.','3','.','.','.','.','.','1'},
    {'.','.','.','7','.','.','.','.','.'},
    {'.','.','.','5','.','.','.','.','.'},
    {'.','.','.','.','.','.','.','.','.'},
    {'.','.','.','.','.','.','.','.','.'}
    };
    char[][] board = new char[][]{
        {'8','3','.','.','7','.','.','.','.'},
        {'6','.','.','1','9','5','.','.','.'},
        {'.','9','8','.','.','.','.','6','.'},
        {'8','.','.','.','6','.','.','.','3'},
        {'4','.','.','8','.','3','.','.','1'},
        {'7','.','.','.','2','.','.','.','6'},
        {'.','6','.','.','.','.','2','8','.'},
        {'.','.','.','4','1','9','.','.','5'},
        {'.','.','.','.','8','.','.','7','9'}
    };

    char[][] out2 = new char[][] {{'.','.','.','.','.','.','.','.','.'},{'6','.','9','.','.','8','.','.','.'},{'.','.','.','4','.','6','.','.','.'},{'.','.','.','.','.','.','.','1','.'},{'.','.','.','.','2','.','.','3','.'},{'.','4','.','.','.','.','.','.','4'},{'5','.','.','6','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.'},{'.','.','.','.','7','.','6','.','.'}};
    
    ValidSudokuChar sol = new ValidSudokuChar();
    System.out.println(sol.isValidSudoku(boardFalse));
  }

  private boolean isValidSudoku(char[][] board) {
    Set set = new HashSet();
    for (int i=0;i<9;i++){
      for (int j=0;j<9;j++) {
        if(board[i][j]!='.'){
          if(!set.add(board[i][j] + " row " + i) || !set.add(board[i][j] + " col " + j) ||
                  !set.add(board[i][j] + " grid " + i/3 + "-" + j/3)){
            return false;
          }
        }
      }
    }
    return true;
  }

  public boolean isValidSudoku2(char[][] board) {
    return checkRow(board) && checkColumn(board) && checkSubGrid(board);
  }

  private boolean isValid(char[][] board, int i, int m, int j, int n){
    HashMap<Character,Integer> map = new HashMap<Character, Integer>();
    for(;i<m;i++){
      for(int k=j;k<n;k++){
//        System.out.println(board[i][k]);
        if(board[i][k]!='.'){
          if(!map.containsKey(board[i][k]))
            map.put(board[i][k],1);
          else return false;
        }
      }
    }
    return true;
  }

  private boolean checkSubGrid(char[][] board){
    boolean isValid = true;
    for(int i=0; i<9;i=i+3){
      for(int j=0;j<9;j=j+3){
        isValid = isValid && isValid(board, i,i+3,j,j+3);
      }
    }
    return isValid;
  }
  private boolean checkRow(char[][] board){
    for(int i=0;i<board.length;i++){
//      if(i==5)
//      System.out.println(board[i]);
      boolean val = areElementsUnique(board[i]);
      //System.out.println(val);
      if(val==false) return false;
    }
    return true;
  }

  private boolean areElementsUnique(char[] board){
    HashMap<Character,Integer> map = new HashMap<Character, Integer>();

    for(int i=0;i<board.length;i++){
      if(board[i]!='.'){
        if(!map.containsKey(board[i]))
          map.put(board[i],1);
        else return false;
      }
    }

    return true;
  }

  private boolean checkColumn(char[][] board){
    for(int j=0;j<board.length;j++){
      char[] column = new char[board[0].length];
      for(int i=0;i<board.length;i++){
//        System.out.println('board[i][j] = ' + board[i][j]);
        column[i]=board[i][j];
      }
      if(areElementsUnique(column)==false) return false;
    }
    return true;
  }
}
