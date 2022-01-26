class Solution {
    public int hammingDistance(int x, int y) {
        int ans = 0, num1 = 1;
        for(int i = 0; i < 32; i ++)
        {
            if(((x >> i) & num1) != ((y >> i) & num1))
                ans ++;
        }
        return ans;
    }
}