class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        if(nums.length == 0)
            return 0;
        ans.add(nums[0]);
        // int count = 1;
        for(int i = 1; i < nums.length; i ++)
        {
            if(nums[i - 1] != nums[i])
                ans.add(nums[i]);
                // count++;
        }
        System.out.println(ans);
        int i = 0;
        for(Integer a : ans)
        {
            nums[i++] = a;
        }
        return ans.size();
    }
}