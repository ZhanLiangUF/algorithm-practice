class Solution {
    public int search(int[] nums, int target) {
        int i = 0;
        int l = nums.length-1;
        while (i <= l) {
            int m =  i + (l-i)/2;
            if (nums[m] == target) {
                return m;
            } else if (nums[m] > target) {
                l = m-1;
            } else {
                i = m+1;
            }
        }
        return -1;
    }
}