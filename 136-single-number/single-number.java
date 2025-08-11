class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int x: nums) ans ^=x;
        return ans;
    }
}
//Use XOR to remove the pairs and return the single digit