class Solution {
    public int maxDepth(String s) {
        int max = 0, count = 0;
        for(char ch : s.toCharArray())
        {
            if(ch == '(')
                count++;
            if(ch == ')')
            {
                if(count > max)
                    max = count;
                count --;
            }
        }
        return max;
    }
}