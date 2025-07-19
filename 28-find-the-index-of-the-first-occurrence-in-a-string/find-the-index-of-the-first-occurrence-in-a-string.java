class Solution {
    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();
        for(int i = 0; i<= h-n; i++){
            if(haystack.substring(i, i+n).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}

//get the length of the needle and haystack
//take the substring of length and compare to needle
//if so, return the first occurence[index]
//else return -1