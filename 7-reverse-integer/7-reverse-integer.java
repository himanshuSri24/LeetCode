class Solution {
    public int reverse(int x) {
        try
        {
            if(x == 0)
                return 0;
            int b = Math.abs(x);
            String ans = "";
            int sign = x / b;
            while(b > 0)
            {
                ans = ans + b%10;
                b /= 10;
            }
            return Integer.parseInt(ans)*sign;
        }
        catch(NumberFormatException e)
        {
            return 0;
        }
    }
}