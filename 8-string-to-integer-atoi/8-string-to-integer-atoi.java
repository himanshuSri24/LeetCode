import java.math.BigInteger;
class Solution {
    

    
    public int myAtoi(String s) {
        s = s.trim();
        
        if(s.length() >= 2 &&
         (s.substring(0,2) == "--" || s.substring(0,2) == "++" 
          || s.substring(0,2) == "-+" || s.substring(0,2) == "+-")) return 0;
        
    if(s.equals("") || !Character.isDigit(s.charAt(0)) && (s.charAt(0) != '-' && s.charAt(0) != '+')) return 0;
    
        int num = 0;
        String result = Character.isDigit(s.charAt(0)) ? String.valueOf(s.charAt(0)) : "0";
        boolean isNegative = s.charAt(0) == '-' ? true : false;
        
        for(int i = 1; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i)))
                result += String.valueOf(s.charAt(i));
            else break;
        }
        
        try {
            num = Integer.parseInt(result);
        } catch( Exception ex) {
            num = isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        return num = isNegative ? -num : num;
    }
}