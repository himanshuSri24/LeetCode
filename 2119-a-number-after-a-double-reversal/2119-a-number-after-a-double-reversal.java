class Solution {
    
    public int revNum(int num)
    {
        int bk = num;
        int ans = 0;
        while(num > 0)
        {
            int dig = num%10;
            num /= 10;
            ans = ans*10 + dig;
        }
        return ans;
    }
    
    public boolean isSameAfterReversals(int num) {
        int rev = revNum(num);
        rev = revNum(rev);
        return rev == num;
    }
}