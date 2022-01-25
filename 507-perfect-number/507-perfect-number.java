class Solution {
    
    public int sumOfFactors(int num)
    {
        int sum = 0, goTill = (int)Math.sqrt(num);
        for(int i = 1; i <= goTill; i ++)
        {
            if(num % i == 0)
                sum += i + num/i;
        }
        System.out.println(sum);
        return sum - num;
    }
    
    public boolean checkPerfectNumber(int num) {
        if(num == 1)
            return false;
        return sumOfFactors(num) == num;
    }
}