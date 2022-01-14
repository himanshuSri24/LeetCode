class Solution {
    public int subtractProductAndSum(int n) {
        int backup = n, sum = 0, product = 1;
        while(n > 0)
        {
            product *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        return product - sum;
    }
}