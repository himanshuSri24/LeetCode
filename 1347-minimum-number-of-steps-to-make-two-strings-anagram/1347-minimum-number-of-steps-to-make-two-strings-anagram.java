class Solution {
    public int minSteps(String s, String t) {
        int[] freq = new int[26];
        int count = 0;
        for(char ch : s.toCharArray())
        {
            freq[(int)(ch - 'a')]++;
        }
        for(char ch : t.toCharArray())
        {
            freq[(int)(ch - 'a')]--;
        }
        for(int f : freq)
        {
            if(f > 0)
                count += f;
        }
        return count;
    }
}