class Solution {
    public int minOperations(int[] nums) {
        
        if(nums.length == 1)
            return 0;
        
        int count = 0;
        for(int i = 1; i < nums.length; i ++)
        {
            int diff = nums[i] - nums[i-1];
            if(diff <= 0)
            {
                count += -1*diff + 1;
                nums[i] = nums[i-1] + 1;
            }
        }
        return count;
        
    }
}