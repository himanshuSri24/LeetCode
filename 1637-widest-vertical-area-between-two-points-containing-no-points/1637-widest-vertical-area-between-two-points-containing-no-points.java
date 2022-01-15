class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(o->o[0]));
        int maxVal = 0;
        for(int i = 0; i < points.length - 1; i ++)
        {
            int currVal = points[i + 1][0] - points[i][0];
            if(currVal > maxVal)
                maxVal = currVal;
        }
        return maxVal;
    }
}