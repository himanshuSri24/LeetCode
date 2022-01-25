class Solution {
 
    int total = 0;
    int[] freq = new int[26];
    public StringBuilder addInc(String s, StringBuilder ans)
    {
        for(int i = 0; i < freq.length; i ++)
        {
            if(freq[i] != 0)
            {
                ans.append((char)(i+'a')+"");
                freq[i]--;
                total--;
            }
        }
        return ans;
    }
    
    public StringBuilder addDec(String s, StringBuilder ans)
    {
        for(int i = freq.length - 1; i >= 0; i --)
        {
            if(freq[i] != 0)
            {
                ans.append((char)(i+'a')+"");
                freq[i]--;
                total--;
            }
        }
        return ans;
    }
    
    
    public String sortString(String s) {
        for(char ch : s.toCharArray())
        {
            freq[(int)(ch - 'a')]++;
            total++;
        }
        StringBuilder ans = new StringBuilder("");
        while(total > 0)
        {
            ans = addInc(s, ans);
            ans = addDec(s, ans);
         
        }
        return ans.toString();
    }
}