class Solution {
    public void moveZeroes(int[] nums) {
        int ip = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[ip++] = num;
            }
        }

        while (ip < nums.length) {
            nums[ip++] = 0;
        }
    }
}