class Solution {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        // dp[i][j] = maximum dot product using nums1[0..i] and nums2[0..j]
        int[][] dp = new int[n][m];

        // Initialize dp array with very small values
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = Integer.MIN_VALUE;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                int product = nums1[i] * nums2[j];

                // Option 1: take current pair only
                dp[i][j] = product;

                // Option 2: extend previous subsequence
                if (i > 0 && j > 0) {
                    dp[i][j] = Math.max(dp[i][j],
                            product + Math.max(0, dp[i - 1][j - 1]));
                }

                // Option 3: skip nums1[i]
                if (i > 0) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j]);
                }

                // Option 4: skip nums2[j]
                if (j > 0) {
                    dp[i][j] = Math.max(dp[i][j], dp[i][j - 1]);
                }
            }
        }

        return dp[n - 1][m - 1];
    }
}
