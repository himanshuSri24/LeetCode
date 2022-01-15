class Solution {
    
    public int winner(int[] nums, int start, int end, int diffScore, int turn)
    {
        
        if(start > end)
        {
            return diffScore;
        }
        
        if(turn == 1)
        {
            int sRec = winner(nums, start+1, end, diffScore + nums[start], 2);
            int eRec = winner(nums, start, end -1, diffScore + nums[end], 2);
            return Math.max(sRec, eRec);
        }
        else
        {
            int sRec = winner(nums, start+1, end, diffScore - nums[start], 1);
            int eRec = winner(nums, start, end -1, diffScore - nums[end], 1);
            return Math.min(sRec, eRec);
        }
        
        
    }
    
    public boolean PredictTheWinner(int[] nums) {
        return winner(nums, 0, nums.length - 1, 0, 1) >= 0;
    }
}