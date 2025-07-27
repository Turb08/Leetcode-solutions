class Solution {
    public String addBinary(String a, String b) {
        StringBuilder output = new StringBuilder();
        int i = a.length() -1;
        int j = b.length() -1;
        int carry = 0;

        while(i>=0 || j>=0 || carry> 0){
            int bit1 = (i>=0) ? a.charAt(i) - '0' : 0;
            int bit2 = (j>= 0) ? b.charAt(j) - '0' : 0;

            int sum = bit1 + bit2 + carry;
            output.append(sum%2);
            carry = sum/2;

            i--;
            j--;
        }
        return output.reverse().toString();
    }
}

//Initialize Stringbuilder
//set two variables and initialize last index of each string 
//Initialize a carry variable
//loop while all three variables are greater than 0
//add the bits of the relevant indexes and the carry
//add the sum to output
//set carry to sum/2
//move the indexed to left by 1
//while condition is not satisfied, reverse Strinbuilder and return as string 