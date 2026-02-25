class Solution {
    public int[] sortByBits(int[] arr) {
        
        Integer[] nums = new Integer[arr.length];

        // convert int[] to Integer[]
        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }

        // sort using Comparator
        Arrays.sort(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {

                int countA = Integer.bitCount(a);
                int countB = Integer.bitCount(b);

                if (countA == countB) {
                    return a - b;   // normal ascending
                } else {
                    return countA - countB;  // by bit count
                }
            }
        });

        // convert back to int[]
        for (int i = 0; i < arr.length; i++) {
            arr[i] = nums[i];
        }

        return arr;
    }
}