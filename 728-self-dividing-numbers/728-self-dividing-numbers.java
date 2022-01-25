class Solution {
    
    public boolean isSelfDividing(int n)
    {
        int x = n;
        while(n > 0)
        {
            if(x % (n%10) != 0)
                return false;
            n /= 10;
        }
        return true;
    }
    
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i = left; i <= right; i ++)
        {
            if(Integer.toString(i).indexOf('0') != -1)
                continue;
            if(isSelfDividing(i))
            {
                // System.out.println(i);
                ans.add(i);
            }
        }
        return ans;
    }
}