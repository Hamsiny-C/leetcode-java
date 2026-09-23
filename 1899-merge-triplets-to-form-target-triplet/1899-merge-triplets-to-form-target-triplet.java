class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean one = false;
        boolean second = false;
        boolean third = false;

        for (int i = 0; i < triplets.length; i++) {
            if (triplets[i][0] > target[0] || triplets[i][1] > target[1] || triplets[i][2] > target[2]) {
                continue;
            }

            if (triplets[i][0] == target[0]) {
                one = true;
            }

            if (triplets[i][1] == target[1]) {
                second = true;
            }

            if (triplets[i][2] == target[2]) {
                third = true;
            }
        }

        return one && second && third;
    }
}