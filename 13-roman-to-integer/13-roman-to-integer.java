class Solution {
    
   static int romToInt(String s)
    {
        Map<Character, Integer> roms = new HashMap<>();
        roms.put('I', 1);
        roms.put('V', 5);
        roms.put('X', 10);
        roms.put('L', 50);
        roms.put('C', 100);
        roms.put('D', 500);
        roms.put('M', 1000);
        int ans = 0;
        for(int i = 0; i < s.length(); i ++)
        {
            int j = i;
            if(s.charAt(i) == 'I')
            {

                    if(i+1 < s.length() && s.charAt(i+1) == 'V')
                    {
                        ans += roms.get('V') - roms.get('I');
                        i++;
                    }
                    else if(i+1 < s.length() && s.charAt(i+1) == 'X')
                    {
                        ans += roms.get('X') - roms.get('I');
                        i++;
                    }
                    else
                        ans += roms.get('I');
            }
            else if(s.charAt(i) == 'V')
            {
                ans += roms.get('V');
            }
            else if(s.charAt(i) == 'X')
            {
                if(i+1 < s.length() && s.charAt(i+1) == 'L')
                {
                    ans += roms.get('L') - roms.get('X');
                    i++;
                }
                else if(i+1 < s.length() && s.charAt(i+1) == 'C')
                {
                    ans += roms.get('C') - roms.get('X');
                    i++;
                }
                else
                    ans += roms.get('X');
            }
            else if(s.charAt(i) == 'L')
            {
                ans += roms.get('L');
            }
            else if(s.charAt(i) == 'C')
            {
                if(i+1 < s.length() && s.charAt(i+1) == 'D')
                {
                    ans += roms.get('D') - roms.get('C');
                   i++;
                }
                else if(i+1 < s.length() && s.charAt(i+1) == 'M')
                {
                    ans += roms.get('M') - roms.get('C');
                    i++;
                }
                else
                    ans += roms.get('C');
            }
            else if(s.charAt(i) == 'D')
            {
                ans += roms.get('D');
            }
            else if(s.charAt(i) == 'M')
            {
                ans += roms.get('M');
            }
        }
        return ans;
    }

    
    public int romanToInt(String s) {
        
            return romToInt(s);
        
    }
}