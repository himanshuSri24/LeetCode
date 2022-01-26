class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int countMovesForTop = 0, countMovesForBottom = 0, simEle = 0;
        boolean topPossible = true, bottomPossible = true, alreadyDone = false;
        int topEle = tops[0];
        int bottomEle = bottoms[0];
        if(topEle == bottomEle)
            simEle++;
        for(int num : tops)
        {
            if(num != topEle)
            {
                alreadyDone = false;
                break;
            }
        }
        if(alreadyDone)
            return 0;
        for(int num : bottoms)
        {
            if(num != bottomEle)
            {
                alreadyDone = false;
                break;
            }
        }
        if(alreadyDone)
            return 0;
        for(int i = 1; i < tops.length; i ++)
        {
            if(bottoms[i] == tops[i])
                simEle++;
                
            if(bottomPossible == true && tops[i] != bottomEle && bottoms[i] != bottomEle)
            {
                bottomPossible = false;
            }
            
            if(topPossible == true && tops[i] != topEle && bottoms[i] != topEle)
            {
                topPossible = false;
            }
            
            if(!topPossible && !bottomPossible)
                return -1;
            // System.out.println(tops[i]);
            
            // System.out.println(topEle);
            
            // System.out.println(bottoms[i]);
            
            // System.out.println(bottomEle);
            if(bottoms[i] == topEle && tops[i] != topEle)
            {
                // System.out.println("top");
                countMovesForTop ++;
            }
            if(tops[i] == bottomEle && bottoms[i] != bottomEle)
                countMovesForBottom ++;
        }
        if(bottomPossible && topPossible)
        {
            int a = Math.min(countMovesForTop, tops.length - countMovesForTop - simEle);
            int b = Math.min(countMovesForBottom, tops.length - countMovesForBottom - simEle);
            a = Math.min(a, b);
            int c = Math.min(countMovesForTop, countMovesForBottom);
            return Math.min(a, c);
        }
        if(bottomPossible)
            return Math.min(countMovesForBottom, tops.length - countMovesForBottom - simEle);
        return Math.min(countMovesForTop, tops.length - countMovesForTop - simEle);
    }
}