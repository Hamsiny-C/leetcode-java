class Solution {
    public int trap(int[] height) {
          int n=height.length;
        int lm=0,rm=0,w=0;
        int l=0,r=n-1;
        while(l<r){
            if(height[l]<height[r]){
                if(height[l]>=lm){
                    lm=height[l];
                }else{
                    w+=lm-height[l];
                }
                l++;
            }else{
                if(height[r]>=rm){
                    rm=height[r];
                }else{
                    w+=rm-height[r];
                }
                r--;
            }
        }
        return w;
    }
}