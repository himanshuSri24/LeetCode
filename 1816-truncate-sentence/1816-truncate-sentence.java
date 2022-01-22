class Solution {
    public String truncateSentence(String s, int k) {
        int countOfSpaces = 0, lastSpaceIndex = 0;
        for(int i = 0; i < s.length(); i ++) {
            if(s.charAt(i) == ' ') {
                countOfSpaces++;
                lastSpaceIndex = i;
            }
            if(countOfSpaces == k)
                break;
        }
        if(countOfSpaces == (k - 1))
            return s;
        return s.substring(0, lastSpaceIndex);
            
    
    }
}