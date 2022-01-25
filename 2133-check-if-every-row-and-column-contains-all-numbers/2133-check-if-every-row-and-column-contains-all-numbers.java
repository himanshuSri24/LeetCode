class Solution {
    
    public boolean isValid(int[] row)
    {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < row.length; i ++)
        {
            if(set.contains(row[i]))
                return false;
            set.add(row[i]);
        }
        return true;
    }
    
    public boolean isValidCol(int[][] matrix, int col)
    {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < matrix.length; i ++)
        {
            if(set.contains(matrix[i][col]))
                return false;
            set.add(matrix[i][col]);
        }
        return true;
    }
    
    
    public boolean checkValid(int[][] matrix) {
        for(int[] row : matrix)
        {
            if(!isValid(row))
                return false;
        }
        for(int i = 0; i < matrix.length; i ++)
        {
            if(!isValidCol(matrix, i))
                return false;
        }
        return true;
    }
}