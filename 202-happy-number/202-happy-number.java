class Solution {
    
    public int sumOfSq(int n)
    {
        int sum = 0;
        while(n > 0)
        {
            sum += (n % 10)*(n % 10);
            n /= 10;
        }
        return sum;
    }
    
    public boolean isHappy(int n) {
        if(n == 1)
            return true;
        while(n != 1 && n != 4)
            n = sumOfSq(n);
        if(n == 1)
            return true;
        return false;
    }
}