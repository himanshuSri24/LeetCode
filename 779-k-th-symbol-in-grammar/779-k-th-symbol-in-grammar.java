class Solution 
{
     public int kthGrammar(int n, int k) 
     {
        
        if(n == 0 || k == 1)
        {
            return 0;
        }
        int x = kthGrammar(n-1,(k+1)/2);
        if(k % 2 == 0)
        {
            return (1-x);
        }
        else
        {
            return x;
        }
    }
}