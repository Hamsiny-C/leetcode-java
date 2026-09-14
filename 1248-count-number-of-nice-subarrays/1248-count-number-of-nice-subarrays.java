class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
         HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int count = 0;
        int ans = 0;

        for (int num : nums) {
            if (num % 2 == 1)
                count++;

            int need = count - k;

            if (map.containsKey(need))
                ans += map.get(need);

            map.put(count, map.getOrDefault(count, 0) + 1);
        }

        return ans;
    }
}