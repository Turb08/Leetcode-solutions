class Solution {
    public String intToRoman(int num) {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();
         for(int i = 0; i < values.length; i++){
             while(num>= values[i] ){
                 roman.append(symbol[i]);
                 num -= values[i];
             }
         }
        return roman.toString();        
    }
}

//two arrays, one for integer and another for symbols
//use Stringbuilder to get the final roman string
//use for loop and loop through each pair in descending order
//add the matching symbol
//reduce the value from the number.