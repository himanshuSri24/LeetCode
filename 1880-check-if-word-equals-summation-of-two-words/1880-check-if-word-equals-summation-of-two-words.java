class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int first = 0, second = 0, target = 0;
        for(char ch : firstWord.toCharArray())
        {
            first = first * 10 + (int)(ch - 'a');
        }
        for(char ch : secondWord.toCharArray())
        {
            second = second * 10 + (int)(ch - 'a');
        }
        for(char ch : targetWord.toCharArray())
        {
            target = target * 10 + (int)(ch - 'a');
        }
        return first + second == target;
    }
}