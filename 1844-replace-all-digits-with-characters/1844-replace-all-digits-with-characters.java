class Solution {
    public String replaceDigits(String s) {
        StringBuilder ans = new StringBuilder("");
        int len = s.length();
        for(int i = 0; i < len; i = i + 2)
        {
            ans.append(s.charAt(i) + "");
            if(i+1 < len)
                ans.append((char)(s.charAt(i)+s.charAt(i+1)-'0') + "");
        }
        return ans.toString();
    }
}