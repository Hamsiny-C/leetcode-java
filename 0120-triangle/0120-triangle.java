class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int curr = triangle.get(i).get(j);
                int down = triangle.get(i + 1).get(j);
                int downRight = triangle.get(i + 1).get(j + 1);
                // Update current cell with min path sum
                triangle.get(i).set(j, curr + Math.min(down, downRight));
            }
        }
        return triangle.get(0).get(0);
    }
}