class Solution {
    
    
    public int sumTill(int n)
    {
        return (int)(((n)*(n+1))/2);
    }
    
    public long getDescentPeriods(int[] prices) {
        //find max descent period
        //total periods are maxPeriod size - 1 tak ka sum
        //add prices.length to it
        long count = 1;
        long k = 1;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] == prices[i - 1] - 1) {
                k++;
                count += k;
            } else {
                ++count;
                k = 1;
            }
        }
        return count;
    }
}