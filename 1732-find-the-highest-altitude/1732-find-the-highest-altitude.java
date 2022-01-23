class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int curr = 0;
        for(int g : gain)
        {
            curr += g;
            System.out.println(curr);
            if(curr > max)
                max = curr;
        }
        
        return max;
    }
}