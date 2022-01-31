class Solution {
    public List < Integer > twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
    List < Integer > ans = new ArrayList < > ();


    int[] origin = new int[101];
    for (int e: nums1) 
    {
      if (origin[e] == 0) origin[e] = 1;
    }

    for (int e: nums2) 
    {

      if (origin[e] == 0) origin[e] = 2;
      else if (origin[e] == 1) 
      { 
        ans.add(e);
        origin[e] = -1;
      }
    }
    for (int e: nums3) 
    {

      if (origin[e] == 1 || origin[e] == 2)
      {
        ans.add(e);
        origin[e] = -1;
      }
    }

    return ans;

  }
}