class Solution {
    int count = 0;
    public int findTargetSumWays(int[] nums, int target) {
        findNumberOfWays(0, nums, 0, target);
        return count;
    }
    
    public void findNumberOfWays(int currVal, int[] nums, int index, int target)
    {
        if(index == nums.length)
        {
            if(currVal == target)
                count++;
            return;
        }
        findNumberOfWays(currVal + nums[index], nums, index+1, target);
        findNumberOfWays(currVal - nums[index], nums, index+1, target); 
            return;
        
    }
    
}