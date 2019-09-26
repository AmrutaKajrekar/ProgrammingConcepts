package problems.arrays;

/**
 * @author amruta.kajrekar on 3/9/18.
 * leetcode problem #130
 *
 * Given a 2D board containing 'X' and 'O' (the letter O), capture all regions surrounded by 'X'.
 * A region is captured by flipping all 'O's into 'X's in that surrounded region.

For example,
X X X X
X O O X
X X O X
X O X X

After running your function, the board should be:
X X X X
X X X X
X X X X
X O X X
 */
public class SurroundedRegions {

    public static void main(String[] args){
        SurroundedRegions region = new SurroundedRegions();
        char[][] reg = new char[][]{{'O','O','O'},{'O','O','O'},{'O','O','O'}};
//        char[][] reg = new char[][]{{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
        region.solve(reg);
        for (int i=0;i<reg.length;i++){
            for(int j=0;j<reg[0].length;j++){
                System.out.print(reg[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

    public void solve(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                dfs(board,i,j);
            }
        }
    }

    private void dfs(char[][] board, int i,int j){
        if(board[i][j]!='O') return;
        int[] row = new int[]{-1,0,0,1};
        int[] col = new int[]{0,-1,1,0};

        boolean isSafe = true;
        for (int k = 0; k < 4; k++) {
            isSafe = isSafe && isSafe(board, i + row[k], j + col[k]);

        }
        if(isSafe){ board[i][j] = 'X';}
    }

    private boolean isSafe(char[][] board, int i, int j){
        boolean safe =  (i>=0 && i<board.length && j>=0 && j<board.length);
        //System.out.println(i+","+j+"=" +safe);
        return safe;
    }



    public void solve2(char[][] board) {
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[0].length;j++){
                if(board[i][j]=='O'){
                    dfs2(board, i, j);
                }
            }
        }
    }

    private void dfs2(char[][] board, int i, int j) {
        int[] rowN={-1,0,0,1};
        int[] colN={0,-1,1,0};

        boolean all4Safe = true;
        for(int k=0;k<4;k++){
            all4Safe = all4Safe && isSafe2(board,i+rowN[k],j+colN[k]);
//                board[i+rowN[k]][j+colN[k]] = 'X';
//                dfs(board,i+rowN[k], j+colN[k]);
//            }
        }
        if(all4Safe){
            board[i][j]='X';
        }
    }

    private boolean isSafe2(char[][] board, int i, int j) {
        return (i>=0 && i<board.length && j>=0 && j<board[0].length);
    }
}


/* actual dfs: but this gives stackoverflow error:
public void solve(char[][] board) {
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[0].length;j++){
                if(board[i][j]=='O'){
                    dfs(board, i, j);
                }
            }
        }
    }

    private void dfs(char[][] board, int i, int j) {
        int[] rowN={-1,0,0,1};
        int[] colN={0,-1,1,0};

        for(int k=0;k<4;k++){
            if(isSafe(board,i+rowN[k],j+colN[k])){
                board[i+rowN[k]][j+colN[k]] = 'X';
                dfs(board,i+rowN[k], j+colN[k]);
            }
        }
    }

    private boolean isSafe(char[][] board, int i, int j) {
        return (i>=0 && i<board.length && j>=0 && j<board[0].length && board[i][j]=='O');
    }
 */
