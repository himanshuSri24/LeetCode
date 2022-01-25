class Solution {
    
    public void reverse(int[] nums)
    {
        int temp, i = 0, j = nums.length - 1;
        while(i < j)
        {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        
    }
    
    public int smallest(int[] nums, int index, int constraint)
    {
        int smallest = nums[index], indexToReturn = index;
        for(int i = index; i < nums.length; i ++)
        {
            if(nums[i] < smallest && nums[i] > constraint)
            {
                indexToReturn = i;
                smallest = nums[i];
            }
        }
        return indexToReturn;
    }
    
    public void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    public void bubbleSort(int[] a, int start)
    {
        int k = 0;
        // System.out.println(start);
        for(int i = start; i < a.length; i ++)
        {
            for(int j = start; j < a.length - 1 - k; j ++)
            {
                if(a[j] > a[j+1])
                {
                    // System.out.println("Condition met");
                    swap(a, j, j+1);
                }
                // System.out.println(Arrays.toString(a));
            }
            k++;
        }
    }
    
    public void nextPermutation(int[] nums) {
        boolean decreasing = true;
        int temp = 0, index = -1, index2 = -1;
        if(nums.length == 1)
            return;
        for(int i = nums.length - 1; i > 0; i --)
        {
            if(nums[i - 1] < nums[i])
            {
                index = i-1;
                decreasing = false;
                break;
            }
        }
        if(decreasing == true)
        {
            reverse(nums);
        }
        else
        {
            index2 = smallest(nums, index+1, nums[index]);
            temp = nums[index];
            nums[index] = nums[index2];
            nums[index2] = temp;
            // System.out.println(Arrays.toString(nums));
            bubbleSort(nums, index+1);
        }
    }
}