class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0, j = nums.length-1;
        for(i=0; i < nums.length; i ++){
            for(j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j] == target){
                return new int[]{i, j};
            }   
            }
        }
        return new int[]{0, 0};
    }
}