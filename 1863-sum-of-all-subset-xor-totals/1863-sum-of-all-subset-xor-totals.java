class Solution {
    
    public int sumOfXOR(int[] nums, int index, int ans)
    {
        if(index == nums.length)
            return ans;
        int currWithInc = sumOfXOR(nums, index+1, ans^nums[index]);
        int currWithoutInc = sumOfXOR(nums, index+1, ans);
        ans = currWithInc + currWithoutInc;
        return ans;
    }
    
    public int subsetXORSum(int[] nums) {
        
        return sumOfXOR(nums, 0, 0);
    }
}