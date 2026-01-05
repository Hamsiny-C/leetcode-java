class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum=0;
        int abs=Integer.MAX_VALUE;
        int neg=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                int val=matrix[i][j];
                sum+=Math.abs(val);
                if(val<0){
                    neg++;
                    }
                    abs=Math.min(abs,Math.abs(val));
            }
        }
        if(neg%2==0){
            return sum;
        }
        else{
            return sum- 2*abs;
        }
    }
}