class Solution {
    public int dominantIndex(int[] nums) {
        int largestNumber = 0, largestIndex = -1, secondLargest = 0;
        if(nums.length == 1)
            return 0;
        for(int i = 0; i < nums.length; i ++)
        {
            if(nums[i] > largestNumber)
            {
                secondLargest = largestNumber;
                largestNumber = nums[i];
                largestIndex = i;
            }
            if(nums[i] < largestNumber  && nums[i] > secondLargest)
            {
                secondLargest = nums[i];
            }
        }
        if(largestNumber >= 2*secondLargest)
            return largestIndex;
        return -1;
    }
}