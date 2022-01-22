class Solution {
    public int countPoints(String rings) {
        int count = 0;
        int len =  rings.length();
        int[][] rodsAndRings = new int[10][3];
        for(int i = 0; i < len; i = i + 2)
        {
            int rod = (int)(rings.charAt(i+1) - '0');
            char ch = rings.charAt(i);
            if(ch == 'R')
            {
                rodsAndRings[rod][0]++;
            }
            else if(ch == 'G')
            {
                rodsAndRings[rod][1]++;
            }
            if(ch == 'B')
            {
                rodsAndRings[rod][2]++;
            }
        }
        for(int[] rod : rodsAndRings)
        {
            if(rod[0] > 0 && rod[1] > 0 && rod[2] > 0)
                count++;
        }
        return count;
    }
}