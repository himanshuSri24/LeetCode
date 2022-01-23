class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for(String word : words)
        {
            StringBuilder sb = new StringBuilder("");
            for(char ch : word.toCharArray())
            {
                sb.append(morse[(int)(ch-97)]);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}