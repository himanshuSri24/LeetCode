class Solution {
    public int[] replaceElements(int[] arr) {
        int[] greatestTillHere = new int[arr.length + 1];
        greatestTillHere[greatestTillHere.length - 1] = -1;
        for(int i = arr.length - 1; i >= 0; i --)
        {
            greatestTillHere[i] = Math.max(arr[i], greatestTillHere[i+1]);
        }
        int[] ans = new int[arr.length];
        for(int i = 0; i < ans.length; i ++)
        {
            ans[i] = greatestTillHere[i+1];
        }
        return ans;
    }
}