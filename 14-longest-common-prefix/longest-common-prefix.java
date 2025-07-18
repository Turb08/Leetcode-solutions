class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";

        String prefix = strs[0];
        for(int i = 1; i<strs.length; i++){
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length() -1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}

//if no string available, return empty
// set prefix as the first String
//check if the prefix is present in the next strings
// if not, reduce the prefix till there is no more.
// and return the prefix