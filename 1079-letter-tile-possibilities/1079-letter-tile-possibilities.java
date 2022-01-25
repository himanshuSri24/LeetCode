class Solution {
    
    public int numTilePossibilities(String tiles) 
    {
        boolean[] used = new boolean[tiles.length()];
        Arrays.fill(used, false);
        Set<String> possibilities = new HashSet();
        findPossibilities(tiles, "", used, possibilities);
        return possibilities.size() - 1;
    }
    
    public void findPossibilities(String tiles, String current, boolean[] used, Set<String> possibilities)
    {
        if(current.length() > tiles.length())
        {
            return;
        }
        
        possibilities.add(current);
        for(int i=0; i<tiles.length(); i++)
        {
            if(!used[i])
            {
                used[i] = true;
                findPossibilities(tiles, current+tiles.charAt(i), used, possibilities);
                used[i] = false;
            }
        }
    }
}