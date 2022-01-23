class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
       for(int[] row : image)
       {
           int i = 0, temp, j = row.length - 1;
           while(i < j)
           {
               temp = row[i];
               row[i] = row[j];
               row[j] = temp;
               i++;
               j--;
           }
       }
       for(int[] row : image)
       {
           int i = 0, temp, j = row.length - 1;
           for(int k = 0; k < row.length; k ++)
           {
               row[k] = row[k] ^ 1;
           }
       }
        
        return image;
    }
}