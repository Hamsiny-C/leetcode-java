class Solution {
    public int maxProduct(int[] nums) {
        int maxproduct=nums[0];
        int minproduct=nums[0];
        int result=nums[0];
        for(int i=1;i<nums.length;i++){
            int current=nums[i];
            int oldmax=maxproduct;
            int oldmin=minproduct;
            maxproduct=Math.max(current,Math.max(oldmax*current,oldmin*current));
            minproduct=Math.min(current,Math.min(oldmax*current,oldmin*current));
            result=Math.max(result,maxproduct);
        }
        return result;
    }
}