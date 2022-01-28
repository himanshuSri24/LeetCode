class Solution {
    public boolean isIsomorphic(String s, String t) {
        //Make a HashMap which maps Char -> Char for O(1) access
        //if an element doesn't exist, add it
        //create a new stringBuilder with the values of hashMap
        //check if equal
        Map<Character, Character> map = new HashMap<>();
        if(s.length() != t.length())
            return false;
        int len = s.length();
        StringBuilder ans = new StringBuilder("");
        for(int i = 0; i < len; i ++)
        {
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if(!map.containsValue(ct))
                map.putIfAbsent(cs, ct);
            else if(map.containsValue(ct) && map.containsKey(cs) && map.get(cs) != ct)
                return false;
            ans.append(map.get(cs));
            // System.out.println(ans);
        }
        return ans.toString().equals(t);
    }
}