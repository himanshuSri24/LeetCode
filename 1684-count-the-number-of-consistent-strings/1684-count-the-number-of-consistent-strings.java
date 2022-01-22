class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = words.length;
        for(String word : words)
        {
            for(char ch : word.toCharArray())
            {
                if(allowed.indexOf(ch) == -1)
                {
                    count --;
                    break;
                }
                
            }
        }
        return count;
    }
}