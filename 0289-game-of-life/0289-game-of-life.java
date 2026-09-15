class Solution {
    public void gameOfLife(int[][] board) {
         int rows = board.length;
        int cols = board[0].length;

        int[][] copy = new int[rows][cols];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                copy[i][j] = board[i][j];
            }
        }

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {

                int count = 0;

                for(int x = i - 1; x <= i + 1; x++) {
                    for(int y = j - 1; y <= j + 1; y++) {

                        if(x >= 0 && x < rows && y >= 0 && y < cols) {
                            if(x != i || y != j) {
                                count = count + copy[x][y];
                            }
                        }
                    }
                }

                if(copy[i][j] == 1) {
                    if(count < 2 || count > 3) {
                        board[i][j] = 0;
                    }
                }
                else {
                    if(count == 3) {
                        board[i][j] = 1;
                    }
                }
            }
        }
    }
}