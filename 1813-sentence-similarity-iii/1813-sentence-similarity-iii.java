class Solution {
    public static boolean areSentencesSimilar(String sentence1, String sentence2)
    {
        String longerWord, shorterWord;
        sentence1 += " ";
        sentence2 += " ";
        int s1Length = sentence1.length(), s2Length = sentence2.length();
        if(s1Length > s2Length)
        {
            longerWord = sentence1;
            shorterWord = sentence2;
        }
        else if(s2Length > s1Length)
        {
            longerWord = sentence2;
            shorterWord = sentence1;
        }
        else
        {
            return sentence1.equals(sentence2);
        }
        int slot = 0, flag = 0, first = 0, diff = 0, j =0;
        String[] longer = longerWord.split(" "), shorter = shorterWord.split(" ");
        if(shorter.length == 1)
            return shorter[0].equals(longer[0]) || shorter[0].equals(longer[longer.length - 1]);
        for(int i = 0; i < longer.length;)
        {
            if(shorter[j].equals(longer[i]))
            {
                if(flag == 0)
                {
                    flag++;
                    first = i;
                }
                if(diff != i-j)
                {
                    if(!(i!=longer.length - 1 && longer[i+1].equals(shorter[j])))
                        slot++;
                    else
                        i++;
                    if(slot == 2)
                        return false;
                    diff = i-j;
                }
                j++;
                if(j == shorter.length)
                {
                    if(i == longer.length - 1 || first == 0)
                        return true;
                    return false;
                }
            }
            i++;
        }

        return false;

    }
}