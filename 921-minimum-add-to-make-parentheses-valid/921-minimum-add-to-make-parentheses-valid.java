class Solution {
    public int minAddToMakeValid(String s) {
        int opens = 0;
        int closedOpens = 0;
        int closedWithoutOpen = 0;
        
        for(int i = 0; i < s.length(); i++) 
        {
            char c = s.charAt(i);
            if (c == '(') 
            {
                opens += 1;
            } else if (opens > closedOpens) 
            {
                closedOpens += 1;
            } else 
            {
                closedWithoutOpen += 1;
            }
        }
        return (opens - closedOpens) + closedWithoutOpen;
    }
}