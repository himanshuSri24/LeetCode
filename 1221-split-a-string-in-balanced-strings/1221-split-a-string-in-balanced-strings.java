class Solution {
    public int balancedStringSplit(String s) {
        int len = s.length(), lCount = 0, rCount = 0, answer = 0, index = 0;
            
        for(int j = 0; j < len; j ++)
        {
            lCount = rCount = 0;
            for(int i = j; i < len; i ++)
            {
                if(s.charAt(i) == 'R')
                    rCount++;
                else
                    lCount++;
                if(lCount != 0 && lCount == rCount)
                {
                    answer++;
                    j = i;
                    break;
                }
            }
            
        }
        return answer;
    }
}