class Solution {
    public int climbStairs(int n) {
        if (n==1) return 1;
        if (n==2) return 2;

        int first = 1;
        int second = 2;
        int curr = 0;

        for(int i=3; i<=n; i++){
            curr = first + second;
            first = second;
            second = curr;
        }
        return second;
    }
}

// if n is equal to 1 or 2, return that value
// set two variables to hold way to climb
// loop from 3 to n and calc the curr number of ways
// update the two variables