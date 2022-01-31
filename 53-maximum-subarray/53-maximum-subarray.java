class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = 0, maxSum = 0;
        for(int i = 0; i < nums.length; i ++)
        {
            currSum += nums[i];
            if(currSum < 0)
                currSum = 0;
            maxSum = Math.max(maxSum, currSum);
        }
        if(maxSum == 0)
        {
            Arrays.sort(nums);
            return nums[nums.length - 1];
        }
        return maxSum;
    }
}