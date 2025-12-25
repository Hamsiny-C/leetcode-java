class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);   // step 1: sort
        long sum = 0;

        for (int i = 0; i < k; i++) {
            int value = happiness[happiness.length - 1 - i] - i;
            if (value > 0) {
                sum += value;
            }
        }
        return sum;
    }
}
