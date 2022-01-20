class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        int n = digits.length;
        int[] result = new int[n + 1];
        result[0] = 1;
        int i = n - 1;
        do{
            if(i < 0 && carry == 1){
                for (int j = 0; j < i; j++) {
                    result[j + 1] = digits[j];
                }
                return result;
            }
            digits[i] += 1;
            if((digits[i]) > 9){
                digits[i] = 0;
                carry = 1;
            }else carry = 0;
            i--;
        }while(carry != 0);
        return digits;
    }
}