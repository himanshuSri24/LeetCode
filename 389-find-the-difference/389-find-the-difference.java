class Solution {
    public char findTheDifference(String s, String t) {
        int[] freq = new int[26];
        for(char ch : t.toCharArray())
        {
            freq[(int)(ch - 'a')]++;
        }
        
        for(char ch : s.toCharArray())
        {
            freq[(int)(ch - 'a')]--;
        }
        for(int i = 0; i < freq.length; i ++)
        {
            if(freq[i] == 1)
                return (char)('a' + i);
        }
        return 'a';
    }
}