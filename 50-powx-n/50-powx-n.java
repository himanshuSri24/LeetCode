class Solution {
    public double myPow(double x, int n) {
        long bk = n;
        if(n >= 0)
            return answerPos(x, bk);
        return answerPos(1/x, -bk);
    }
    
    public double answerPos(double x, long n)
    {
        if(x == 0 && n != 0)
            return 0;
        if(n== 0)
            return 1;
        return n%2 == 0 ? answerPos(x*x, n/2) : x * answerPos(x, n -1);
    }
    
}