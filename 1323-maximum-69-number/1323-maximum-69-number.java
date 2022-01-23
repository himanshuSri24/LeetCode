class Solution {
    public int maximum69Number (int num) {
        String n = Integer.toString(num);
        String ans;
        int index = -1;
        int bk = num;
        int len = n.length();
        for(int i = 0; i < len; i ++)
        {
            char ch = n.charAt(i);
            if(ch == '6')
            {
                index = i;
                break;
            }
        }
        if(index != -1)
        {
            ans = n.substring(0,index) + "9" + n.substring(index+1);
            return Integer.valueOf(ans);
        }
        else
            return Integer.valueOf(n);
    }
}