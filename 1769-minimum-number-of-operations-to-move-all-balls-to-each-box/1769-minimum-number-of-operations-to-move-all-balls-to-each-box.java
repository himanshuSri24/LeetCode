class Solution {
    
    public int getAnsForIndexI(char[] array, int index)
    {
        int answer = 0;
        for(int i = 0; i < array.length; i ++)
        {
            if(array[i] == '1')
            {
                answer += Math.abs(i - index);
            }
        }
        return answer;
        
    }
    
    public int[] minOperations(String boxes) {
        int[] answer = new int[boxes.length()];
        for(int i = 0; i < answer.length; i ++)
            answer[i] = getAnsForIndexI(boxes.toCharArray(), i);
        return answer;
    }
}