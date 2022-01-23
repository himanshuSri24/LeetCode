class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int maxVal = 0, count = 0;
        for(int[] rectangle : rectangles)
        {
            int val = Math.min(rectangle[0], rectangle[1]);
            if(val > maxVal)
            {
                maxVal = val;
                count = 1;
            }
            else if(val == maxVal)
            {
                count++;
            }
        }
        return count;
    }
}