class Solution {

    int count = 0;
    int[] numberOfWays;
    
    public void setNumberOfWays()
    {
        numberOfWays[0] = 1;
        numberOfWays[1] = 1;
        for(int i = 2; i < numberOfWays.length; i ++)
        {
            numberOfWays[i] = numberOfWays[i-1] + numberOfWays[i-2];
        }
    }
    
    public int helper(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        if(n < 0)
            return 0;
        return helper(n - 1) + helper(n - 2);
    }
    
    public int climbStairs(int n) {
        numberOfWays = new int[n+1];
        setNumberOfWays();
        return numberOfWays[n];
    }
}