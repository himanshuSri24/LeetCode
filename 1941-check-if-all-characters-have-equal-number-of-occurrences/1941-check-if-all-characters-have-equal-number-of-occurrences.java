class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];
        for(char ch : s.toCharArray())
        {
            freq[(int)(ch - 'a')]++;
        }
        int i = 0;
        while(freq[i] == 0)
            i++;
        int equality = freq[i];
        for(int f : freq)
        {
            if(f != 0 && f != equality)
                return false;
        }
        return true;
    }
}