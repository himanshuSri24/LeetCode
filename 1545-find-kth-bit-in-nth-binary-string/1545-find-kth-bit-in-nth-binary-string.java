class Solution {
    public char findKthBit(int n, int k) {
        String ans =  sequence("0", n);
        System.out.println(ans);
        return ans.charAt(k-1);
    }
    
    public String reverse(String s)
    {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    
    public String invert(String s)
    {
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len; i ++)
        {
            if(s.charAt(i) == '1')
                sb.append("0");
            else
                sb.append("1");
        }
        return sb.toString();
    }
    
    public String sequence(String sc, int k)
    {
        if(k == 1)
        {
            return sc;
        }
        String something = sequence(sc+"1"+reverse(invert(sc)), k-1);
        return something;
    }
}