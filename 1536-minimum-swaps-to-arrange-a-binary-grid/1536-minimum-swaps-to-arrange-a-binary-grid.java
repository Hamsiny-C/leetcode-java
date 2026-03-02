class Solution {
    public int minSwaps(int[][] grid) {
         int n = grid.length;
        int[] trailingZeros = new int[n];

       
        for (int i = 0; i < n; i++) {
            trailingZeros[i] = countTrailingZeros(grid[i]);
        }

        int steps = 0;

        
        for (int i = 0; i < n; i++) {
            int requiredZeros = n - i - 1;
            int j = i;

          
            while (j < n && trailingZeros[j] < requiredZeros) {
                j++;
            }

            if (j == n) {
                return -1; // impossible to make the grid valid
            }

            // Step 3: Swap the row up to position i
            while (j > i) {
                int temp = trailingZeros[j];
                trailingZeros[j] = trailingZeros[j - 1];
                trailingZeros[j - 1] = temp;
                j--;
                steps++;
            }
        }

        return steps;
    }

    // Helper function to count trailing zeros in a row
    private int countTrailingZeros(int[] row) {
        int count = 0;
        for (int i = row.length - 1; i >= 0; i--) {
            if (row[i] == 0) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

   
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] grid1 = {{0,0,1},{1,1,0},{1,0,0}};
        System.out.println(sol.minSwaps(grid1)); // Output: 3

        int[][] grid2 = {{0,1,1,0},{0,1,1,0},{0,1,1,0},{0,1,1,0}};
        System.out.println(sol.minSwaps(grid2)); // Output: -1

        int[][] grid3 = {{1,0,0},{1,1,0},{1,1,1}};
        System.out.println(sol.minSwaps(grid3));
    }
}