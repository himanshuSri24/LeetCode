class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] freq = new boolean[26];
        for(char ch : sentence.toCharArray())
        {
            int index = (int)(ch - 'a');
            if(!freq[index])
                freq[index] = true;
        }
        for(boolean f : freq)
            if(!f)
                return false;
        return true;
    }
}