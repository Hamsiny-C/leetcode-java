class Solution {
    public void setZeroes(int[][] matrix) {
    int rowsize=matrix.length;
    int colsize=matrix[0].length;
    boolean row[]=new boolean[rowsize];
    boolean col[]=new boolean[colsize];
    for(int i=0;i<rowsize;i++){
        for(int j=0;j<colsize;j++){
            if(matrix[i][j]==0){
                row[i]=true;
                col[j]=true;
            }
        }
    }
    for(int i=0;i<rowsize;i++){
       for(int j=0;j<colsize;j++){
        if(row[i]||col[j]){
            matrix[i][j]=0;
        }
       }
    }
    }
}