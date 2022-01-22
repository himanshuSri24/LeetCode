class Solution {
    
    public void sort(int[][] mat, int si, int sj, int row, int col)
    {
        int len = Math.min(row - si, col - sj);
        int[] sortedArr = new int[len];
        int i = 0;
        while(i < len)
        {
            sortedArr[i] = mat[si+i][sj+i];
            i++;
        }
        Arrays.sort(sortedArr);
        i = 0;
        while(i < len)
        {
            mat[si+i][sj+i] = sortedArr[i];
            i++;
        }
    }
    
    public int[][] diagonalSort(int[][] mat) {
        //Make an arrayList for every Diagonal. Sort it. Put it back in loc.
        int row = mat.length, col = mat[0].length;
        for(int i = row - 1; i >= 0; i --)
        {
            sort(mat, i, 0, row, col);
        }
        for(int j = col - 1; j > 0; j --)
        {
            sort(mat, 0, j, row, col);
        }
        return mat;
    }
}