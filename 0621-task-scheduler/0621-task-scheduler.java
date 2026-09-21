class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];

        for (char ch : tasks) {
            count[ch - 'A']++;
        }

        int max = 0;

        for (int x : count) {
            max = Math.max(max, x);
        }

        int maxCount = 0;

        for (int x : count) {
            if (x == max) {
                maxCount++;
            }
        }

        int result = (max - 1) * (n + 1) + maxCount;

        return Math.max(result, tasks.length);
    }
}