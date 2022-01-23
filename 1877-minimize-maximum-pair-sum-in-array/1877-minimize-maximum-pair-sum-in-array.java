class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxSum = 0;
        int i = 0, j = nums.length - 1;
        while(i < j)
        {
            int curr = nums[i] + nums[j];
            if(curr > maxSum)
                maxSum = curr;
            i++;
            j--;
        }
        return maxSum;
    }
}