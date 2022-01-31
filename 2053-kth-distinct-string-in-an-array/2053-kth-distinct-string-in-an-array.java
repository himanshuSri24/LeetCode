class Solution {
    public String kthDistinct(String[] arr, int k) {
        List<String> list = Arrays.asList(arr);
        for(String s : arr)
        {
            if(list.indexOf(s) == list.lastIndexOf(s))
            {
                k--;
                if(k == 0)
                    return s;
            }
        }
        
        return "";
    }
}