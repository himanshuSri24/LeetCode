class Solution {
    public String removeOuterParentheses(String s) {
        int openCount = 0, closeCount = 0;
        List<String> list = new ArrayList<String>();
        StringBuilder sb = new StringBuilder("");
        for(char ch : s.toCharArray())
        {
            if(ch == '(')
            {
                if(openCount == 0 || openCount == closeCount);
                else
                    sb.append(ch+"");
                openCount ++;
            }
            else if(ch == ')')
            {
                if(closeCount == openCount);
                
                else
                    sb.append(ch+"");
                
                closeCount++;
                if(closeCount == openCount)
                {
                    list.add(sb.toString());
                    System.out.println(sb);
                    sb.setLength(0);
                }
            }
        }
        System.out.println(sb);
        sb.setLength(0);
        for(String word : list)
        {
            System.out.println(word);
            sb.append(word.substring(0,word.length()-1));
        }
        return sb.toString();
    }
}