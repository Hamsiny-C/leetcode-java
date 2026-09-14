class Solution {
    public int minSubarray(int[] nums, int p) {
       long total = 0;

        for (int num : nums) {
            total = total + num;
        }

        int need = (int)(total % p);

        if (need == 0) {
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        long prefix = 0;
        int min = nums.length;

        for (int i = 0; i < nums.length; i++) {

            prefix = prefix + nums[i];

            int current = (int)(prefix % p);

            int required = (current - need + p) % p;

            if (map.containsKey(required)) {
                int start = map.get(required);
                min = Math.min(min, i - start);
            }

            map.put(current, i);
        }

        return min == nums.length ? -1 : min;
    }
}