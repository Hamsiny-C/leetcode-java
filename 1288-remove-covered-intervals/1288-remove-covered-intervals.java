class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
         for(int i=0;i<intervals.length;i++){
            for(int j=i+1;j<intervals.length;j++){
                if(intervals[i][0]>intervals[j][0] ||
                  (intervals[i][0]==intervals[j][0] &&
                   intervals[i][1]<intervals[j][1])){

                    int a=intervals[i][0];
                    intervals[i][0]=intervals[j][0];
                    intervals[j][0]=a;

                    a=intervals[i][1];
                    intervals[i][1]=intervals[j][1];
                    intervals[j][1]=a;
                }
            }
        }

        int count=intervals.length;
        int end=intervals[0][1];

        for(int i=1;i<intervals.length;i++){
            if(intervals[i][1]<=end)
                count--;
            else
                end=intervals[i][1];
        }

        return count;
    }
}