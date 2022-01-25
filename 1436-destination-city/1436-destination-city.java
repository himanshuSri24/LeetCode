class Solution {
    
    public boolean contains(List<List<String>> paths, String find)
    {
        for(List<String> path : paths)
        {
            if(path.get(0).equals(find))
                return true;
        }
        return false;
    }
    
    public String destCity(List<List<String>> paths) {
        for(List<String> path : paths)
        {
            if(!contains(paths, path.get(1)))
                return path.get(1);
        }
        return "";
    }
}