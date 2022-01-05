class Solution {
    
    public int numa(int num, int count)
    {
        if(num == 0)
            return count;
        if(num % 2 == 0)
        {
            return numa(num/2, count+1);
        }
           
            return numa(num - 1, count+1);
        
    }
    
    
    public int numberOfSteps(int num) {
        return numa(num, 0);
    }    
}