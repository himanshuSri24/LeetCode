class Solution {
    public int[] diStringMatch(String s) {
        int res [] = new int[s.length() + 1];
        
        int countMin = 0;
        int countMax = res.length - 1;
        
        for(int i = 0; i < s.length(); i ++) 
        {
            if(s.charAt(i) == 'I') 
            {
                res[i] = countMin;
                countMin ++;
            }
            else
            {
                res[i] = countMax;
                countMax --;
            }
        }
        
        res[res.length - 1] = countMin;
        
        return res;
    }
}