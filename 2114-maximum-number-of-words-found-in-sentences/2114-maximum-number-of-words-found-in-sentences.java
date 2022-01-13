class Solution {
    
    public int countWords(String sentence)
    {
        sentence = sentence.trim()+" ";
        return sentence.split(" ").length;
    }
    
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for(String sentence : sentences)
        {
            int currWords = countWords(sentence); 
            if(currWords > maxWords)
                maxWords = currWords;
        }
        return maxWords;
    }
}