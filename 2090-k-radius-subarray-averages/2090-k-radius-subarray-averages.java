class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];
        long sum = 0;
        int size = 2 * k + 1;
        Arrays.fill(ans, -1);
        if (size > n) {
            return ans;
        }
        for (int i = 0; i < size; i++) {
            sum += nums[i];
        }
        ans[k] = (int)(sum / size);
        for (int i = size; i < n; i++) {
            sum -= nums[i - size];
            sum += nums[i];
            ans[i - k] = (int)(sum / size);
        }
        return ans;
    }
}