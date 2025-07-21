class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;

        while(left<=right){
            int mid = left + (right - left) /2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return left;
    }
}

//use binary search for o(log n) time complexity
// use while loop to run when left is lesser than right
// if mid is found, return index
//if mid is less than target, increase left by 1
// else remove right by 1
// and return the position where target should be inserted if not found