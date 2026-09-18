class Solution {
    public int maxSubarraySumCircular(int[] nums) {
       int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int maxSum = 0;
        int minSum = 0;
        int total = 0;

        for (int i = 0; i < nums.length; i++) {

            if (maxSum + nums[i] >= nums[i]) {
                maxSum += nums[i];
            } else {
                maxSum = nums[i];
            }

            if (minSum + nums[i] <= nums[i]) {
                minSum += nums[i];
            } else {
                minSum = nums[i];
            }

            max = Math.max(max, maxSum);
            min = Math.min(min, minSum);

            total += nums[i];
        }

        if (max < 0) {
            return max;
        }

        return Math.max(max, total - min);
    }
}