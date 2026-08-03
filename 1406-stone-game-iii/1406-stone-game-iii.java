class Solution {
    public String stoneGameIII(int[] stoneValue) {

        int n = stoneValue.length;

        // dp[i] = maximum score difference
        // the current player can achieve
        // starting from index i
        int[] dp = new int[n + 3];

        for (int i = n - 1; i >= 0; i--) {

            // Take 1 stone
            int take1 = stoneValue[i] - dp[i + 1];

            // Take 2 stones
            int take2 = Integer.MIN_VALUE;
            if (i + 1 < n) {
                take2 = stoneValue[i]
                      + stoneValue[i + 1]
                      - dp[i + 2];
            }

            // Take 3 stones
            int take3 = Integer.MIN_VALUE;
            if (i + 2 < n) {
                take3 = stoneValue[i]
                      + stoneValue[i + 1]
                      + stoneValue[i + 2]
                      - dp[i + 3];
            }

            // Choose the best option
            dp[i] = Math.max(take1, Math.max(take2, take3));
        }

        // Check who has the advantage
        if (dp[0] > 0) {
            return "Alice";
        } 
        else if (dp[0] < 0) {
            return "Bob";
        } 
        else {
            return "Tie";
        }
    }
}