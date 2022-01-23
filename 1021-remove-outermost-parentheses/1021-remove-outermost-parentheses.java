class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder();
        int count =0;
        char sin[] = s.toCharArray();
        for(char c : sin)
        {
        
            if(c == ')')
                count--;
            if(count > 0)
                str.append(c);
            if(c == '(')
                count++;
        }
    
        return str.toString();
    }
}