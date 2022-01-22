class Solution {
    
    public int posOf(int val, int[] p)
    {
        for(int i = 0; i < p.length; i ++)
        {
            if(p[i] == val)
                return i;
        }
        return -1;
    }
    
    public void putValAtBeg(int pos, int[] p)
    {
        int val = p[pos];
        for(int i = pos; i >= 1; i --)
        {
            p[i] = p[i-1];
        }
        p[0] = val;
    }
    
    
    public int[] processQueries(int[] queries, int m) {
        int[] ans = new int[queries.length];
        int[] p = new int[m];
        for(int i = 0; i < m; i ++)
        {
            p[i] = i+1;
        }
        for(int i = 0; i < queries.length; i ++)
        {
            int pos = posOf(queries[i], p);
            putValAtBeg(pos, p);
            ans[i] = pos;
        }
        return ans;
    }
}