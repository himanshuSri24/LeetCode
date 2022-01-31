class Solution {
    
    int value;
    
    public boolean found(int value, int[] nums)
    {
        int start = 0, end = nums.length - 1, mid;
        while(start <= end)
        {
            mid = start + (end - start) / 2;
            if(nums[mid] == value)
                return true;
            else if(nums[mid] > value)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return false;
    }
    
    public int findFinalValue(int[] nums, int original) {
        value = original;
        Arrays.sort(nums);
        while(found(value, nums))
        {
            value *= 2;
        }
        return value;
    }
}