class Solution {
    
    public boolean isMatch(String text, String pattern) 
    {
        if(pattern.length() == 0)
           return text.length() == 0;
         
        if(pattern.length() > 1 && pattern.charAt(1) == '*')
        {
            if(isMatch(text, pattern.substring(2)))
               return true;
            if(text.length() > 0 && (pattern.charAt(0) == '.' || text.charAt(0) == pattern.charAt(0)))
                return isMatch(text.substring(1), pattern);
            return false;
        }
           else
        {
            if(text.length() > 0 && (pattern.charAt(0) == '.' || text.charAt(0) == pattern.charAt(0)))
                return isMatch(text.substring(1), pattern.substring(1));
        }
        return false;
    }
        
    
}