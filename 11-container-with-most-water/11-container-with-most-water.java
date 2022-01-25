class Solution {
    
    public int findVol(int[] height, int i, int j)
    {
        return (j - i) * (Math.min(height[i], height[j]));
    }
    
    public int maxArea(int[] height) {
        // j > i
        //volume = Math.min(height[i],height[j])*(j-i)
        //basically area
        int maxVol = 0;
        int i = 0, j = height.length - 1;
        int maxHeight = 0;
        for(i = 0; i < height.length; i ++)
        {
            if(height[i] > maxHeight)
                maxHeight = height[i];
        }
        i = 0;
        while(i < j)
        {
            int currVol = findVol(height, i, j);
            if(currVol > maxVol)
                maxVol = currVol;
            int currShort = height[i] < height[j] ? i : j;
            if(height[currShort] < maxHeight)
            {
                if(currShort == i)
                    i++;
                else
                    j--;
            }
            else
                break;
        }
        return maxVol;
    }
}