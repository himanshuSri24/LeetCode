class Solution {
    public String firstPalindrome(String[] words) {
        String ans = "";
        for(String word : words)
        {
            StringBuilder w = new StringBuilder(word);
            if(w.toString().equals(w.reverse().toString()))
               return word;
        }
        return ans;
    }
}