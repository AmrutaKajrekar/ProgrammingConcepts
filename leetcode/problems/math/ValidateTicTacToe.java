package problems.math;

/**
 * @author amruta.kajrekar on 7/31/18.
 * problem 794 :
 * A Tic-Tac-Toe board is given as a string array board. Return True if and only if it is possible to reach this board position during the course of a valid tic-tac-toe game.

The board is a 3 x 3 array, and consists of characters " ", "X", and "O".  The " " character represents an empty square.

Here are the rules of Tic-Tac-Toe:

Players take turns placing characters into empty squares (" ").
The first player always places "X" characters, while the second player always places "O" characters.
"X" and "O" characters are always placed into empty squares, never filled ones.
The game ends when there are 3 of the same (non-empty) character filling any row, column, or diagonal.
The game also ends if all squares are non-empty.
No more moves can be played if the game is over.
Example 1:
Input: board = ["O  ", "   ", "   "]
Output: false
Explanation: The first player always plays "X".

Example 2:
Input: board = ["XOX", " X ", "   "]
Output: false
Explanation: Players take turns making moves.

Example 3:
Input: board = ["XXX", "   ", "OOO"]
Output: false

Example 4:
Input: board = ["XOX", "O O", "XOX"]
Output: true
Note:

board is a length-3 array of strings, where each string board[i] has length 3.
Each board[i][j] is a character in the set {" ", "X", "O"}.
 */
public class ValidateTicTacToe {

  public static void main(String[] args){
    ValidateTicTacToe tic = new ValidateTicTacToe();
    System.out.print(tic.validTicTacToe(new String[] {"XXX", "   ", "OOO"}));
  }
  public boolean validTicTacToe(String[] board) {
    boolean res = false;

    Character[][] b = new Character[3][3];
    for(int b1=0;b1<board.length;b1++){
      String s = board[b1];
      char[] c = s.toCharArray();
//      if(c[0])

    }
    return res;
  }
}
