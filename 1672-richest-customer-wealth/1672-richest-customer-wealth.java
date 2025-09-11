class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++)
        {
             int row_sum=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                 row_sum+=accounts[i][j];
            }
            if(row_sum>max)
            {
                max=row_sum;
            }
        }
        return max;
    }
}