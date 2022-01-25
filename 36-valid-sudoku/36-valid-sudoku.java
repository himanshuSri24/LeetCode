class Solution {
    
    public boolean isValidRow(char[][] board, char ch, int row, int col)
    {
        for(int i = col + 1; i < 9; i ++)
        {
            if(board[row][i] == ch)
                return false;
        }
        return true;
    }
    
    public boolean isValidCol(char[][] board, char ch, int row, int col)
    {
        for(int i = row + 1; i < 9; i ++)
        {
            if(board[i][col] == ch)
                return false;
        }
        return true;
    }
    
    public boolean isValidBox(char[][] board, char ch, int row, int col)
    {
        int sr = (row/3) * 3;
        int sc = (col/3) * 3;
        for(int i = sr; i < sr + 3; i ++)
        {
            for(int j = sc; j < sc + 3; j ++)
            {
                if(i == row && j == col)
                    continue;
                if(board[i][j] == ch)
                    return false;
            }
        }
        return true;
    }
    
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < board.length; i ++)
        {
            for(int j = 0; j < board[0].length; j ++)
            {
                char ch = board[i][j];
                if(ch == '.')
                    continue;
                if(!(isValidRow(board, ch, i, j) && isValidCol(board, ch, i, j) && isValidBox(board, ch, i, j)))
                    return false;
            }
        }
        return true;
    }
}