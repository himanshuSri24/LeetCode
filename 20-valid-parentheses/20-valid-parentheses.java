class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 == 1) {
            return false;
        }
        Stack<Character> stk = new Stack<Character>();
        for(int i = 0 ; i < s.length() ; ++i) {
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{') {
                stk.push(c);
            }
            else { 
                if (stk.isEmpty()) {
                    return false;
                }
                if(c == ')' && stk.pop() != '(' ) {
                    return false;
                }
                if(c == ']' && stk.pop() != '[') {
                    return false;
                }
                if(c == '}' && stk.pop() != '{') {
                    return false;
                }
            }
        }
        return stk.isEmpty();
    }
}