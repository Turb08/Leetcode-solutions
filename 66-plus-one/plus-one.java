class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length -1 ; i>=0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            else digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}

//loop from right to left
//if the digit is less than 9, increment by 1, if not return the array
//if the digit is 9, set it to zero and increment the next left digit by 1
//if all digits are 9, create a new array and set the first index as 1
//return the new array