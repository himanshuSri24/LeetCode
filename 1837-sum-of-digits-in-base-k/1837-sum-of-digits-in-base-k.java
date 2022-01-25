class Solution {

    public int sumOfDig(int n)
    {
        int sum = 0;
        while(n > 0)
        {
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
    
    public int sumBase(int n, int k) {
        return sumOfDig(Integer.valueOf(Integer.toString(Integer.parseInt(Integer.toString(n), 10), k)));
    }
}