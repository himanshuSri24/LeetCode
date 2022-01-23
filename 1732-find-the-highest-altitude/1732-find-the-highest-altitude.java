class Solution {
    public int largestAltitude(int[] gain) {
        int max = Integer.MIN_VALUE;
        int curr = 0;
        for(int g : gain)
        {
            curr += g;
            System.out.println(curr);
            if(curr > max)
                max = curr;
        }
        if(max < 0)
            return 0;
        
        return max;
    }
}