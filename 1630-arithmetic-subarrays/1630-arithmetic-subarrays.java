class Solution {
    
    public boolean checkIfPossible(int[] nums, int l, int r)
    {
        
        int j = 0;
        int[] a = new int[r-l+1];
        for(int i = l; i <= r; i ++)
            a[j++] = nums[i];
        Arrays.sort(a);
        // System.out.println(Arrays.toString(a));
        int diff = a[1] - a[0];
        // System.out.println(diff);
        if(nums.length == 2)
            return true;
        for(int i = 1; i < a.length; i ++)
        {
            if(a[i] - a[i-1] != diff)
                return false;
        }
        return true;
    }
    
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> list = new ArrayList<Boolean>();
        for(int i = 0; i < l.length; i ++)
        {
            if(checkIfPossible(nums, l[i], r[i]))
                list.add(true);
            else
                list.add(false);
        }
        return list;
    }
}