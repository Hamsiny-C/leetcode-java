class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
         HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;
        int ans = 0;

        for (int num : nums) {
            sum += num;

            int need = sum - goal;

            if (map.containsKey(need))
                ans += map.get(need);

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return ans;
    }
}