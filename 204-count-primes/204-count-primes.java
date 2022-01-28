class Solution {
    boolean[] primes;
    public void preComp(int n)
    {
        primes = new boolean[n+1];
        int m = (int)Math.sqrt(n);
        for(int i = 2; i <= m; i ++)
        {
            if(!primes[i])
            {
                // primes[i] = true;
                for(int j = i*i; j < n+1; j = j+i)
                {
                    primes[j] = true;
                }
            }
        }
    }
    
    public int countPrimeTill(int n)
    {
        int count = 0;
        for(int i = 2; i < n; i ++)
        {
            if(!primes[i])
            {   
                // System.out.println(i);
                count++;
            }
        }
        return count;
    }
    
    public int countPrimes(int n) {
        preComp(n);
        return countPrimeTill(n);
    }
}