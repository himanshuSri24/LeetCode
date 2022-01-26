class Solution {
    
    public int sumOfDig(int i)
    {
        int sum = 0;
        while(i > 0)
        {
            sum += i%10;
            i /= 10;
        }
        return sum;
    }
    
    public int countBalls(int lowLimit, int highLimit) {
        int maxBalls = 0, maxIndex = -1;
        int[] boxes = new int[50];
        // Arrays.fill(boxes, 0);
        for(int i = lowLimit; i <= highLimit; i ++)
        {
            int sum = sumOfDig(i);
            // System.out.println(sum);
            boxes[sum] = boxes[sum] + 1; 
            if(boxes[sum] > maxBalls)
            {
                maxBalls = boxes[sum];
                maxIndex = sum;
            }
        }
        return maxBalls;
    }
}