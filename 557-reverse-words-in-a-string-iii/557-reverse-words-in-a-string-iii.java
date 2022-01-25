class Solution {
     public String reverseWords(String s) 
    {
        s += " ";
        String[] revWords = s.split(" ");
        StringBuilder answer = new StringBuilder();
        for (String word : revWords)
        {
            for (int j = word.length() - 1; j >= 0; j--)
            {
                char ch = word.charAt(j);
                answer.append(ch);
            }
            answer.append(' ');
        }
        return answer.toString().trim();
    }
}