class Solution {
    public int minTimeToType(String word) {
        int numberOfSeconds = word.length();
        int curr = 0;
        for(char ch : word.toCharArray())
        {
            int something = Math.abs(ch - 'a' - curr) % 26;
            int something2 = 26 - something;
            numberOfSeconds += (int)((Math.min(something, something2)));
            curr = ch - 'a';
        }
        return numberOfSeconds;
    }
}