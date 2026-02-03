class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;

        int i = 0;

        // 1️⃣ FIRST UP (increasing)
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }

        // if no increasing happened
        if (i == 0) return false;

        // 2️⃣ DOWN (decreasing)
        while (i + 1 < n && nums[i] > nums[i + 1]) {
            i++;
        }

        // if no second UP part exists
        if (i == n - 1) return false;

        // 3️⃣ SECOND UP (increasing again)
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }

       
        return i == n - 1;
    }
}
