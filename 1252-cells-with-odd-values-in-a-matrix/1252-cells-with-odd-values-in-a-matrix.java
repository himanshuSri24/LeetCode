class Solution {
    
    public void modify(int[][] arr, int row, int col)
    {
        for(int i = 0; i < arr[0].length; i ++)
        {
            arr[row][i]++;
        }
        
        for(int i = 0; i < arr.length; i ++)
        {
            arr[i][col]++;
        }
        
    }
    
    public int oddVal(int[][] arr)
    {
        int count = 0;
        for(int[] row : arr)
        {
            for(int ele : row)
            {
                if(ele % 2 == 1)
                    count++;
            }
        }
        return count;
    }
    
    
    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        for(int i = 0; i < indices.length; i ++)
        {
            modify(arr, indices[i][0], indices[i][1]);
        }
        return oddVal(arr);
    }
}