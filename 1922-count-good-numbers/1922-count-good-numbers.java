import java.math.BigInteger;

class Solution {
    int modu = (int)1e9+7;
   public long power(long x,long y){ 
        long temp;
        if(y==0) return 1; 
        temp=power(x,y/2); 
        if(y%2==0) return (temp*temp)%modu;  
        else return (x*temp*temp)%modu; 
		 
    }
    
    public int countGoodNumbers(long digits) {
        long evenAns = 0, oddAns = 0;
        
        if(digits % 2 == 0)
        {
            evenAns = power(5, digits / 2) % modu;
            oddAns = power(4, digits / 2) % modu;
        }
        else
        {
            evenAns = power(5, (digits / 2) + 1) % modu;
            oddAns = power(4, digits / 2) % modu;
        }
        long ans=(1*evenAns)%modu;
        ans= (digits/2 != 0) ? (ans * oddAns) % modu : ans;
        return (int)(ans % modu);
        //a*b mod m = a % m * b % m whole % m
        // _ _ _ _ Even: 5*5 Odd: 4*4
        // _ _ _ _ _ Even: 5*5*5 Odd: 4*4
    }
}