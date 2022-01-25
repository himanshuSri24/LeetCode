class Solution {
    public int maxCoins(int[] piles) {
        int maxCoins = 0;
        int turns = piles.length / 3;
        Arrays.sort(piles);
        int i = 0;
        while(turns > 0)
        {
            maxCoins += piles[piles.length - 2 - i];
            i += 2;
            turns --;
        }
        return maxCoins;
    }
}