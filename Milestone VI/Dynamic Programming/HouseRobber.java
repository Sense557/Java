class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        // Only 1 house
        if (n == 1) {
            return nums[0];
        }

        int[] ans = new int[n];
        ans[0] = nums[0];
        ans[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            // Choose whether to rob the current house or not based on the maximum value
            ans[i] = Math.max(nums[i] + ans[i - 2], ans[i - 1]);
        }
        return ans[n - 1];
    }
}
