class Solution {
    
    public int validOrNot(int y, int x, int n, String s, int index, int len)
    {
        int count = 0;
        for(int i = index; i < len; i ++)
        {
            char ch = s.charAt(i);
            if(ch == 'R')
            {
                x++;
            }
            else if(ch == 'L')
            {
                x--;
            }
            if(ch == 'U')
            {
                y--;
                
            }
            else if(ch == 'D')
            {
                y++;
                
            }
            if(x < 0 || x > n -1 || y < 0 || y > n-1)
                break;
            else
                count++;
        }
        return count;
    }
    
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int len = s.length();
        int[] ans = new int[len];
        int x = startPos[1], y = startPos[0];
        for(int i = 0; i < len; i ++)
            ans[i] = validOrNot(y, x, n, s, i, len);
        return ans;
    }
}