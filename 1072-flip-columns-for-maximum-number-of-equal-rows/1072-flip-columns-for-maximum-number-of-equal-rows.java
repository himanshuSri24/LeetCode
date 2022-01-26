class Solution {

    public int maxEqualRowsAfterFlips(int[][] matrix) 
    {
	int m = matrix.length;

	if (m <= 1)
		return m;

	int n = matrix[0].length;
	Map<String, Integer> count = new HashMap<String, Integer>();

	int ans = 0;
	for (int i = 0; i < m; i++) 
    {
		String key = Arrays.toString(matrix[i]);
		if (count.containsKey(key)) 
        {
			int val = count.get(key) + 1;
			count.put(key, val);
			ans = Math.max(ans, val);
		} 
        else 
        {
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) 
            {
				arr[j] = matrix[i][j] == 0 ? 1 : 0;
			}
			key = Arrays.toString(arr);
			if (count.containsKey(key)) 
            {
				int val = count.get(key) + 1;
				count.put(key, val);
				ans = Math.max(ans, val);
			} 
            else 
            {
				count.put(key, 1);
				ans = Math.max(ans, 1);
			}
		}
	}

	return ans;
}

}