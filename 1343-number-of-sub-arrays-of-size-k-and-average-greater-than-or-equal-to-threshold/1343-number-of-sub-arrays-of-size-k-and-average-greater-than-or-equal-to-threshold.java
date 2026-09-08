class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int requiredSum = k * threshold;

        if (sum >= requiredSum) {
            count++;
        }

        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k];
            sum = sum + arr[i];

            if (sum >= requiredSum) {
                count++;
            }
        }

        return count;
    }
}