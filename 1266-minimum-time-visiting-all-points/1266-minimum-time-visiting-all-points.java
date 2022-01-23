class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
       if (points.length == 1) return 0;
        int result = 0;
        int index[] = points[0];
        for (int i = 1; i < points.length; i++) {
            result += Math.max(Math.abs(points[i][0] - index[0]), Math.abs(points[i][1] - index[1]));
            index = points[i];
        }
        return result;
    }
}