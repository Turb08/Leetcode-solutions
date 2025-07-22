class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() -1;
        while(i>=0 && s.charAt(i) == ' '){
            i--;
        }
        while(i>=0 && s.charAt(i) != ' '){
            length++;
            i--;
        }
        return length;
    }
}
//Loop from the end of the string
// Skip spaces
// Count characters of the last word until a space
// return length