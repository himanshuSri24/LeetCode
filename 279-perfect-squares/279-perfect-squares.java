class Solution {
    
    public int numSquares(int n) {
        if(n<=3)
            return n;
        while(n%4==0){
            n/=4;
        }
        if(n%8==7){
            return 4;
        }
        int sq_root = (int)Math.sqrt(n);
        if(sq_root*sq_root==n){
            return 1;
        }
        for(int i = 1; i*i<=n; i++){
            sq_root=(int)Math.sqrt(n-i*i);
            if(sq_root*sq_root==(n-i*i)){
                return 2;
            }
        }
        return 3;
    }

}