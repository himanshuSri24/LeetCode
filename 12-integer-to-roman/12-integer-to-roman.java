class Solution {
    public String intToRoman(int num) {
        StringBuilder ans = new StringBuilder("");
        if(num >= 1000){
        int thousands = num / 1000;
        while(thousands-- > 0)
        {
            ans.append("M");
        }
        num%=1000;
        }
        if(num >= 100){
        int hundreds = num / 100;
        int remainingHundreds = hundreds;
        if(hundreds == 9)
        {
            remainingHundreds = 0;
            ans.append("CM");
        }
        else if(hundreds >= 5)
        {
            remainingHundreds = hundreds - 5;
            ans.append("D");
        }
        if(remainingHundreds == 4)
            ans.append("CD");
        else
        {
            while(remainingHundreds-- > 0)
                ans.append("C");
        }
        num %= 100;
        }
        if(num >= 10){
        int tens = num/10;
        int remainingTens = tens;
        if(tens == 9)
        {
            remainingTens = 0;
            ans.append("XC");
        }
        else if(tens >= 5)
        {
            remainingTens = tens - 5;
            ans.append("L");
        }
        if(remainingTens == 4)
            ans.append("XL");
        else
        {
            while(remainingTens-- > 0)
                ans.append("X");
        }
        num %= 10;
        }
        if(num > 0){
        int ones = num%10;
        int remainingOnes = ones;
        if(ones == 9)
        {
            remainingOnes = 0;
            ans.append("IX");
        }
        else if(ones >= 5)
        {
            remainingOnes = ones - 5;
            ans.append("V");
        }
        if(remainingOnes == 4)
            ans.append("IV");
        else
        {
            while(remainingOnes-- > 0)
                ans.append("I");
        }
        }
        return ans.toString();
    }
}