class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        combinations(candidates, 0, target, new ArrayList<>());
        return ans;
    }
    
    public void combinations(int[] a, int i, int target, List<Integer> list)
    {
        
        if(target == 0)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        if(target < 0)
            return;
        if(i == a.length)
            return;
        if(target - a[i] >= 0)
        {
            list.add(a[i]);
            combinations(a, i, target-a[i], list);
            list.remove(list.size() - 1);
        }
            combinations(a, i+1, target, list);
    }
}