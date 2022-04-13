class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int[] result = new int[2];
        result[0] = binarySearchLeft(nums, target);
        result[1] = binarySearchRight(nums, target);
        return result;
    }
 
    public int binarySearchLeft(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int result = -1;
        while (left <= right) { // terminating condition
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid+1;
            } else if (nums[mid] > target) {
                right = mid-1;
            } else if (nums[mid] == target) {
                // if we encounter mid, push for the left most index by decreasing right bound
                result = mid;
                right = mid-1;
            } 
        }
        return result;
    }    
    
    public int binarySearchRight(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int result = -1;        
        while (left <= right) { // terminating condition
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid+1;
            } else if (nums[mid] > target) {
                right = mid-1;
            }  else if (nums[mid] == target) {
                // if we encounter mid, push for the right most index by increasing left bound
                result = mid;
                left = mid+1;
            } 
        }
        return result;
    }
}