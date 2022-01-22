class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int i = -1;
        int bk = capacity;
        int steps = 0;
        while(i < plants.length)
        {
            if(i != -1)
            {   
                if(plants[i] <= capacity)
                {
                    steps++;
                    capacity -= plants[i];
                }
                else
                {
                    steps += 2*i + 1;
                    capacity = bk - plants[i];
                }
            }
            i++;
        }
        return steps;
    }
}