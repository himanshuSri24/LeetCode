class Solution {
    
    public boolean dist(int x1, int y1, int x2, int y2, int d)
    {
        long dd = d;
        double dist = Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2));
        return dist <= dd;
    }
    
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] answer = new int[queries.length];
        int i = 0, count = 0;
        for(int[] querie : queries)
        {
            count = 0;
            for(int[] point : points)
            {
                if(dist(querie[0], querie[1], point[0], point[1], querie[2]))
                {
                    //System.out.println(querie[0]+" "+querie[1]+" "+point[0]+" "+point[1]+" "+querie[2]);
                    count++;
                }
            }
            answer[i++] = count;
        }
        return answer;
    }
}