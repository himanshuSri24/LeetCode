class Solution {
    
    public void flipRow(int[][] grid, int row)
    {
        for(int i = 0; i < grid[0].length; i ++)
            grid[row][i] ^= 1;
    }
    
    public void flipCol(int[][] grid, int col)
    {
        for(int i = 0; i < grid.length; i ++)
        {
            grid[i][col] ^= 1;
        }
    }
    
    public int numberInRow(int[] row)
    {
        StringBuilder sb = new StringBuilder("");
        for(int ele : row)
            sb.append(""+ele);
        return Integer.valueOf(Integer.toString(Integer.parseInt(sb.toString(), 2), 10));
    }
    
    public int matrixScore(int[][] grid) {
        int count = 0, currOne = 0, sum = 0;
        for(int i = 0; i < grid.length; i ++)
        {
                // System.out.println(Arrays.toString(grid[i]));
            if(grid[i][0] == 0)
            {
                flipRow(grid, i);
            }
        }
        for(int j = 0; j < grid[0].length; j ++)
        {
            currOne = 0;
            for(int i = 0; i < grid.length; i ++)
            {
                if(grid[i][j] == 1)
                    currOne ++;
            }
            if(currOne * 2 < grid.length)
                flipCol(grid, j);
        }
        for(int[] row : grid)
        {
            int currNum = numberInRow(row);
            // System.out.println(Arrays.toString(row));
            sum += currNum;
        }
        return sum;
    }
}